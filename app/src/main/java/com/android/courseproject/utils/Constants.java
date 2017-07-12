package com.android.courseproject.utils;

import com.google.android.gms.maps.model.LatLng;

import java.util.HashMap;

/**
 * Created by User
 */

public final class Constants {

    public static final long GEOFENCE_EXPIRATION_IN_MILLISECONDS = 12 * 60 * 60 * 1000;
    public static final float GEOFENCE_RADIUS_IN_METERS = 100;
    public static final int MY_PERMISSIONS_REQUEST_ACCESS_FINE_LOCATION = 100;
    public static final int MY_PERMISSIONS_REQUEST_INTERNET = 200;
    public static final int MY_PERMISSIONS_REQUEST_ACCESS_NETWORK_STATE = 300;
    public static final int MY_PERMISSIONS_REQUEST_WRITE_EXTERNAL_STORAGE = 400;
    public static final int MY_PERMISSIONS_REQUEST_ACCESS_COARSE_LOCATION = 500;

    private static final String PACKAGE_NAME = "com.android.courseproject";
    public static final String GEOFENCES_ADDED_KEY = PACKAGE_NAME + ".GEOFENCES_ADDED_KEY";

    public static final HashMap<String, LatLng> LANDMARKS = new HashMap<String, LatLng>();
    static {

        // Innopolis University
        LANDMARKS.put("Innopolis University", new LatLng(55.753168,48.743728));

    }
}
