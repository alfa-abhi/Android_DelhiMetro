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
public class lightblue extends Fragment {
    public static Fragment newInstance(Context context)
    {
        yellow frg9=new yellow();
        return frg9;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ListView listView;
        String lightblue_stations[]={"Sikanderpur","Phase 2","Belvedere Towers","Cyber City","Moulsari Avenue","Phase 3"};
        ViewGroup root9=(ViewGroup)inflater.inflate(R.layout.lightblue,null);
        listView=(ListView)root9.findViewById(R.id.listView6);
        ArrayAdapter adapter=new ArrayAdapter(getActivity(),R.layout.list_handler,lightblue_stations);
        listView.setAdapter(adapter);
        return root9;
    }
}
