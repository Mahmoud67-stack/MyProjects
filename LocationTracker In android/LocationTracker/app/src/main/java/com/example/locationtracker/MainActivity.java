package com.example.locationtracker;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.app.Activity;
import android.content.ContentProvider;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.locationtracker.Model.User;
import com.example.locationtracker.Utils.Common;
import com.firebase.ui.auth.AuthUI;
import com.firebase.ui.auth.IdpResponse;
import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.messaging.FirebaseMessaging;
import com.karumi.dexter.Dexter;
import com.karumi.dexter.PermissionToken;
import com.karumi.dexter.listener.PermissionDeniedResponse;
import com.karumi.dexter.listener.PermissionGrantedResponse;
import com.karumi.dexter.listener.PermissionRequest;
import com.karumi.dexter.listener.single.PermissionListener;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import io.paperdb.Paper;

public class MainActivity extends Activity implements LocationListener{
    private long rowID;
    private EditText name;
    private String fname = "";
    DatabaseReference user_information;
    protected LocationManager locationManager;
    protected LocationListener locationListener;
    protected double latitude, longitude, speed;
    protected String time;
    protected boolean gps_enabled, network_enabled;
    private static final int MY_REQUEST_CODE = 3333;
    List<AuthUI.IdpConfig> providers;
    int n_users = 0;
    private FusedLocationProviderClient fusedLocationClient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fusedLocationClient = LocationServices.getFusedLocationProviderClient(this);
        name = (EditText) findViewById(R.id.etName);
        Button submitBtn = (Button) findViewById(R.id.submitbtn);

        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String n = String.valueOf(name.getText());

                if(n.equals(""))
                {
                    Toast.makeText(getApplicationContext(), "Please enter your name to proceed", Toast.LENGTH_SHORT).show();
                }

