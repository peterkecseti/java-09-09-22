package com.bmszc.patrik;
import java.util.Scanner;

public class Feladat14 {
    public static Scanner sc = new Scanner(System.in);

    // User input bekérés
    public static String MenuData(){

        System.out.println("Mit szeretne csinálni a szöveggel?");
        System.out.println("a\tNagybetűssé alakítás");
        System.out.println("b\tKisbetűssé alakítás");
        System.out.println("c\tHossz lekérdezése");
        System.out.println("d\tÖsszehasonlítás másik stringgel");
        System.out.println("e\tString egy részének kiíratása");
        System.out.println("f\tKilépés");
        String userinput = sc.nextLine();
        return userinput;
    }

    public static void feladat14(){
        System.out.println("14. feladat");
        String userinput = MenuData();
        if (userinput.equals("a") || userinput.equals("b") || userinput.equals("c") || userinput.equals("d") || userinput.equals("e") || userinput.equals("f")){

            switch(userinput){
                case "a":
                    System.out.println("\"a\" opció kiválasztva."); Feladat14.feladat14();
                case "b":
                    System.out.println("\"b\" opció kiválasztva."); Feladat14.feladat14();
                case "c":
                    System.out.println("\"c\" opció kiválasztva."); Feladat14.feladat14();
                case "d":
                    System.out.println("\"d\" opció kiválasztva."); Feladat14.feladat14();
                case "e":
                    System.out.println("\"e\" opció kiválasztva."); Feladat14.feladat14();
                case "f":
                    System.out.println("\"f\" opció kiválasztva."); Feladat15.feladat15();
            }

        }else{
            System.out.println("Nem megfelelő válasz");
            Feladat14.feladat14();
        }

        Main.Clear();


    }
}



