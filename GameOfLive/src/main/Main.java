package main;

import java.io.IOException;

public class Main {

    public static void main (String[] args) throws IOException{

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


        brett1.set(5, 5, true);
        
        if(brett1.getAktuell(5,5).equals(true))
        	System.out.println("getAktuell funktioniert.");
        
        brett1.printSpielbrett();
        System.out.println();
        
        brett1.random();

        brett1.printSpielbrett();
     
        brett1.speichern("Hello1.txt");
        

        boolean abc = true;



    }

    }



