package org.example;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        Float Boy = scanner.nextFloat();


        System.out.println("Lütfen kilonuzu giriniz : ");
        Float Kilo = scanner.nextFloat();

        Float BodyMassIndex = Kilo / (Boy * Boy);
        System.out.println("Vücut Kitle İndeksiniz : " + BodyMassIndex);


        }
    }