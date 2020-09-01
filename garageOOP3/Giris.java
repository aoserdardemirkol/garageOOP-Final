package com.garageOOP3;

public class Giris implements IslemInterface {

    @Override
    public String islemSec(String islem, Garaj grj, int tip, String plaka) {

        Arac arac = AracFabrikasi.getArac(tip, plaka);

        if (arac.getAlan() <= grj.getYer()) {
            int index = grj.aracBulGiris(arac.getAd(), plaka);

            if (index == -1)
                return ("---------- Bu araç zaten garajda");

            else {
                grj.getAracList().add(arac);
                grj.setYer(grj.getYer() - arac.getAlan());

                Haberci hbrAl = new Haberci();
                grj.ekle(hbrAl);

                grj.setAracList(grj.getAracList());
                grj.getAracListBefore().add(arac);

                return ("---------- Liste: " + grj.getAracList());
            }
        }
        else
            return ("---------- Otoparkta Yer Yok Önce Çıkış Yapılmalı ");
    }
}
