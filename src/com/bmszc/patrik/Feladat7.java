package com.bmszc.patrik;
import java.util.Scanner;
public class Feladat7 {
    public static Scanner sc = new Scanner(System.in);
    public static void feladat7(){

        System.out.println("7. feladat");
        System.out.println("Hónap száma: ");
        int honap = sc.nextInt() - 1;
        String[] honapok = {"Január", "Február", "Március", "Április", "Május", "Június", "Július", "Augusztus", "Szeptember", "Október", "November", "December"};
        if (honap < 1 || honap > 12){
            System.out.println("Nincs ilyen hónap");
        }else{
            System.out.println(honapok[honap]);
        }

        Main.Read();


    }
}
