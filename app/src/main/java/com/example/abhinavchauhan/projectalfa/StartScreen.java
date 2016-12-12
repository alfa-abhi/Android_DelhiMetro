package com.example.abhinavchauhan.projectalfa;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Abhishek Chauhan on 07-07-2016.
 */
public class StartScreen extends Fragment {
    public static Fragment newInstance(Context context)
    {
        HomeScreen frg0=new HomeScreen();
        return frg0;
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup root4=(ViewGroup)inflater.inflate(R.layout.start_screen,null);
        return root4;
    }
}
