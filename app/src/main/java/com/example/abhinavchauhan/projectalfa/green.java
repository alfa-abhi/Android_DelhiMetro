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
public class green extends Fragment {
    public static Fragment newInstance(Context context)
    {
        yellow frg8=new yellow();
        return frg8;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ListView listView;
        String green_stations[]={"Mundka","Rajdhani Park","\tNangloi Railway station","Nangloi","Surajmal Stadium","Udyog Nagar","Peera Garhi","Paschim Vihar West","Paschim Vihar East","Madipur","Shivaji Park","Punjabi Bagh East","Ashok Park Main","* Inderlok * || Satguru Ramsingh Marg"," - || * Kirti Nagar *",};
        ViewGroup root8=(ViewGroup)inflater.inflate(R.layout.green,null);
        listView=(ListView)root8.findViewById(R.id.listView5);
        ArrayAdapter adapter=new ArrayAdapter(getActivity(),R.layout.list_handler,green_stations);
        listView.setAdapter(adapter);
        return root8;
    }
}
