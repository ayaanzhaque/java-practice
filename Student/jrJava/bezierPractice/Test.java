package jrJava.bezierPractice;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.GeneralPath;

import jrJava.bezierCurves.FancyDrawingBoard;

public class Test {

	public static void main(String[] args) {

		FancyDrawingBoard board = new FancyDrawingBoard(0,0,1000,700);
		Graphics2D g = (Graphics2D) board.getBufferedGraphics();

		Point p1 = new Point(200,200);
		Point c1 = new Point(300,50);
		Point c2 = new Point(500,650);
		Point p2 = new Point(700, 600);

		GeneralPath path = new GeneralPath();

		path.moveTo(p1.x, p1.y);
		path.curveTo(c1.x, c1.y, c2.x, c2.y, p2.x, p2.y);

		g.setColor(Color.BLUE);
		g.draw(path);

		g.setColor(Color.red);
		g.fillOval((int) (p1.x-2), (int) (p1.y-2), 4, 4);
		g.fillOval((int) (c1.x-2), (int) (c1.y-2), 4, 4);
		g.fillOval((int) (c2.x-2), (int) (c2.y-2), 4, 4);
		g.fillOval((int) (p2.x-2), (int) (p2.y-2), 4, 4);


		board.repaint();

	}

}
