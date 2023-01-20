package org.example;

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
        int [] monthNum = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        int month = monthNum[11];
        switch (month) {
            case 3:
            case 4:
            case 5:
                System.out.println("wiosna");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("lato");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("jesień");
            case 12:
            case 1:
            case 2:
                System.out.println("zima");
                break;
            default:
                System.out.println("Miesiąc: " + month);
        }
    }
}
