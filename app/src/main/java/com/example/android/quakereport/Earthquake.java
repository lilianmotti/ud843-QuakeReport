package com.example.android.quakereport;

/**
 * Earthquakes is a java class that holds all the variables for an earthquake
 * Each object has: magnitude, location and date
 */

public class Earthquake {

    /*
     *private variables global
     */
    private double mMagnitude;
    private String mLocation;
    private long mTimeInMs;
    private String mUrl;

    /*
     *public constructor
     */
    public Earthquake(double magnitude, String location, long timeInMs, String url){
        mMagnitude = magnitude;
        mLocation=location;
        mTimeInMs=timeInMs;
        mUrl=url;
    }

    /*
     *public getter methods
     */

    public double getmMagnitude() {
        return mMagnitude;
    }

    public String getmLocation() {
        return mLocation;
    }

    public long getmTimeInMs() {
        return mTimeInMs;
    }

    public String getmUrl() {
        return mUrl;
    }
}
