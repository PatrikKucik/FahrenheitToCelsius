package org.example;

import Balicek5.Sledovac;
import Vraciac.Vratka;

public class FahrenheitToCelsius {
    public static void main(String[] args) {

        double fahrenheit = 99;
        Sledovac fahren_PK = new Sledovac(789);
        fahren_PK.setVlastSledovac(45);
        //dalsi test

        System.out.println("Enter temperature in Fahrenheit: ");
        double celsius = (fahren_PK.getVlastSledovac() - 32) * 5 / 9;
        Vratka vysledok_PK = new Vratka(21);
        vysledok_PK.setVysledok(47);

        System.out.println(fahren_PK.getVlastSledovac() + " degrees Fahrenheit is equal to " + celsius + " degrees Celsius.");
        System.out.println(vysledok_PK.getVysledok());
        }
    }