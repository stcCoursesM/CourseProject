package com.android.courseproject.utils;

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.support.design.widget.Snackbar;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.android.courseproject.R;

/**
 * Created by User
 */

public class PermissionChecker extends AppCompatActivity {


    public boolean permissionFineLocation(Context context)
    {
        return ContextCompat.checkSelfPermission(context,
                android.Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED;
    }

    public boolean permissionInternet(Context context)
    {
        return ContextCompat.checkSelfPermission(context,
                android.Manifest.permission.INTERNET) == PackageManager.PERMISSION_GRANTED;
    }

    public boolean permissionNetworkState(Context context)
    {
        return ContextCompat.checkSelfPermission(context,
                android.Manifest.permission.ACCESS_NETWORK_STATE) == PackageManager.PERMISSION_GRANTED;
    }

    public boolean permissionWriteExternal(Context context)
    {
        return ContextCompat.checkSelfPermission(context,
                android.Manifest.permission.WRITE_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED;
    }

    public boolean permissionCoarseLocation(Context context)
    {
        return ContextCompat.checkSelfPermission(context,
                android.Manifest.permission.ACCESS_COARSE_LOCATION) == PackageManager.PERMISSION_GRANTED;
    }

    public boolean permissionAll(Context context){
        return (permissionCoarseLocation(context) && permissionFineLocation(context) &&
        permissionInternet(context) && permissionNetworkState(context) && permissionWriteExternal(context));
    }

    public void requestAll(Context context){
        requestCoarseLocation(context);
        requestFineLocation(context);
        requestInternet(context);
        requestNetworkState(context);
        requestWriteExternal(context);
    }

    public void requestFineLocation (final Context context){

        final String TAG = context.getClass().getName();
        final int REQUEST_PERMISSIONS_REQUEST_CODE = 34;

        boolean shouldProvideRationale =
                ActivityCompat.shouldShowRequestPermissionRationale((Activity) context,
                        Manifest.permission.ACCESS_FINE_LOCATION);
        if(shouldProvideRationale){
            Log.i(TAG, "Displaying ACCESS_FINE_LOCATION permission rationale to provide additional context.");
            showSnackbar(R.string.permission_rationale, android.R.string.ok,
                    new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            // Request permission
                            ActivityCompat.requestPermissions((Activity) context,
                                    new String[]{Manifest.permission.ACCESS_FINE_LOCATION},
                                    REQUEST_PERMISSIONS_REQUEST_CODE);
                        }
                    });
        } else {
            Log.i(TAG, "Requesting ACCESS_FINE_LOCATION permission");
            // Request permission. It's possible this can be auto answered if device policy
            // sets the permission in a given state or the user denied the permission
            // previously and checked "Never ask again".
            ActivityCompat.requestPermissions((Activity) context,
                    new String[]{Manifest.permission.ACCESS_FINE_LOCATION},
                    REQUEST_PERMISSIONS_REQUEST_CODE);
        }

    }

