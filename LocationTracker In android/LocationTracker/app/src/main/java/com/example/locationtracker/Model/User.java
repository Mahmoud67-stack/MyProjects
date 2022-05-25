package com.example.locationtracker.Model;

public class User {
    private String uid, name;
    private double longitude, latitude, speed;
    private String time;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public User() {
        uid = "";
        name = "";
        longitude = 0;
        latitude = 0;
        speed = 0;
        time = "";

    }
    public String getUid() {
        return uid;
    }

    public User(String uid, String name, double longtitude, double latitude, double speed, String time) {
        this.uid = uid;
        this.name = name;
        this.latitude = latitude;
        this.longitude = longtitude;
        this.time = time;
        this.speed = speed;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
