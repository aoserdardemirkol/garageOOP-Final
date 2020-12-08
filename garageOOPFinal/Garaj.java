package com.garageOOPFinal;

import java.util.ArrayList;
import java.util.List;

public class Garaj extends Observable {

    private List<Arac> aracList = new ArrayList<>();
    private List<Arac> aracListBefore = new ArrayList<>();
    private int yer;
    private int garajBoyut;

    public Garaj(int yer) {
        this.yer = yer;
        this.garajBoyut = yer;
    }

    public int aracBul(String ad, String plaka) {
        for (Arac ss : this.aracList)
            if (ss.getAd().equalsIgnoreCase(ad) && ss.getPlaka().equalsIgnoreCase(plaka))
                return this.aracList.indexOf(ss);
        return -1;
    }

    public int aracBulGiris(String ad, String plaka) {
        for (Arac ss : this.aracList)
            if (ss.getPlaka().equalsIgnoreCase(plaka) || ss.getAd().equalsIgnoreCase(ad) && ss.getPlaka().equalsIgnoreCase(plaka))
                return -1;
        return 0;
    }

    public List<Arac> getAracList() {
        return aracList;
    }
    public void setAracList(List<Arac> aracList) {
        this.aracList = aracList;
        kontrolEt();
    }

    public List<Arac> getAracListBefore() {
        return aracListBefore;
    }
    public void setAracListBefore(List<Arac> aracListBefore) {
        this.aracListBefore = aracListBefore;
    }

    public int getYer() {
        return yer;
    }
    public void setYer(int yer) {
        this.yer = yer;
    }

    public int getGarajBoyut() {
        return garajBoyut;
    }
    public void setGarajBoyut(int garajBoyut) {
        this.garajBoyut = garajBoyut;
    }

    public void kontrolEt(){
        boolean isFarkli = getAracList() != getAracListBefore();
        if (isFarkli)
            haberVer();
    }
}

