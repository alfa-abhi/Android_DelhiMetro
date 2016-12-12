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
public class orange extends Fragment {
    public static Fragment newInstance(Context context)
    {
        yellow frg10=new yellow();
        return frg10;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ListView listView;
        String orange_stations[]={"** New Delhi **","Shivaji Stadium","Dhaula Kuan","Delhi Aerocity","Airport","** Dwarka Sector 21 **"};
        ViewGroup root10=(ViewGroup)inflater.inflate(R.layout.orange,null);
        listView=(ListView)root10.findViewById(R.id.listView7);
        ArrayAdapter adapter=new ArrayAdapter(getActivity(),R.layout.list_handler,orange_stations);
        listView.setAdapter(adapter);
        return root10;
    }
}
