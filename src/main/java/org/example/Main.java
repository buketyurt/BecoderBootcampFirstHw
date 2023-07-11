package org.example;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //take Height
        System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        Float Boy = scanner.nextFloat();

        //take Weight
        System.out.println("Lütfen kilonuzu giriniz : ");
        Float Kilo = scanner.nextFloat();
        //Apply formula
        Float BodyMassIndex = Kilo / (Boy * Boy);
        //print
        System.out.println("Vücut Kitle İndeksiniz : " + BodyMassIndex);


        }
    }