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
 * Created by Abhishek Chauhan on 05-07-2016.
 */
public class HomeScreen extends Fragment {
    public static Fragment newInstance(Context context)
    {
        HomeScreen frg1=new HomeScreen();
        return frg1;
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup root4=(ViewGroup)inflater.inflate(R.layout.home_screen,null);
        return root4;
    }
}
