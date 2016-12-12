package com.example.abhinavchauhan.projectalfa;

import android.Manifest;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.location.LocationProvider;
import android.media.RingtoneManager;
import android.os.Bundle;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.support.v7.app.NotificationCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.support.annotation.Nullable;

import java.net.URI;

/**
 * Created by Abhishek Chauhan on 09-07-2016.
 */
public class gpstarget extends Fragment {
    LocationManager locationManager;
    LocationListener locationListener;
    Boolean ispressed=false;
    TextView textView;
    int flag=0,shareflag=0;
    double ref_latitude=28.621295;
    double ref_longitude=77.306259;
    double latitude;
    double longitude;
    Boolean itemclicked=false;
    public static Fragment newInstance(Context context)
    {
        gpstarget frg19=new gpstarget();
        return frg19;
    }

    @Override
    public void onResume() {
        if(ActivityCompat.checkSelfPermission(getActivity(),android.Manifest.permission.ACCESS_FINE_LOCATION)!= PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(getActivity(),android.Manifest.permission.ACCESS_COARSE_LOCATION)!=PackageManager.PERMISSION_GRANTED)
        {
            ActivityCompat.requestPermissions(getActivity(),new String[] {Manifest.permission.ACCESS_FINE_LOCATION},PackageManager.PERMISSION_GRANTED);
            ActivityCompat.requestPermissions(getActivity(),new String[] {Manifest.permission.ACCESS_COARSE_LOCATION},PackageManager.PERMISSION_GRANTED);
        }
        locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER,0,0,locationListener);
        super.onResume();
    }

    @Override
    public void onPause() {
        if(ActivityCompat.checkSelfPermission(getActivity(),android.Manifest.permission.ACCESS_FINE_LOCATION)!= PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(getActivity(),android.Manifest.permission.ACCESS_COARSE_LOCATION)!=PackageManager.PERMISSION_GRANTED)
        {
            ActivityCompat.requestPermissions(getActivity(),new String[] {Manifest.permission.ACCESS_FINE_LOCATION},PackageManager.PERMISSION_GRANTED);
            ActivityCompat.requestPermissions(getActivity(),new String[] {Manifest.permission.ACCESS_COARSE_LOCATION},PackageManager.PERMISSION_GRANTED);
        }
        locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER,0,0,locationListener);
        super.onPause();
    }

    @Override
    public void onDestroy() {
        if(ActivityCompat.checkSelfPermission(getActivity(),android.Manifest.permission.ACCESS_FINE_LOCATION)!= PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(getActivity(),android.Manifest.permission.ACCESS_COARSE_LOCATION)!=PackageManager.PERMISSION_GRANTED)
        {
            ActivityCompat.requestPermissions(getActivity(),new String[] {Manifest.permission.ACCESS_FINE_LOCATION},PackageManager.PERMISSION_GRANTED);
            ActivityCompat.requestPermissions(getActivity(),new String[] {Manifest.permission.ACCESS_COARSE_LOCATION},PackageManager.PERMISSION_GRANTED);
        }
        locationManager.removeUpdates(locationListener);
        super.onDestroy();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final ListView listView;
        ViewGroup root19=(ViewGroup)inflater.inflate(R.layout.gpstarget,null);
        listView=(ListView)root19.findViewById(R.id.listView12);
        textView=(TextView)root19.findViewById(R.id.textView11);
        String destinations[]={"Home","Laxmi Nagar","Preet Vihar","Rajendra Place","Kirti Nagar","Paschim Vihar East","BVCOE"};
        ArrayAdapter adapter=new ArrayAdapter(getActivity(),R.layout.othershandler,destinations);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position)
                {
                    case 0:
                        break;
                    case 1:
                        ref_latitude=28.6305806;
                        ref_longitude=77.2771092;
                        break;
                    case 2:
                        ref_latitude=28.6357127;
                        ref_longitude=77.2936242;
                        break;
                    case 3:
                        ref_latitude=28.6424773;
                        ref_longitude=77.1781842;
                        break;
                    case 4:
                        ref_latitude=28.6557492;
                        ref_longitude=77.1503044;
                        break;
                    case 5:
                        ref_latitude=28.6772438;
                        ref_longitude=77.1124719;
                        break;
                    case 6:
                        ref_latitude=28.6759172;
                        ref_longitude=77.113017;
                        break;
                }
                itemclicked=true;
                listView.setVisibility(View.GONE);
                textView.setText("Destination Selected");
                Toast.makeText(getActivity(),"You can Minimise the Application",Toast.LENGTH_LONG).show();
            }
        });
        final int UniqID=444;
        final NotificationCompat.Builder notif=new NotificationCompat.Builder(getActivity());
        notif.setAutoCancel(true);
        final Button button=(Button)root19.findViewById(R.id.button);
        if(ActivityCompat.checkSelfPermission(getActivity(),android.Manifest.permission.ACCESS_FINE_LOCATION)== PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(getActivity(),android.Manifest.permission.ACCESS_COARSE_LOCATION)==PackageManager.PERMISSION_GRANTED) {
            locationManager = (LocationManager) getActivity().getSystemService(Context.LOCATION_SERVICE);
            locationListener = new LocationListener() {
                @Override
                public void onLocationChanged(Location location) {
                    latitude = location.getLatitude();
                    longitude = location.getLongitude();
                    button.setVisibility(View.VISIBLE);
                    button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            ispressed = true;
                        }
                    });
                    if (ispressed == true && shareflag == 0) {
                        PackageManager pm = getActivity().getPackageManager();
                        try {

                            Intent waIntent = new Intent(Intent.ACTION_SEND);
                            waIntent.setType("text/plain");
                            String text = "https://www.google.co.in/maps/dir//" + latitude+ "," +longitude;
                            PackageInfo info = pm.getPackageInfo("com.whatsapp", PackageManager.GET_META_DATA);
                            waIntent.setPackage("com.whatsapp");

                            waIntent.putExtra(Intent.EXTRA_TEXT, text);
                            startActivity(Intent.createChooser(waIntent, "Share with"));

                        }
                        catch (PackageManager.NameNotFoundException e)
                        {
                            Toast.makeText(getActivity(), "WhatsApp not Installed", Toast.LENGTH_SHORT).show();
                        }
                        shareflag++;
                    }
                    double latdiff = Math.abs(latitude - ref_latitude);
                    double longdiff = Math.abs(longitude - ref_longitude);
                    double a = (Math.sin(latdiff / 2)) * (Math.sin(latdiff / 2)) + Math.cos(latitude) * Math.cos(ref_latitude) * Math.sin(longdiff / 2) * Math.sin(longdiff / 2);
                    double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
                    double d = 6373000 * c;
                    if (d < 1400 && flag == 0 && itemclicked) {
                        Uri alarmsound = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);
                        long[] pattern = {500, 500, 500, 500, 500, 500, 500, 500};
                        notif.setSmallIcon(R.drawable.gpstarget);
                        notif.setContentTitle("GPS Tracker");
                        notif.setContentText("Destination Nearby");
                        notif.setWhen(System.currentTimeMillis());
                        notif.setSound(alarmsound);
                        notif.setVibrate(pattern);
                        Intent intent = new Intent(getActivity(), MainActivity.class);
                        PendingIntent pendingIntent = PendingIntent.getActivity(getActivity(), 0, intent, PendingIntent.FLAG_UPDATE_CURRENT);
                        notif.setContentIntent(pendingIntent);
                        NotificationManager notificationManager = (NotificationManager) getActivity().getSystemService(Context.NOTIFICATION_SERVICE);
                        notificationManager.notify(UniqID, notif.build());
                        Toast.makeText(getActivity(), "Near Destination", Toast.LENGTH_LONG).show();
                        flag++;
                    }
                }

                @Override
                public void onStatusChanged(String provider, int status, Bundle extras) {
                    switch (status) {
                        case LocationProvider.AVAILABLE:
                            //Toast.makeText(getActivity(),"Available",Toast.LENGTH_LONG).show();
                            break;
                        case LocationProvider.OUT_OF_SERVICE:
                            Toast.makeText(getActivity(), "Out of Service", Toast.LENGTH_LONG).show();
                            break;
                        case LocationProvider.TEMPORARILY_UNAVAILABLE:
                            Toast.makeText(getActivity(), "Unavailable", Toast.LENGTH_LONG).show();
                            break;
                    }
                }

                @Override
                public void onProviderEnabled(String provider) {

                }

                @Override
                public void onProviderDisabled(String provider) {

                }
            };
        }
        return root19;
    }
}
