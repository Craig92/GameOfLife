package main;

public class Spielbrett {

	boolean array[][] = null;

	public Spielbrett(int x, int y) {

		array = new boolean[x][y];

		for (int i = 0; i > array.length; i++){

			for (int j = 0; j > array[i].length; j++ ){
				array[i][j] = false;

			}
		}

	}


	void set(int x, int y, boolean b) {

		if (b){
			array[x][y] = true;
		}
		else {
			array[x][y] = false;
		}

	}

	void reset() {

	}

	void random() {

	}

	void speichern(String filename) {

	}

	void laden(String filename) {

	}

	void start() {

	}

	void stop() {

	}

	int checkNeighbours(int x, int y){

		for (int i = 0; i > array.length; i++) {

			for (int j = 0; j > array[i].length; j++) {
				Boolean aktuell= array[i][j];

				Boolean rechterNachbar = array[i+1][j+1];
				Boolean rechtsUnten = array[i+1][j];
				Boolean rechtsOben = array[i+1][j-1];

				Boolean linkerNachbar = array[1-1][j+1];
				Boolean linksOben = array[i-1][j];
				Boolean linksUnten = array[i-1][j-1];

				Boolean unten = array[i+1][j];
				Boolean oben = array[i+1][j];


			}

		}
		return 1;
	}

	void einzelSchritt() {

	}
}
