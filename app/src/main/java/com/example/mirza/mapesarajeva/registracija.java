package com.example.mirza.mapesarajeva;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class registracija extends AppCompatActivity {

    BazaPodatakaH db;
    EditText lUser;
    EditText lPass;
    EditText cPass;
    Button lButton;
    TextView log;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registracija);

        db = new BazaPodatakaH(this);
        lUser=(EditText) findViewById(R.id.edittext_username);
        lPass=(EditText) findViewById(R.id.edittext_password);
        cPass=(EditText) findViewById(R.id.edittext_cnf_password);
        lButton=(Button) findViewById(R.id.button_register);
        log=(TextView) findViewById(R.id.textview_login);

        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent LogInIntent = new Intent(registracija.this, MainActivity.class);
                startActivity(LogInIntent);
            }
        });

        lButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = lUser.getText().toString().trim();
                String pw = lPass.getText().toString().trim();
                String cpw = cPass.getText().toString().trim();

                if(pw.equals(cpw))
                {
                    Long val = db.addUser(user,pw);
                    if(val>0){Toast.makeText(registracija.this, "SUCCESS", Toast.LENGTH_LONG).show();
                        Intent move = new Intent(registracija.this,MainActivity.class);
                        startActivity(move);}
                    else
                    {
                        Toast.makeText(registracija.this, "ERROR. Try again", Toast.LENGTH_LONG).show();
                    }

                }

                else
                {
                    Toast.makeText(registracija.this, "Password does not match the confirm password", Toast.LENGTH_LONG).show();
                }

            }
        });
    }
}
