package com.example.mirza.mapesarajeva;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText lUser;
    EditText lPass;
    Button lButton;
    TextView reg;
    BazaPodatakaH db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        db = new BazaPodatakaH(this);

        lUser = (EditText) findViewById(R.id.edittext_username);
        lPass = (EditText) findViewById(R.id.edittext_password);
        lButton = (Button) findViewById(R.id.button_login);
        reg = (TextView) findViewById(R.id.textview_register);

        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent regIntent = new Intent(MainActivity.this, registracija.class);
                startActivity(regIntent);
            }
        });

        lButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = lUser.getText().toString().trim();
                String pw = lPass.getText().toString().trim();
                boolean check = db.checkUser(user, pw);
                if (check == true) {
                    Toast.makeText(MainActivity.this, "Succsesfuly loged in", Toast.LENGTH_LONG).show();
                    Intent open = new Intent(MainActivity.this, MainMenu.class);
                    startActivity(open);
                } else {

                    Toast.makeText(MainActivity.this, "LOGIN ERROR", Toast.LENGTH_LONG).show();

                }
            }



        });
    }
}

