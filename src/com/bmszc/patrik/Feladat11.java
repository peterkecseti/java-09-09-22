package com.bmszc.patrik;

public class Feladat11 {
    public static void feladat11(){


    // N bekérése
        System.out.println("N értéke: ");
        int N = Main.sc.nextInt() + 1;
    // Számok összeadása 1-től N-ig
        int out = 0;
        for (int i = 1; i < N; i++) {
            out = out + i;
        }
    // Kiírás
        System.out.println("Összeg: " + out);

        Main.Read();

    }
}
