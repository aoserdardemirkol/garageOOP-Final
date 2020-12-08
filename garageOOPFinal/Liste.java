package com.garageOOPFinal;

public class Liste implements IslemInterface {

    @Override
    public String islemSec(String islem, Garaj grj, int tip, String plaka) {

        if (grj.getAracList().size() == 0)
            return ("---------- Garaj Boş");
        return ("---------- Liste: " + grj.getAracList() + " Yer Durumu: " + grj.getYer());
    }
}

