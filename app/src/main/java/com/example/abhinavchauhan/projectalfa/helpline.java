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
public class helpline extends Fragment {
    public static Fragment newInstance(Context context)
    {
        helpline frg11=new helpline();
        return frg11;
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup root11=(ViewGroup)inflater.inflate(R.layout.helpline,null);
        return root11;
    }
}
