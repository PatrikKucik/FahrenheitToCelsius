package Zasielka;

import java.util.Scanner;

public class Prasiaren {
    private Scanner prasa;

    public Prasiaren() {
    }
    
    Scanner scanner = new Scanner(System.in);
    double fahrenheit = scanner.nextDouble();
    double celsius = (fahrenheit - 32) * 5 / 9;
}
