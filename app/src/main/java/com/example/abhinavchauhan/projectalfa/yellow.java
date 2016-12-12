package com.example.abhinavchauhan.projectalfa;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by Abhishek Chauhan on 07-07-2016.
 */
public class yellow extends Fragment {
    public static Fragment newInstance(Context context)
    {
        yellow frg4=new yellow();
        return frg4;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ListView listView;
        String yellow_stations[]={"Samaypur Badli","Rohini Sector 18","Haiderpur","Jahangirpuri","Adarsh Nagar","Azadpur","Model Town","GTB Nagar","Vishwa Vidyalaya","Vidhan Sabha","Civil Lines","* Kashmere Gate *","Chandni Chowk","Chawri Bazar","** New Delhi **","* Rajiv Chowk *","Patel Chowk","* Central Secretariat *","Udyog Bhawan","Race Course","Jor Bagh","INA","AIIMS","Green Park","Hauz Khas","Malviya Nagar","Saket","Qutub Minar","Chhatarpur","Sultanpur","Ghitorni","Arjan Garh","Guru Dronacharya","* Sikandarpur *","MG Road","IFFCO Chowk","HUDA City Centre"};
        ViewGroup root4=(ViewGroup)inflater.inflate(R.layout.yellow,null);
        listView=(ListView)root4.findViewById(R.id.listView);
        ArrayAdapter adapter=new ArrayAdapter(getActivity(),R.layout.list_handler,yellow_stations);
        listView.setAdapter(adapter);
        return root4;
    }
}
