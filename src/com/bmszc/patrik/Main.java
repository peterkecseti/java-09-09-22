package com.bmszc.patrik;
import java.util.Random;
import java.util.Scanner;


public class Main {
    public static Random r = new Random();

    // Késleltetés
    public static void Read(){
        System.out.println("A folytatáshoz nyomjon meg egy billentyűt...");
        sc.nextLine();
    }

    // Konzol ürítése
    public static void Clear(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }



    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Feladat11.feladat11();
        feladat1();
        feladat2();
        Feladat4.feladat4();
        Feladat5.feladat5();
        Feladat6.feladat6();
        Feladat7.feladat7();
        Feladat8.feladat8();
        Feladat9.feladat9();
        Feladat12.feladat12();
        Feladat13.feladat13();
        Feladat14.feladat14();
        Feladat15.feladat15();
        Feladat16.feladat16();
        Feladat17.feladat17();


    }

    public static void feladat1() {
        double s;
        double r;
        double h;
        System.out.println("1. feladat");
        System.out.println("Medence átmérője:");

        s = sc.nextDouble();
        r = s / 2;
        System.out.println("Medence mélysége:");
        h = sc.nextDouble();
        System.out.printf("A medence térfogata: %.2f köbméter. ", (r * r * h * 3.14));

        Main.Read();
    }

    public static void feladat2() {
        System.out.println("2. feladat");
        double width = 0;
        double height = 0;
        double out = 0;
        System.out.println("\nFal magassága (cm): ");
        height = sc.nextDouble();
        System.out.println("Fal szélessége (cm): ");
        width = sc.nextDouble();
        out = Math.ceil((width * height) / 400);
        System.out.println(out + " darab csempe szükséges.");

        Main.Read();

    }


}
