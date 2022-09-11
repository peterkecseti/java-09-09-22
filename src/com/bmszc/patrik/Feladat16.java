package com.bmszc.patrik;

import com.sun.security.jgss.GSSUtil;

import java.lang.module.FindException;
import java.util.Scanner;

public class Feladat16 {
    public static Scanner sc = new Scanner(System.in);
    public static int[] tomb = new int[5];



    public static void feladat16(){
        System.out.println("16. feladat");
    // Számok bekérése

        for (int i = 0; i < tomb.length; i++) {
            float index = i + 1f;
            System.out.printf("Tömb %.0f. eleme: ", index);
            tomb[i] = sc.nextInt();
        }



    // Számok kiírása a megadás sorrendjében
        Main.Clear();
        System.out.println("Elemek megadási sorrendben:");
        for (int i = 0; i < tomb.length; i++) {
            int index = i + 1;
            System.out.println(index + ". elem: " + tomb[i]);
        }
        Main.Read();


    // Számok kiírása visszafelé
        Main.Clear();
        System.out.println("Elemek fordított sorrendben:");
        for (int i = 4; i >= 0; i--) {
            int index = i + 1;
            System.out.println(index + ". elem: " + tomb[i]);
        }
        Main.Read();

    // Index bekérés meghívása (4. feladatrész)
        Feladat16.indexBekeres();
    }
    public static void indexBekeres(){

    // Index bekérése
        System.out.println("Kiírandó elem indexe (1-5):");
        int index = sc.nextInt();
        if (index < 1 || index > 5){
            Feladat16.indexBekeres();
        }else{
            System.out.println(tomb[index-1]);
        }
        Main.Read();
    }
}
