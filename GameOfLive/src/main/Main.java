package main;

public class Main {

    public static void main (String[] args){

        int Länge;
        int Breite;

        System.out.println("Bitte geben Sie die Spielbrettgröße an");

        java.util.Scanner scanner = new java.util.Scanner(System.in);


        System.out.println("Länge angeben");
        Länge = scanner.nextInt();

        System.out.println("Breite angeben");
        Breite = scanner.nextInt();

        Spielbrett brett1 = new Spielbrett(Länge, Breite);

        System.out.println("Spielbrett hat Länge" + brett1.länge + " Breite:" + brett1.breite);


        brett1.set(5, 5, true);

        brett1.printSpielbrett();

        boolean abc = true;



    }

    }



