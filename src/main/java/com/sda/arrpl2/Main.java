package com.sda.arrpl2;

public class Main {
    public static void main(String[] args) {
        System.out.println("Zadanie 1 wykonane");


        Bear bear1 = new Bear();
        bear1.imie = "Marian";
        bear1.wiek = 32;

        Bear bear2 = new Bear();
        bear2.imie = "Olek";
        bear2.wiek = 10;

        Bear bear3 = new Bear();
        bear3.imie = "Filipek";
        bear3.wiek = 10;

        Bear bear4 = new Bear();
        bear4.imie = "Teddy";
        bear4.wiek = 3;
        //sprawdzenie czy działa
        System.out.println(bear1.imie + bear1.wiek + "oraz " + bear4.imie);


    }
}
