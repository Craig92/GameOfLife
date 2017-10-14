package main;

public class Main {

    public static void main (String[] args){

        int laenge;
        int breite;

        System.out.println("bitte geben Sie die Spielbrettgroesse an");

        java.util.Scanner scanner = new java.util.Scanner(System.in);


        System.out.println("laenge angeben");
        laenge = scanner.nextInt();

        System.out.println("breite angeben");
        breite = scanner.nextInt();

        Spielbrett brett1 = new Spielbrett(laenge, breite);

        System.out.println("Spielbrett hat laenge" + brett1.laenge + " breite:" + brett1.breite);


       // brett1.set(5, 5, true);
        
        brett1.random();

        brett1.printSpielbrett();

        boolean abc = true;



    }

    }



