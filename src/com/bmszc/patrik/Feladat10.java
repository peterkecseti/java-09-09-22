package com.bmszc.patrik;

import javax.swing.*;
import java.util.*;

public class Feladat10 {
    public static void feladat10() {

        System.out.println("10. feladat");
        Scanner sc = new Scanner(System.in);
        int osszeg = 0;
        int paratlan = 0;
        int paros = 0;

        while (osszeg <= 100){
        int temp = sc.nextInt();
        osszeg += temp;
        if (temp % 2 == 0){
            paros++;
        }
        else{
            paratlan++;
        }
        }
        System.out.println();

        Main.Read();
    }}