                else{

                    fname = n;
                    Toast.makeText(getApplicationContext(), "Hello "+fname, Toast.LENGTH_SHORT).show();
                    showSignInOptions();
                }

            }
        });
        fusedLocationClient = LocationServices.getFusedLocationProviderClient(this);


        Paper.init(this);
        //initialize firebase
        user_information = FirebaseDatabase.getInstance().getReference(Common.USER_INFORMATION);

        //saveContact(FirebaseAuth.getInstance().getCurrentUser(), false);
        //Init providers
        providers = Arrays.asList(
                new AuthUI.IdpConfig.EmailBuilder().build(),
                new AuthUI.IdpConfig.GoogleBuilder().build()
        );


        //Request permission location

        Dexter.withContext(this).withPermission(Manifest.permission.ACCESS_FINE_LOCATION).withListener(new PermissionListener() {
            @Override
            public void onPermissionGranted(PermissionGrantedResponse permissionGrantedResponse) {
                Toast.makeText(getApplicationContext(), "Permission Granted", Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onPermissionDenied(PermissionDeniedResponse permissionDeniedResponse) {
                Toast.makeText(getApplicationContext(), "You must accept permission to enter the app", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onPermissionRationaleShouldBeShown(PermissionRequest permissionRequest, PermissionToken permissionToken) {

            }
        }).check();
    }

    @Override
    protected void onResume() {
        Update();
        super.onResume();
    }

    private void showSignInOptions() {
        startActivityForResult(
                AuthUI.getInstance()
                        .createSignInIntentBuilder().
                        setAvailableProviders(providers).
                        build(),
                MY_REQUEST_CODE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == MY_REQUEST_CODE) {
            IdpResponse response = IdpResponse.fromResultIntent(data);
            FirebaseUser firebaseUser = FirebaseAuth.getInstance().getCurrentUser();

            //Check if user exists on Database
            if (firebaseUser != null) {
                final boolean[] exists = {false};
                user_information.orderByKey()
                        .equalTo(firebaseUser.getUid())
                        .addListenerForSingleValueEvent(new ValueEventListener() {
                            @Override
                            public void onDataChange(@NonNull DataSnapshot snapshot) {
                                if (snapshot.getValue() == null) //if user exists
                                {
                                    if (snapshot.child(firebaseUser.getUid()).exists()) {
                                        Common.loggedUser = new User(firebaseUser.getUid(), fname, longitude, latitude, speed, time);
                                        Log.d("TAG", Common.loggedUser.getName());
                                        //Add to database
                                        user_information.child(Common.loggedUser.getUid())
                                                .setValue(Common.loggedUser);
                                        exists[0] = true;

                                    } else // if user doesn't exist
                                    {
                                        Common.loggedUser = snapshot.child(firebaseUser.getUid()).getValue(User.class);
                                        n_users++;
                                    }

                                    updateToken(firebaseUser);
                                    saveContact(firebaseUser, exists[0]);

                                }
                            }

                            @Override
                            public void onCancelled(@NonNull DatabaseError error) {

                            }
                        });
            }
            setUpUI();
        }
    }


    private void setUpUI() {
        //Navigate to Maps
        Intent intent = new Intent(MainActivity.this, FirstActivity.class);
        intent.putExtra("name", fname);
        startActivity(intent);
        finish();
    }
    private void saveContact(FirebaseUser firebaseUser, boolean exists)
    {
        // get DatabaseConnector to interact with the SQLite database
        DatabaseConnector databaseConnector = new DatabaseConnector(this);

        if (!exists) // then insert
        {
            // insert the contact information into the database
            databaseConnector.insertContact(
                    fname,
                    String.valueOf(longitude),
                    String.valueOf(latitude),
                    String.valueOf(speed),
                    time);
        }
        else //then update
        {
            databaseConnector.updateContact(rowID,
                    fname,
                    String.valueOf(longitude),
                    String.valueOf(latitude),
                    String.valueOf(speed),
                    time);
        }
    }
    private void updateToken(FirebaseUser firebaseUser) {

        //Get Token
        FirebaseMessaging.getInstance().getToken().addOnSuccessListener(new OnSuccessListener<String>() {
            @Override
            public void onSuccess(String s) {
                user_information.child(firebaseUser.getUid()).
                        child("name").setValue(fname);
                user_information.child(firebaseUser.getUid()).
                        child("Uid").setValue(firebaseUser.getUid());
                user_information.child(firebaseUser.getUid()).
                        child("time").setValue(time);
                user_information.child(firebaseUser.getUid()).
                        child("longitude").setValue(longitude);
                user_information.child(firebaseUser.getUid()).
                        child("latitude").setValue(latitude);
                user_information.child(firebaseUser.getUid()).
                        child("speed").setValue(speed);
                //Toast.makeText(getApplicationContext(), "Hello "+firebaseUser.getDisplayName(),Toast.LENGTH_SHORT).show();
            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Toast.makeText(getApplicationContext(), "" + e.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public void onLocationChanged(@NonNull Location location) {
        longitude = location.getLongitude();
        latitude = location.getLatitude();
        speed = location.getSpeed();
        Date timeD = new Date(location.getTime() * 1000);
        SimpleDateFormat sdf = new SimpleDateFormat("E, HH:mm a");
        String Time = sdf.format(timeD);
        time = Time;
    }

    private void Update() {
        Toast.makeText(getApplicationContext(),String.valueOf(longitude), Toast.LENGTH_SHORT).show();
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                MainActivity.this.runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        if (ActivityCompat.checkSelfPermission(getApplicationContext(), Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(getApplicationContext(), Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
                            // TODO: Consider calling
                            //    ActivityCompat#requestPermissions
                            // here to request the missing permissions, and then overriding
                            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                            //                                          int[] grantResults)
                            // to handle the case where the user grants the permission. See the documentation
                            // for ActivityCompat#requestPermissions for more details.
                            return;
                        }
                        fusedLocationClient.getLastLocation()
                                .addOnSuccessListener(MainActivity.this, new OnSuccessListener<Location>() {
                                    @Override
                                    public void onSuccess(Location location) {
                                        // Got last known location. In some rare situations this can be null.
                                        if (location != null) {
                                            longitude = location.getLongitude();
                                            latitude = location.getLatitude();
                                            speed = location.getSpeed();
                                            Date timeD = new Date(location.getTime() * 1000);
                                            SimpleDateFormat sdf = new SimpleDateFormat("E, HH:mm a");

                                            String Time = sdf.format(timeD);
                                            time = Time;
                                        }
                                    }
                                });

                    }
                });
            }


        };
        timer.schedule(task, 5000); //every 5 seconds update
    }

}