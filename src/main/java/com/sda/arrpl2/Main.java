package com.sda.arrpl2;

public class Main {
    public static void main(String[] args) {
        Osoba osoba1 = new Osoba("Marian","Kowalski");
        Osoba osoba2 = new Osoba("Adrian","Roztocki");
        Osoba osoba3 = new Osoba("Hugo","Kołątaj");
        Osoba osoba4 = new Osoba("Alicja","Wkrainieczarów");
        Osoba osoba5 = new Osoba("Dagmara","Drakula");
        // test czy działa
        System.out.println(osoba1 + " " + osoba2);
    }
}