package com.example.abhinavchauhan.projectalfa;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Abhishek Chauhan on 08-07-2016.
 */
public class candt extends Fragment {
    public static Fragment newInstance(Context context)
    {
        candt frg12=new candt();
        return frg12;
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup root12=(ViewGroup)inflater.inflate(R.layout.candt,null);
        return root12;
    }
}
