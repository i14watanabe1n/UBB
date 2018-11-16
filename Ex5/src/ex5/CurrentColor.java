package ex5;
import java.awt.Color;

public class CurrentColor {
	private int r = 0;
	private int g = 0;
	private int b = 0;
	private int[] vals = {0, 128, 255};
	
	public void changeRed() {
		r = (r+1)%3;
	}
	
	public void changeGreen() {
		g = (g+1)%3;
	}
	
	public void changeBlue() {
		b = (b+1)%3;
	}
	
	public Color getColor(){
		return new Color(vals[r],vals[g],vals[b]);
	}
}
