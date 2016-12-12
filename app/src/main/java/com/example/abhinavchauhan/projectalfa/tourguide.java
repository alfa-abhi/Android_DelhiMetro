package com.example.abhinavchauhan.projectalfa;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

/**
 * Created by Abhishek Chauhan on 10-07-2016.
 */
public class tourguide extends Fragment {
    public static Fragment newInstance(Context context)
    {
        tourguide frg21=new tourguide();
        return frg21;
    }



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final ListView listView;
        final TextView tv1,tv2,tv3,tv4,tv5;
        final ImageView imageView,imageView1;
        final String places[]={"Akshardham Temple","Dilli Haat","Gurudwara Bangla Sahib","Hauz Khas Village","Humayun's Tomb","India Gate","Jama Masjid","Jantar Mantar","Lotus Temple","National Museum","Purana Qila","Qutub Minar","Red Fort","Sacred Heart Cathedral","Saket District Centre","The Garden of Five Senses"};
        ViewGroup root21=(ViewGroup)inflater.inflate(R.layout.tourguide,null);
        listView=(ListView)root21.findViewById(R.id.listView13);
        tv1=(TextView)root21.findViewById(R.id.textView12);
        tv2=(TextView)root21.findViewById(R.id.textView16);
        tv3=(TextView)root21.findViewById(R.id.textView13);
        tv4=(TextView)root21.findViewById(R.id.textView14);
        tv5=(TextView)root21.findViewById(R.id.textView15);
        imageView=(ImageView)root21.findViewById(R.id.imageView39);
        imageView1=(ImageView)root21.findViewById(R.id.imageView40);
        ArrayAdapter adapter= new ArrayAdapter(getActivity(),R.layout.othershandler,places);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                listView.setVisibility(View.GONE);
                tv1.setVisibility(View.VISIBLE);
                tv2.setVisibility(View.VISIBLE);
                tv3.setVisibility(View.VISIBLE);
                tv4.setVisibility(View.VISIBLE);
                tv5.setVisibility(View.VISIBLE);
                imageView.setVisibility(View.VISIBLE);
                imageView1.setVisibility(View.VISIBLE);
                switch (position)
                {
                    case 0:
                        tv1.setText(places[position]);
                        tv2.setText("Akshardham");
                        tv3.setText("300m");
                        imageView1.setImageResource(R.drawable.akshardham);
                        break;
                    case 1:
                        tv1.setText(places[position]);
                        tv2.setText("INA/Netaji Subash Place");
                        tv3.setText("200m,200m");
                        imageView1.setImageResource(R.drawable.dillihaat);
                        break;
                    case 2:
                        tv1.setText(places[position]);
                        tv2.setText("Patel Chowk");
                        tv3.setText("300m");
                        imageView1.setImageResource(R.drawable.banglasahib);
                        break;
                    case 3:
                        tv1.setText(places[position]);
                        tv2.setText("Hauz Khas");
                        tv3.setText("2600m");
                        imageView1.setImageResource(R.drawable.hauzkhasvillage);
                        break;
                    case 4:
                        tv1.setText(places[position]);
                        tv2.setText("Khan Market/Jangpra");
                        tv3.setText("1000m,1000m");
                        imageView1.setImageResource(R.drawable.humayunstomb);
                        break;
                    case 5:
                        tv1.setText(places[position]);
                        tv2.setText("Central Secretariat");
                        tv3.setText("900m");
                        imageView1.setImageResource(R.drawable.indiagate);
                        break;
                    case 6:
                        tv1.setText(places[position]);
                        tv2.setText("Chandni Chowk");
                        tv3.setText("500m");
                        imageView1.setImageResource(R.drawable.jamamasjid);
                        break;
                    case 7:
                        tv1.setText(places[position]);
                        tv2.setText("Rajiv Chowk");
                        tv3.setText("300m");
                        imageView1.setImageResource(R.drawable.jantarmantar);
                        break;
                    case 8:
                        tv1.setText(places[position]);
                        tv2.setText("Nehru Place/Kalkaji Mandir");
                        tv3.setText("300m,300m");
                        imageView1.setImageResource(R.drawable.lotustemple);
                        break;
                    case 9:
                        tv1.setText(places[position]);
                        tv2.setText("Central Secretariat");
                        tv3.setText("800m");
                        imageView1.setImageResource(R.drawable.nationalmuseum);
                        break;
                    case 10:
                        tv1.setText(places[position]);
                        tv2.setText("Pragati Maidan");
                        tv3.setText("300m");
                        imageView1.setImageResource(R.drawable.puranaqila);
                        break;

                    case 11:
                        tv1.setText(places[position]);
                        tv2.setText("Qutub Minar");
                        tv3.setText("1900m");
                        imageView1.setImageResource(R.drawable.qutubminar);
                        break;
                    case 12:
                        tv1.setText(places[position]);
                        tv2.setText("Chandni Chowk");
                        tv3.setText("300m");
                        imageView1.setImageResource(R.drawable.redfort);
                        break;
                    case 13:
                        tv1.setText(places[position]);
                        tv2.setText("Patel Chowk");
                        tv3.setText("300m");
                        imageView1.setImageResource(R.drawable.sacredheart);
                        break;
                    case 14:
                        tv1.setText(places[position]);
                        tv2.setText("Malviya Nagar");
                        tv3.setText("1200m");
                        imageView1.setImageResource(R.drawable.saketdc);
                        break;
                    case 15:
                        tv1.setText(places[position]);
                        tv2.setText("Saket");
                        tv3.setText("500m");
                        imageView1.setImageResource(R.drawable.gardenoffive);
                        break;
                }
            }
        });
        return root21;
    }
}
