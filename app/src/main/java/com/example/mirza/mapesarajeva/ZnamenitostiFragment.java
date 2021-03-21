package com.example.mirza.mapesarajeva;

import android.content.Intent;
import  android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import java.util.zip.Inflater;

public class ZnamenitostiFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view= inflater.inflate(R.layout.fragment_znamenitosti,container,false);

        Button carsija = (Button)view.findViewById(R.id.zb1);
        Button vijecnica = (Button)view.findViewById(R.id.zb2);
        Button latinc = (Button)view.findViewById(R.id.zb3);
        Button skakavac = (Button)view.findViewById(R.id.zb4);
        Button ztabija = (Button)view.findViewById(R.id.zb5);
        Button btabija = (Button)view.findViewById(R.id.zb6);

        ImageView car = (ImageView)view.findViewById(R.id.zi1);
        ImageView vje = (ImageView)view.findViewById(R.id.zi2);
        ImageView lc = (ImageView)view.findViewById(R.id.zi3);
        ImageView skak = (ImageView)view.findViewById(R.id.zi4);
        ImageView zut = (ImageView)view.findViewById(R.id.zi5);
        ImageView bje = (ImageView)view.findViewById(R.id.zi6);

        carsija.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in1 = new Intent(getActivity(), carsija.class);
                startActivity(in1);
            }


        });

        vijecnica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in2 = new Intent(getActivity(), vijecnica.class);
                startActivity(in2);
            }


        });

        latinc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in3 = new Intent(getActivity(), latinc.class);
                startActivity(in3);
            }


        });

        skakavac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in4 = new Intent(getActivity(), skakavac.class);
                startActivity(in4);
            }


        });

        ztabija.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in5 = new Intent(getActivity(), ztabija.class);
                startActivity(in5);
            }


        });

        btabija.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in6 = new Intent(getActivity(), btabija.class);
                startActivity(in6);
            }


        });

        car.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in1 = new Intent(getActivity(), carsija.class);
                startActivity(in1);
            }
        });

        vje.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in1 = new Intent(getActivity(), vijecnica.class);
                startActivity(in1);
            }
        });

        skak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in1 = new Intent(getActivity(), skakavac.class);
                startActivity(in1);
            }
        });

        lc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in1 = new Intent(getActivity(), latinc.class);
                startActivity(in1);
            }
        });

        zut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in1 = new Intent(getActivity(), ztabija.class);
                startActivity(in1);
            }
        });

        bje.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in1 = new Intent(getActivity(), btabija.class);
                startActivity(in1);
            }
        });

        return view;
    }}