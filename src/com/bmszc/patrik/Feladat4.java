package com.bmszc.patrik;


import java.util.Scanner;

public class Feladat4 {
    public static Scanner sc = new Scanner(System.in);

    public static void feladat4() {

        System.out.println("4. feladat");
        System.out.println("\"a\" oldal hossza:");
        float a = sc.nextFloat();
        System.out.println("\"b\" oldal hossza:");
        float b = sc.nextFloat();
        System.out.println("\"c\" oldal hossza:");
        float c = sc.nextFloat();

        if (a + b > c && a + c > b && b + c > a) {
            double k = a + b + c;
            System.out.printf("A háromszög kerülete %.2f cm^2.", k);
        } else {
            System.out.println("A nem háromszög szerkeszthető");
        }

        Main.Read();


    }
}
