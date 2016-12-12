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
public class red extends Fragment {
    public static Fragment newInstance(Context context)
    {
        yellow frg5=new yellow();
        return frg5;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ListView listView;
        String red_stations[]={"Dilshad Garden","Jhilmil","Mansarovar Park","Shahdara","Welcome","Seelampur","Shastri Park","* Kashmere Gate *","Tis Hazari","Pul Bangash","Pratap Nagar","Shastri Nagar","* Inderlok *","Kanhiya Nagar","Keshav Puram","\tNetaji Subhash Place","Kohat Enclave","Pitam Pura","Rohini East","Rohini West","Rithala"};
        ViewGroup root5=(ViewGroup)inflater.inflate(R.layout.red,null);
        listView=(ListView)root5.findViewById(R.id.listView2);
        ArrayAdapter adapter=new ArrayAdapter(getActivity(),R.layout.list_handler,red_stations);
        listView.setAdapter(adapter);
        return root5;
    }
}
