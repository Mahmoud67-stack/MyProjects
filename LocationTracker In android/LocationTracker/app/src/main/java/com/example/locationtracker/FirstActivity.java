package com.example.locationtracker;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.locationtracker.Model.User;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class FirstActivity extends AppCompatActivity {


    TextView tvWelcome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        tvWelcome = findViewById(R.id.tvwelcome);
        // get the intent
        Intent intent = getIntent();

// get data from the intent
        String name = intent.getStringExtra("name");
        tvWelcome.setText("Welcome "+ name);

        Button goToMap =
                (Button) findViewById(R.id.trackbtn);
        goToMap.setOnClickListener(viewMapButtonClicked);


    }


    View.OnClickListener viewMapButtonClicked = new View.OnClickListener()
    {
        @Override
        public void onClick(View v)
        {
            Intent goToMapIntent =
                    new Intent(FirstActivity.this, MapsActivity.class);
            startActivity(goToMapIntent); // start the AddEditContact Activity
        } // end method onClick
    };

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.userviewmenu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    // handle choice from options menu
    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        // create a new Intent to launch the AddEditContact Activity
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.goHome) {
            Intent addNewContact =
                    new Intent(FirstActivity.this, UsersView.class);
            startActivity(addNewContact); // start the AddEditContact Activity
            return true;
        }
        return super.onOptionsItemSelected(item); // call super's method

    }


}