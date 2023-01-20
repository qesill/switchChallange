package org.example;

//import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*
        Wykorzystaj switch do określenia pory roku na bazie numeru
        miesiąca w zmiennej monthNum (od 1 do 12).
        Zaprezentuj w konsoli informację o porze roku. Pory roku dla liczb:
        3, 4, 5 - wiosna
        6, 7, 8, - lato
        9, 10, 11 - jesień
        12, 1, 2 -zima
        */
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("Podaj numer miesiąca");
            int[] monthNum = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
            String[] seson = {"Wiosna", "Lato", "Jesień", "Zima", "Brak informacji"};
            int sesonIndex;
            int monthIndex = scan.nextInt();


                int month = monthNum[monthIndex - 1];


            switch (month) {
                case 3:
                case 4:
                case 5:
                    sesonIndex = 0;
                    break;
                case 6:
                case 7:
                case 8:
                    sesonIndex = 1;
                    break;
                case 9:
                case 10:
                case 11:
                    sesonIndex = 2;
                    break;
                case 12:
                case 1:
                case 2:
                    sesonIndex = 3;
                    break;
                default:
                    sesonIndex = 4;
            }
            System.out.println("Numer miesiąca: " + month + " to pora roku: " + seson[sesonIndex]);
            } catch (Exception e){
                   System.out.println("Nie ma takiego miesiąca");}
        }



}
