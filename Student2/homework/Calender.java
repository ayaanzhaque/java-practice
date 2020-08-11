package homework;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

import resources.DrawingBoard;

public class Calender {

	public static void main(String[] args) {
		
		
		DrawingBoard board = new DrawingBoard(0, 0, 1400, 800);
		Graphics canvas = board.getCanvas();
		
		canvas.setFont(new Font("arial", Font.BOLD, 50));
		
		canvas.setColor(Color.black);
		canvas.drawString("November", 550, 35);
		
		canvas.setColor(Color.black);
		canvas.setFont(new Font("arial", Font.BOLD, 40));
		
		canvas.drawString("S", 75, 75);
		canvas.drawString("M", 275, 75);
		canvas.drawString("T", 475, 75);
		canvas.drawString("W", 675, 75);
		canvas.drawString("T", 875, 75);
		canvas.drawString("F", 1075, 75);
		canvas.drawString("S", 1275, 75);
		
		canvas.drawLine(200, 75, 200, 800);
		canvas.drawLine(400, 75, 400, 800);
		canvas.drawLine(600, 75, 600, 800);
		canvas.drawLine(800, 75, 800, 800);
		canvas.drawLine(1000, 75, 1000, 800);
		canvas.drawLine(1200, 75, 1200, 800);
		
		canvas.drawLine(0, 160, 1400, 160);
		canvas.drawLine(0, 320, 1400, 320);
		canvas.drawLine(0, 480, 1400, 480);
		canvas.drawLine(0, 640, 1400, 640);
		
		canvas.setFont(new Font("arial", Font.BOLD, 25));
		
		canvas.setColor(Color.gray);
		
		canvas.drawString("29", 170, 155);
		canvas.drawString("30", 370, 155);
		canvas.drawString("31", 570, 155);
		
		canvas.setColor(Color.RED);
		
		canvas.drawString("1", 775, 155);
		canvas.drawString("2", 975, 155);
		canvas.drawString("3", 1175, 155);
		canvas.drawString("4", 1375, 155);
		
		canvas.drawString("5", 175, 315);
		canvas.drawString("6", 375, 315);
		canvas.drawString("7", 575, 315);
		canvas.drawString("8", 775, 315);
		canvas.drawString("9", 975, 315);
		canvas.drawString("10", 1170, 315);
		canvas.drawString("11", 1370, 315);
		
		canvas.drawString("12", 170, 475);
		canvas.drawString("13", 370, 475);
		canvas.drawString("14", 570, 475);
		canvas.drawString("15", 770, 475);
		canvas.drawString("16", 970, 475);
		canvas.drawString("17", 1170, 475);
		canvas.drawString("18", 1370, 475);
		
		canvas.drawString("19", 170, 635);
		canvas.drawString("20", 370, 635);
		canvas.drawString("21", 570, 635);
		canvas.drawString("22", 770, 635);
		canvas.drawString("23", 970, 635);
		canvas.drawString("24", 1170, 635);
		canvas.drawString("25", 1370, 635);
		
		canvas.drawString("26", 170, 730);
		canvas.drawString("27", 370, 730);
		canvas.drawString("28", 570, 730);
		canvas.drawString("29", 770, 730);
		canvas.drawString("30", 970, 730);
		
		canvas.setColor(Color.gray);
		
		canvas.drawString("1", 1170, 730);
		canvas.drawString("2", 1370, 730);
		
		
		
		

		board.repaint();

	}

}
