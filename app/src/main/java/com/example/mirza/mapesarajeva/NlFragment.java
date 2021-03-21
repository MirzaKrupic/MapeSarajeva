package com.example.mirza.mapesarajeva;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;



public class NlFragment extends Fragment {
    public String mjesto;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_nl,container,false);
        Button sloga= (Button)view.findViewById(R.id.nlb1);
        Button und= (Button)view.findViewById(R.id.nlb2);

        sloga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent in1 = new Intent(getActivity(), RezervacijaActivity.class);
                in1.putExtra("Mjesto", "Sloga");
                startActivity(in1);
            }
        });

        und.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in1 = new Intent(getActivity(), RezervacijaActivity.class);
                in1.putExtra("Mjesto", "Underground");
                startActivity(in1);
            }
        });



        return view;
    }



}
