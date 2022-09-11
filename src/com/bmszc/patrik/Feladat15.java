package com.bmszc.patrik;
import java.util.Random;

public class Feladat15 {
    public static Random r = new Random();

    public static void feladat15() {

    // 25 elemű tömb feltöltése random számokkal (0-100)
        int[] tomb = new int[25];
        for (int i = 0; i < 24; i++) {
            tomb[i] = r.nextInt(101 - 0);

        }
    // Páratlan indexű elemek négyzetre emelése
        for (int i = 1; i < tomb.length + 1; i++) {
            //System.out.println(tomb[i] + ", ");
            if (i % 2 == 0){
    //Négyzetre emelt elemek kiírása
                System.out.printf("%.0f\n", Math.pow(tomb[i], 2));
            }
        }
        Main.Read();
    }
}
