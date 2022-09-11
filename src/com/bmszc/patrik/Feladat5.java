package com.bmszc.patrik;

import java.util.Scanner;

public class Feladat5 {
    public static Scanner sc = new Scanner(System.in);

    public static void feladat5() {

        System.out.println("5. feladat");
        System.out.println("Téglalap \"a\" oldala (cm): ");
        float a = sc.nextFloat();
        System.out.println("Téglalap \"b\" oldala (cm): ");
        float b = sc.nextFloat();
        System.out.println("Kerület vagy terület? (K/T)");
        if (a == b){
            System.out.println("Ez egy négyzet.");
        }
        char taskType = sc.next().charAt(0);
        if (taskType == 'T') {
            System.out.printf("Téglalap területe: %.2f cm^2", a * b);
        } else if (taskType == 'K') {
            System.out.printf("Téglalap kerülete: %.2f cm^2", 2 * (a + b));
        } else {
            System.out.println("Ez nem egy művelet.");
        }

        Main.Read();

    }
}
