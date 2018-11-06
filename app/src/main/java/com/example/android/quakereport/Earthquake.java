package com.example.android.quakereport;

/**
 * Earthquakes is a java class that holds all the variables for an earthquake
 * Each object has: magnitude, location and date
 */

public class Earthquake {

    /*
     *private variables global
     */
    private String mMagnitude;
    private String mLocation;
    private String mTimeInMs;
    private String mUrl;

    /*
     *public constructor
     */
    public Earthquake(String magnitude, String location, String timeInMs, String url){
        mMagnitude = magnitude;
        mLocation=location;
        mTimeInMs=timeInMs;
        mUrl=url;
    }

    /*
     *public getter methods
     */

    public String getmMagnitude() {
        return mMagnitude;
    }

    public String getmLocation() {
        return mLocation;
    }

    public String getmTimeInMs() {
        return mTimeInMs;
    }

    public String getmUrl() {
        return mUrl;
    }
}
