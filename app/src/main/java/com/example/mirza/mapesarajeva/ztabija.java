package com.example.mirza.mapesarajeva;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ztabija extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ztabija);

        Button dugme=(Button)findViewById(R.id.mzutatab);

        dugme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();

            }
        });
    }
    public void openActivity2(){
        Intent intent = new Intent(this, MapsZtabija.class);
        startActivity(intent);
    }
}
