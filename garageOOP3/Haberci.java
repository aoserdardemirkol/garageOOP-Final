package com.garageOOP3;

public class Haberci implements Observer {

    @Override
    public void update(Observable observable) {
        Garaj grj = (Garaj) observable;

        System.out.println("---------- Kalan Alan: " + grj.getYer());
    }
}
