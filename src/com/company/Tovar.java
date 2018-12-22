package com.company;

public class Tovar {



    String name;
    int kol;
    double cena;
    double stoim;

    public Tovar(String name, int kol, double cena, double stoim){
        this.name = name;
        this.kol = kol;
        this.cena=cena;
        this.stoim=cena*kol;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKol() {
        return kol;
    }

    public void setKol(int kol) {
        this.kol = kol;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public double getStoim() {
        return stoim;
    }

    public void setStoim(double stoim) {
        this.stoim = stoim;
    }
}
