package com.example.mirza.mapesarajeva;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class carsija extends AppCompatActivity {
    private Button dugme;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carsija);

        dugme=(Button) findViewById(R.id.mcarsija);

        dugme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });

    }

    public void openActivity2(){
        Intent intent = new Intent(this, MapsCarsija.class);
        startActivity(intent);
    }
}
