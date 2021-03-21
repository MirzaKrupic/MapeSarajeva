package com.example.mirza.mapesarajeva;

public class Rezervacija {

    private String imeiprezime;
    private String datumrez;
    private String mjesto;

    public Rezervacija(){

    }

    public Rezervacija(String imeiprezime, String datumrez, String mjesto) {
        this.imeiprezime = imeiprezime;
        this.datumrez = datumrez;
        this.mjesto = mjesto;
    }

    public String getImeiprezime() {
        return imeiprezime;
    }

    public String getDatumrez() {
        return datumrez;
    }

    public String getMjesto() {
        return mjesto;
    }
}
