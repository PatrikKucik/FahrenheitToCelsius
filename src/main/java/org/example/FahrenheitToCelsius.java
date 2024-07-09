package org.example;

import Balicek5.Sledovac;

public class FahrenheitToCelsius {
    public static void main(String[] args) {

        double fahrenheit = 99;
        Sledovac fahren_PK = new Sledovac(789);
        fahren_PK.setVlastSledovac(89);


        System.out.println("Enter temperature in Fahrenheit: ");
        double celsius = (fahren_PK.getVlastSledovac() - 32) * 5 / 9;
        System.out.println(fahren_PK.getVlastSledovac() + " degrees Fahrenheit is equal to " + celsius + " degrees Celsius.");
        }
    }
