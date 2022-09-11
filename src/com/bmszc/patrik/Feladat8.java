package com.bmszc.patrik;
import java.util.Scanner;

public class Feladat8 {
    public static Scanner sc = new Scanner(System.in);
    public static void feladat8(){

        System.out.println("7. feladat");
        System.out.printf("Fej vagy írás? (0 - F/1 - I)");
        int tipp = sc.nextInt();
        int gepDobas = (int)Math.random() * 2;
        System.out.printf("Dobás eredménye: %s", gepDobas == 0? "fej" : "írás");

        if (tipp == gepDobas){
            System.out.println("gratula");
        } else {
            System.out.println("nem nyert");
        }

        Main.Read();
    }
}
