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
 * Created by Abhishek Chauhan on 06-07-2016.
 */
public class network_info1 extends Fragment {
    public static Fragment newInstance(Context context)
    {
        HomeScreen frg3=new HomeScreen();
        return frg3;
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup root3=(ViewGroup)inflater.inflate(R.layout.network_information,null);
        return root3;
    }
}
