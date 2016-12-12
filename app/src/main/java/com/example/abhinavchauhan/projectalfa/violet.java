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
public class violet extends Fragment {
    public static Fragment newInstance(Context context)
    {
        yellow frg7=new yellow();
        return frg7;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ListView listView;
        String violet_stations[]={"ITO","* Mandi House *","Janpath","* Central Secretariat *","Khan Market","Jawaharlal Nehru Stadium","Jangpura","Lajpat Nagar","Moolchand","Kailash Colony","Nehru Place","Kalkaji Mandir","Govind Puri","Okhla","Jasola Apollo","Sarita Vihar","Mohan Estate","Tughlakabad","Badarpur","Sarai","NHPC Chowk","Mewla Maharajpur","Sector 28","Badkhal Mor","Faridabad Old","Neelam Chowk Ajronda","Bata Chowk","Escorts Mujesar"};
        ViewGroup root7=(ViewGroup)inflater.inflate(R.layout.violet,null);
        listView=(ListView)root7.findViewById(R.id.listView4);
        ArrayAdapter adapter=new ArrayAdapter(getActivity(),R.layout.list_handler,violet_stations);
        listView.setAdapter(adapter);
        return root7;
    }
}
