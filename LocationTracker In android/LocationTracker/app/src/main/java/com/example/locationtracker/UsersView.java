package com.example.locationtracker;import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Toast;

import com.example.locationtracker.Model.User;
import com.example.locationtracker.Utils.Common;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class UsersView extends Activity {

    RecyclerView recyclerView;
    DatabaseReference database;

    MyAdapter myAdapter;
    ArrayList<User> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_users_view);

        recyclerView = findViewById(R.id.recyclerView);
        database = FirebaseDatabase.getInstance().getReference(Common.USER_INFORMATION);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        list = new ArrayList<>();
        myAdapter = new MyAdapter(this,list);
        recyclerView.setAdapter(myAdapter);

        database.addValueEventListener(new ValueEventListener() {
            @SuppressLint("NotifyDataSetChanged")
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {

                for (DataSnapshot dataSnapshot : snapshot.getChildren()){

                    User user = dataSnapshot.getValue(User.class);
                    list.add(user);


                }
                myAdapter.notifyDataSetChanged();

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

    }
    /*@Override
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
        if (id == R.id.home) {
            Intent addNewContact =
                    new Intent(UsersView.this, FirstActivity.class);
            startActivity(addNewContact); // start the AddEditContact Activity
            return true;
        }
        return super.onOptionsItemSelected(item); // call super's method

    }*/
//    private void deleteContact()
//    {
//        // create a new AlertDialog Builder
//        AlertDialog.Builder builder =
//                new AlertDialog.Builder(this); //TS: U21: getApplicationContext caused an error here!
//
//        builder.setTitle("Are you sure you want to delete?"); // title bar string
//        builder.setMessage("This will permanently delete the user"); // message to display
//
//        // provide an OK button that simply dismisses the dialog
//        builder.setPositiveButton("Delete",
//                new DialogInterface.OnClickListener()
//                {
//                    @Override
//                    public void onClick(DialogInterface dialog, int button)
//                    {
//                        Toast.makeText(getApplicationContext(), "Hello", Toast.LENGTH_SHORT).show();
//                    }
//                }
//        );
//
//        builder.setNegativeButton("Cancel", null);
//        builder.show(); // display the Dialog
//    }

}