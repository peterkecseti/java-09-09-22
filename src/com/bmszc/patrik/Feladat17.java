package com.bmszc.patrik;
public class Feladat17 {

    static int[] tomb1 = new int[10];
    static int[] tomb2 = new int[10];
    static int[] elemOsszegek = new int[10];

    public static void feladat17(){
        System.out.println("17. feladat");
        for (int i = 0; i < tomb1.length; i++) {
            tomb1[i] = Main.r.nextInt(101-0);
            tomb2[i] = Main.r.nextInt(101-0);
            elemOsszegek[i] = tomb1[i] + tomb2[i];
            System.out.println("- " + elemOsszegek[i] + "\n");
        }


    }

}
