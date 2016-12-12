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
 * Created by Abhishek Chauhan on 08-07-2016.
 */
public class instructions extends Fragment {
    public static Fragment newInstance(Context context)
    {
        instructions frg13=new instructions();
        return frg13;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup root13=(ViewGroup)inflater.inflate(R.layout.instruction,null);
        return root13;
    }
}
