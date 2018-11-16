package ex5;

import java.awt.Graphics;

import javax.swing.JPanel;

public class DiskPanel extends JPanel{
	private int radius = 100;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
		repaint();
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		int r;
		super.paintComponent(g);
		r = getRadius();
		g.fillArc((this.getWidth() - r)/2, (this.getHeight() - r)/2, r, r, 0, 360);
	}
	
	

}
