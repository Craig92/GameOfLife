package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Spielbrett {

	int laenge;
	int breite;

	boolean array[][] = null;

	public Spielbrett(int laenge, int breite) {

		this.laenge = laenge;
		this.breite = breite;
		array = new boolean[laenge][breite];

		for (int i = 0; i < array.length; i++){
			for (int j = 0; j < array[0].length; j++ ){

				array[i][j] = false;

			}
		}

	}

	public void printSpielbrett() {

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				boolean b = (array[i][j]);
				System.out.print(" "+b+" ");
			}
			System.out.println();
		}
	}

	void set(int x, int y, boolean b) {

			array[x][y] = b;

	}

	void reset() {

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				array[i][j] = false;

			}
		}
	}

	void random() {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				array[i][j] = Math.random() < 0.5;

			}
		}
		

	}

	void speichern(String filename) throws IOException {
		
		// creates a FileWriter Object
	      FileWriter writer = new FileWriter(filename); 
	      
	      writer.write(" "+array.length+" "); 
	      writer.write(" "+array[0].length+" "); 
	      for (int i = 0; i < array.length; i++) {
				for (int j = 0; j < array[0].length; j++) {
					Boolean b=array[i][j] ;
					// Writes the content to the file
					writer.write(b+" "); 
				}
			}
	      
	      
	      writer.flush();
	      writer.close();

	}

	void laden(File file) throws IOException {
		  
		List<Boolean[]> list = new ArrayList<Boolean[]>();
		
		BufferedReader read = new BufferedReader(new FileReader(file));
		String in = read.readLine();
		
//		while(in != null) {
//			String 
//		}
//		
//		5
		
		// Creates a FileReader Object
//	      FileReader fr = new FileReader(filename);
	      
	      for (int i = 0; i < array.length; i++) {
				for (int j = 0; j < array[0].length; j++) {
					//array[i][j]= fr.read(a); ;
					
				}
			}
	      char [] a = new char[50];
//	      fr.read(a);   // reads the content to the array

	}

	void start() {

	}

	void stop() {

	}

	@SuppressWarnings("unused")
	int checkNeighbours(int x, int y){
		int anzahlNachbarn=0;

		for (int i = 0; i < array.length; i++) {

			for (int j = 0; j < array[0].length; j++) {
				//Boolean aktuell= getAktuell(i,j);

				if(i+1<=array.length&&j+1<=array[i].length) {
				Boolean rechterNachbar = getAktuell(i+1,j+1);
				}else {
					
				}
				Boolean rechtsUnten = getAktuell(i+1,j);
				Boolean rechtsOben = getAktuell(i+1,j-1);

				Boolean linkerNachbar = getAktuell(1-1,j+1);
				Boolean linksOben = getAktuell(i-1,j);
				Boolean linksUnten = getAktuell(i-1,j-1);

				Boolean unten = getAktuell(i+1,j);
				Boolean oben = getAktuell(i+1,j);


			}

		}
		return 1;
	}
	
	Boolean getAktuell(int x, int y) {
				return array[x][y];	
	}

	void einzelSchritt() {

	}
}
