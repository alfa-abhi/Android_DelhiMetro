package com.example.abhinavchauhan.projectalfa;

import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;

/**
 * Created by Abhishek Chauhan on 10-07-2016.
 */
public class mylocation extends Fragment {
    LocationManager locationManager;
    LocationListener locationListener;
    double latitude;
    double longitude;
    int flag=0;
    public static Fragment newInstance(Context context)
    {
        mylocation frg20=new mylocation();
        return frg20;
    }

    @Override
    public void onResume() {
        if(ActivityCompat.checkSelfPermission(getActivity(),android.Manifest.permission.ACCESS_FINE_LOCATION)!= PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(getActivity(),android.Manifest.permission.ACCESS_COARSE_LOCATION)!=PackageManager.PERMISSION_GRANTED)
        {
            return;
        }
        locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER,0,0,locationListener);
        super.onResume();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup root20=(ViewGroup)inflater.inflate(R.layout.home_screen,null);
        Toast.makeText(getActivity(),"Fetching Location. Please Wait.",Toast.LENGTH_LONG).show();
        locationManager=(LocationManager)getActivity().getSystemService(Context.LOCATION_SERVICE);
        locationListener = new LocationListener() {
            @Override
            public void onLocationChanged(Location location) {
                latitude=location.getLatitude();
                longitude=location.getLongitude();
                String loc="geo:"+latitude + "," + longitude+"?q=restaurants";
                if(flag==0) {
                    Toast.makeText(getActivity(),"Searching Restaurants",Toast.LENGTH_LONG).show();
                    flag++;
                    Uri gmmIntentUri = Uri.parse(loc);
                    Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                    mapIntent.setPackage("com.google.android.apps.maps");
                    startActivity(mapIntent);
                    }
            }

            @Override
            public void onStatusChanged(String provider, int status, Bundle extras) {

            }

            @Override
            public void onProviderEnabled(String provider) {

            }
            @Override
            public void onProviderDisabled(String provider) {

            }
        };
        return root20;
    }
}
