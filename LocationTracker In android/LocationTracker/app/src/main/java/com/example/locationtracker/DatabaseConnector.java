package com.example.locationtracker;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteDatabase.CursorFactory;

import java.util.ArrayList;

public class DatabaseConnector {
    // database name
    private static final String DATABASE_NAME = "UserLocations";
    private SQLiteDatabase database; // TS: to run SQL commands
    private DatabaseOpenHelper databaseOpenHelper; // TS: create or open the database

    // public constructor for DatabaseConnector
    public DatabaseConnector(Context context) {
        // create a new DatabaseOpenHelper
        databaseOpenHelper =
                new DatabaseOpenHelper(context, DATABASE_NAME, null, 1);
    } // end DatabaseConnector constructor

    // open the database connection
    public void open() throws SQLException {
        // create or open a database for reading/writing
        database = databaseOpenHelper.getWritableDatabase();//TS: at the first call, onCreate is called
    }

    // close the database connection
    public void close() {
        if (database != null)
            database.close(); // close the database connection
    }
    //////////////////////////////////////////////////////////////////////////////////////////////////
    //CREATE YOUR TABLE CALLED contacts
    private class DatabaseOpenHelper extends SQLiteOpenHelper {
        // public constructor
        public DatabaseOpenHelper(Context context, String name,
                                  CursorFactory factory, int version) {
            super(context, name, factory, version);
        }

        // creates the contacts table when the database is created
        // TS: this is called from  open()->getWritableDatabase(). Only if the database does not exist
        @Override
        public void onCreate(SQLiteDatabase db) {
            // query to create a new table named contacts
            String createQuery = "CREATE TABLE locations" +
                    "(_id integer primary key autoincrement," +
                    "name TEXT, longitude TEXT, latitude TEXT," +
                    "speed TEXT, time TEXT);";

            db.execSQL(createQuery); // execute the query
        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion,
                              int newVersion) {
        }
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////


    // return a Cursor with all contact information in the database
    public Cursor getAllContacts() {
        //return database.query("contacts", new String[] {"_id", "name"},
        //	         null, null, null, null, "name"/*order by*/);
        return database.query("locations", new String[]{"_id", "name", "longitude", "latitude"},
                null, null, null, null, "name"/*order by*/);
    }

    // get a Cursor containing all information about the contact specified
    // by the given id
    public Cursor getOneContact(long id) {

        return database.query("locations", null/*get all fields*/,
                "_id=" + id /*selection*/, null, null, null, null);

        //TS: OR
        //return database.rawQuery("SELECT * FROM contacts WHERE _id = " + String.valueOf(id)  , null);

    }

    /////////////////////////////////////////////////////////////////////////////////////////////////
    // inserts a new contact in the database
    public void insertContact(String name, String longitude, String latitude,
                              String speed, String time) {
        ContentValues newContact = new ContentValues();
        newContact.put("name", name);
        newContact.put("longitude", longitude);
        newContact.put("latitude", latitude);
        newContact.put("speed", speed);
        newContact.put("time", time);

        open(); // open the database
        database.insert("locations", null, newContact);
        close(); // close the database
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////

    // inserts a new contact in the database
    public void updateContact(long id, String name, String longitude,
                              String latitude, String speed, String time) {
        ContentValues editContact = new ContentValues();
        editContact.put("name", name);
        editContact.put("longitude", longitude);
        editContact.put("latitude", latitude);
        editContact.put("speed", speed);
        editContact.put("time", time);

        open(); // open the database
        database.update("locations", editContact, "_id=" + id, null);
        close(); // close the database
    }


    // delete the contact specified by the given String name
    public void deleteContact(long id) {
        open();
        database.delete("locations", "_id=" + id, null);
        /*OR*/ //database.delete("contacts", "_id = ?", new String[] {String.valueOf(id)});
        close();
    }


    //--TS: function that gets a database cursor and returns an array list of contacts
    public ArrayList<String> getAllContactsInAListOfStrings()
    {
        String rst = "";
        ArrayList<String> listOfContacts = new ArrayList<String>();

        open();
        Cursor c = database.query("locations", null,null, null, null, null, "name"/*order by*/);

        if (c.moveToFirst()){
            do{

                rst += c.getString(1)+"\n";//name
                rst += c.getString(2)+"\n";//longitude
                rst += c.getString(3)+"\n";//latitude
                rst += c.getString(4)+"\n";//speed
                rst += c.getString(5)+"\n";//time
                rst += "--------------------\n";
                listOfContacts.add(rst);
                rst = "";

            }while(c.moveToNext());
        }

        close();
        return listOfContacts;
    }


}
