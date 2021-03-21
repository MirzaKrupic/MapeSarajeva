package com.example.mirza.mapesarajeva;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class RezervacijaActivity extends AppCompatActivity {

    EditText editImw, editDatum;
    Button potvrda;
    DatabaseReference databaseRezervacija;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_rezervacija);


        databaseRezervacija = FirebaseDatabase.getInstance().getReference("rezervacija");

        editImw = (EditText) findViewById(R.id.imeiprezime);
        editDatum = (EditText) findViewById(R.id.datum);
        potvrda = (Button) findViewById(R.id.potvrdi);


        potvrda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addRezervacija();
            }
        });

    }

    private void addRezervacija() {
        String ime = editImw.getText().toString().trim();
        String datum = editDatum.getText().toString().trim();

        String id = databaseRezervacija.push().getKey();
        String bar=(String)getIntent().getStringExtra("Mjesto");
        Rezervacija rezer = new Rezervacija(ime, datum, bar);

        databaseRezervacija.child(id).setValue(rezer);

        Toast.makeText(this, "Uspjesno ste izvrsili rezervaciju", Toast.LENGTH_LONG).show();
        ;
    }

}
