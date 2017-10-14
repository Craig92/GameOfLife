package main;

public class Spielbrett {

	int laenge;
	int breite;

	boolean array[][] = null;

	public Spielbrett(int laenge, int breite) {

		this.laenge = laenge;
		this.breite = breite;
		array = new boolean[laenge][breite];

		for (int i = 0; i < array.length; i++){
			for (int j = 0; j < array[i].length; j++ ){

				array[i][j] = false;

			}
		}

	}

	public void printSpielbrett() {

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
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
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = false;

			}
		}
	}

	void random() {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = Math.random() < 0.5;

			}
		}
		

	}

	void speichern(String filename) {

	}

	void laden(String filename) {

	}

	void start() {

	}

	void stop() {

	}

	@SuppressWarnings("unused")
	int checkNeighbours(int x, int y){

		for (int i = 0; i < array.length; i++) {

			for (int j = 0; j < array[i].length; j++) {
				Boolean aktuell= getAktuell(i,j);

				Boolean rechterNachbar = getAktuell(i+1,j+1);
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
