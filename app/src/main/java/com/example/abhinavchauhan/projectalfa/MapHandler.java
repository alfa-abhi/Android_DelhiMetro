package com.example.abhinavchauhan.projectalfa;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.view.animation.Animation;

public class MapHandler extends Fragment{
    public static Fragment newInstance(Context context)
    {
        MapHandler frg2=new MapHandler();
        return frg2;
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final ImageView imageView;
        ViewGroup viewGroup=(ViewGroup)inflater.inflate(R.layout.map_screen,null);
        imageView=(ImageView)viewGroup.findViewById(R.id.imageView2);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation zoomer= AnimationUtils.loadAnimation(getActivity(),R.anim.zooming);
                zoomer.reset();
                imageView.startAnimation(zoomer);
            }
        });
        return viewGroup;
    }

}