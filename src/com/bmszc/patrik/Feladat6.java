package com.bmszc.patrik;

import java.util.Scanner;

public class Feladat6 {
    public static Scanner sc = new Scanner(System.in);
    public static void feladat6(){

        System.out.println("6. feladat");
        System.out.println("Pontszám (0-100):");
        short pontok = sc.nextShort();
        if (pontok >= 0 && pontok >= 42){
            System.out.println("Elégtelen");
        }if (pontok >= 43 && pontok >= 57){
            System.out.println("Elégséges");
        }if (pontok >= 58 && pontok >= 72){
            System.out.println("Közepes");
        }if (pontok >= 73 && pontok >= 87){
            System.out.println("Jó");
        }if (pontok >= 88 && pontok >= 100){
            System.out.println("Jeles");
        }

        Main.Read();
    }
}