    public void requestInternet (final Context context){

        final String TAG = context.getClass().getName();
        final int REQUEST_PERMISSIONS_REQUEST_CODE = 34;

        boolean shouldProvideRationale =
                ActivityCompat.shouldShowRequestPermissionRationale((Activity) context,
                        Manifest.permission.INTERNET);
        if(shouldProvideRationale){
            Log.i(TAG, "Displaying INTERNET permission rationale to provide additional context.");
            showSnackbar(R.string.permission_rationale, android.R.string.ok,
                    new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            // Request permission
                            ActivityCompat.requestPermissions((Activity) context,
                                    new String[]{Manifest.permission.INTERNET},
                                    REQUEST_PERMISSIONS_REQUEST_CODE);
                        }
                    });
        } else {
            Log.i(TAG, "Requesting INTERNET permission");
            // Request permission. It's possible this can be auto answered if device policy
            // sets the permission in a given state or the user denied the permission
            // previously and checked "Never ask again".
            ActivityCompat.requestPermissions((Activity) context,
                    new String[]{Manifest.permission.INTERNET},
                    REQUEST_PERMISSIONS_REQUEST_CODE);
        }

    }

    public void requestWriteExternal (final Context context){

        final String TAG = context.getClass().getName();
        final int REQUEST_PERMISSIONS_REQUEST_CODE = 34;

        boolean shouldProvideRationale =
                ActivityCompat.shouldShowRequestPermissionRationale((Activity) context,
                        Manifest.permission.WRITE_EXTERNAL_STORAGE);
        if(shouldProvideRationale){
            Log.i(TAG, "Displaying WRITE_EXTERNAL_STORAGE permission rationale to provide additional context.");
            showSnackbar(R.string.permission_rationale, android.R.string.ok,
                    new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            // Request permission
                            ActivityCompat.requestPermissions((Activity) context,
                                    new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE},
                                    REQUEST_PERMISSIONS_REQUEST_CODE);
                        }
                    });
        } else {
            Log.i(TAG, "Requesting WRITE_EXTERNAL_STORAGE permission");
            // Request permission. It's possible this can be auto answered if device policy
            // sets the permission in a given state or the user denied the permission
            // previously and checked "Never ask again".
            ActivityCompat.requestPermissions((Activity) context,
                    new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE},
                    REQUEST_PERMISSIONS_REQUEST_CODE);
        }

    }


    public void requestCoarseLocation (final Context context){

        final String TAG = context.getClass().getName();
        final int REQUEST_PERMISSIONS_REQUEST_CODE = 34;

        boolean shouldProvideRationale =
                ActivityCompat.shouldShowRequestPermissionRationale((Activity) context,
                        Manifest.permission.ACCESS_COARSE_LOCATION);
        if(shouldProvideRationale){
            Log.i(TAG, "Displaying ACCESS_COARSE_LOCATION permission rationale to provide additional context.");
            showSnackbar(R.string.permission_rationale, android.R.string.ok,
                    new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            // Request permission
                            ActivityCompat.requestPermissions((Activity) context,
                                    new String[]{Manifest.permission.ACCESS_COARSE_LOCATION},
                                    REQUEST_PERMISSIONS_REQUEST_CODE);
                        }
                    });
        } else {
            Log.i(TAG, "Requesting ACCESS_COARSE_LOCATION permission");
            // Request permission. It's possible this can be auto answered if device policy
            // sets the permission in a given state or the user denied the permission
            // previously and checked "Never ask again".
            ActivityCompat.requestPermissions((Activity) context,
                    new String[]{Manifest.permission.ACCESS_COARSE_LOCATION},
                    REQUEST_PERMISSIONS_REQUEST_CODE);
        }

    }


    public void requestNetworkState (final Context context){

        final String TAG = context.getClass().getName();
        final int REQUEST_PERMISSIONS_REQUEST_CODE = 34;

        boolean shouldProvideRationale =
                ActivityCompat.shouldShowRequestPermissionRationale((Activity) context,
                        Manifest.permission.ACCESS_NETWORK_STATE);
        if(shouldProvideRationale){
            Log.i(TAG, "Displaying ACCESS_NETWORK_STATE permission rationale to provide additional context.");
            showSnackbar(R.string.permission_rationale, android.R.string.ok,
                    new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            // Request permission
                            ActivityCompat.requestPermissions((Activity) context,
                                    new String[]{Manifest.permission.ACCESS_NETWORK_STATE},
                                    REQUEST_PERMISSIONS_REQUEST_CODE);
                        }
                    });
        } else {
            Log.i(TAG, "Requesting ACCESS_NETWORK_STATE permission");
            // Request permission. It's possible this can be auto answered if device policy
            // sets the permission in a given state or the user denied the permission
            // previously and checked "Never ask again".
            ActivityCompat.requestPermissions((Activity) context,
                    new String[]{Manifest.permission.ACCESS_NETWORK_STATE},
                    REQUEST_PERMISSIONS_REQUEST_CODE);
        }

    }



    private void showSnackbar(final String text) {
        View container = findViewById(android.R.id.content);
        if (container != null) {
            Snackbar.make(container, text, Snackbar.LENGTH_LONG).show();
        }
    }

    /**
     * Shows a {@link Snackbar}.
     *
     * @param mainTextStringId The id for the string resource for the Snackbar text.
     * @param actionStringId   The text of the action item.
     * @param listener         The listener associated with the Snackbar action.
     */
    private void showSnackbar(final int mainTextStringId, final int actionStringId,
                              View.OnClickListener listener) {
        Snackbar.make(
                findViewById(android.R.id.content),
                getString(mainTextStringId),
                Snackbar.LENGTH_INDEFINITE)
                .setAction(getString(actionStringId), listener).show();
    }



}
