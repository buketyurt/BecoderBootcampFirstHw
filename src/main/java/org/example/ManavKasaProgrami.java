package org.example;

import java.util.Scanner;

public class ManavKasaProgrami {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //take fruits masses
        System.out.println("Armut kaç kilo ? :");
        double Armut = scanner.nextDouble();
        Armut = Armut * 2.14;

        System.out.println("Elma kaç kilo ? :");
        double Elma = scanner.nextDouble();
        Elma = Elma * 3.67;

        System.out.println("Domates kaç kilo ? :");
        double Domates = scanner.nextDouble();
        Domates = Domates * 1.11;

        System.out.println("Muz kaç kilo ? :");
        double Muz = scanner.nextDouble();
        Muz = Muz * 0.95;

        System.out.println("Patlıcan kaç kilo ? :");
        double Patlican = scanner.nextDouble();
        Patlican = Patlican * 5.00;

        double total = Armut + Elma + Domates + Muz + Patlican;
        System.out.println("Toplam Tutar : "+ total +" TL");
    }
}
