package seventhDrawing;

import sketchboard.EtchASketch;

public class DrawingInstructor {

	private static int x=0, y=0;
	
	private int betrag(int x) {
		if(x<0) return -x;
		else return x;
	}
	
	public static String getTitle() {
		return "Beispiel Diagonale rote gestrichelte Linie über den ganzen Screen";
	}

	public static int firstX(int max) {
		x=-max;   // center of drawing panel
		return x;
	}

	public static int firstY(int max) {
		y=-max;   // center of drawing panel
		return y;
	}

	public static int nextX(int max) {
		x++;
		return x;// horizontal line, x increasing	
	}

	public static int nextY(int max) {
		y++;
		return y;  // horizontal line, y unchanged
	}
	
	public static int nextColor() {
		return EtchASketch.RED;    // colour selection
	}

}