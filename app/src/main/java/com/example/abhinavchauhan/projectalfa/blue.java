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
public class blue extends Fragment {
    public static Fragment newInstance(Context context)
    {
        yellow frg6=new yellow();
        return frg6;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ListView listView;
        String blue_stations[]={"** Dwarka Sector 21 **","Dwarka Sector 8","Dwarka Sector 9","Dwarka Sector 10","Dwarka Sector 11","Dwarka Sector 12","Dwarka Sector 13","Dwarka Sector 14","Dwarka","Dwarka Mor","Nawada","Uttam Nagar West","Uttam Nagar East","Janakpuri West","Janakpuri East","Tilak Nagar","Subhash Nagar","Tagore Garden","Rajouri Garden","Ramesh Nagar","Moti Nagar","* Kirti Nagar *","Shadipur","Patel Nagar","Rajendra Place","Karol Bagh","Jhandewalan","Ramakrishna Ashram Marg","* Rajiv Chowk *","Barakhambha Road","* Mandi House *","Pragati Maidan","Indraprastha","|- Yamuna Bank -|","Akshardham || Laxmi Nagar","Mayur Vihar - I || Nirman Vihar","Mayur Vihar Extension || Preet Vihar","New Ashok Nagar || Karkarduma","Noida Sector 15 || Anand Vihar","Noida Sector 16 || Kaushambi","Noida Sector 18 || Vaishali","Botanical Garden || - ","Noida Golf Course || - ","Noida City Centre || - "};
        ViewGroup root6=(ViewGroup)inflater.inflate(R.layout.blue,null);
        listView=(ListView)root6.findViewById(R.id.listView3);
        ArrayAdapter adapter=new ArrayAdapter(getActivity(),R.layout.list_handler,blue_stations);
        listView.setAdapter(adapter);
        return root6;
    }
}
