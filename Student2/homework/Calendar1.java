package homework;


import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import resources.DrawingBoard;


public class Calendar1 {

	public static void main(String[] args) {
		
		 	int year = 2017;
		    int monthNum = 3; // January
		    int date = 1;
		    String month = "Month";
		    int daysInMonth = 0;

		    Calendar cal = Calendar.getInstance();
		    cal.clear();

		    cal.set(Calendar.YEAR, year);
		    cal.set(Calendar.MONTH, monthNum);
		    cal.set(Calendar.DATE, date);

		    java.util.Date utilDate = cal.getTime();
		    System.out.println(utilDate);
		    
		    
	        Calendar calendar = Calendar.getInstance();
	        calendar.setTime(utilDate);
	        
	        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
	        
	        
	        DrawingBoard board = new DrawingBoard(0, 0, 1400, 600);
			Graphics canvas = board.getCanvas();
			
			
			board.clear();
			
			canvas.setColor(Color.BLACK);
			
			canvas.drawLine(200, 0, 200, 800);
			canvas.drawLine(400, 0, 400, 800);
			canvas.drawLine(600, 0, 600, 800);
			canvas.drawLine(800, 0, 800, 800);
			canvas.drawLine(1000, 0, 1000, 800);
			canvas.drawLine(1200, 0, 1200, 800);
			
			
			canvas.drawLine(0, 100, 1400, 100);
			canvas.drawLine(0, 200, 1400, 200);
			canvas.drawLine(0, 300, 1400, 300);
			canvas.drawLine(0, 400, 1400, 400);
			canvas.drawLine(0, 500, 1400, 500);
			
			
			canvas.setFont(new Font("arial", Font.BOLD, 35));
			canvas.drawString("S", 75, 25);
			canvas.drawString("M", 275, 25);
			canvas.drawString("T", 475, 25);
			canvas.drawString("W", 675, 25);
			canvas.drawString("T", 875, 25);
			canvas.drawString("F", 1075, 25);
			canvas.drawString("S", 1275, 25);
			
			board.repaint();
			
			if(monthNum==0){
				month = "January";
				daysInMonth = 31;
				
				if(dayOfWeek==1) calSun(canvas, board, daysInMonth);
				else if(dayOfWeek==2) calMon(canvas, board, daysInMonth);
				else if(dayOfWeek==3) calTues(canvas, board, daysInMonth);
				else if(dayOfWeek==4) calWed(canvas, board, daysInMonth);
				else if(dayOfWeek==5) calThurs(canvas, board,daysInMonth);
				else if(dayOfWeek==6) calFri(canvas, board, daysInMonth);
				else if(dayOfWeek==7) calSat(canvas, board, daysInMonth);
			}
			else if(monthNum==1){
				month = "Feb";
				daysInMonth = 28;
				
				if(dayOfWeek==1) calSun(canvas, board, daysInMonth);
				else if(dayOfWeek==2) calMon(canvas, board, daysInMonth);
				else if(dayOfWeek==3) calTues(canvas, board, daysInMonth);
				else if(dayOfWeek==4) calWed(canvas, board, daysInMonth);
				else if(dayOfWeek==5) calThurs(canvas, board,daysInMonth);
				else if(dayOfWeek==6) calFri(canvas, board, daysInMonth);
				else if(dayOfWeek==7) calSat(canvas, board, daysInMonth);
			}
			else if(monthNum==2){
				month = "March";
				daysInMonth = 31;
				
				if(dayOfWeek==1) calSun(canvas, board, daysInMonth);
				else if(dayOfWeek==2) calMon(canvas, board, daysInMonth);
				else if(dayOfWeek==3) calTues(canvas, board, daysInMonth);
				else if(dayOfWeek==4) calWed(canvas, board, daysInMonth);
				else if(dayOfWeek==5) calThurs(canvas, board,daysInMonth);
				else if(dayOfWeek==6) calFri(canvas, board, daysInMonth);
				else if(dayOfWeek==7) calSat(canvas, board, daysInMonth);
			}
			else if(monthNum==3) {
				month = "April";
				daysInMonth = 30;
				
				if(dayOfWeek==1) calSun(canvas, board, daysInMonth);
				else if(dayOfWeek==2) calMon(canvas, board, daysInMonth);
				else if(dayOfWeek==3) calTues(canvas, board, daysInMonth);
				else if(dayOfWeek==4) calWed(canvas, board, daysInMonth);
				else if(dayOfWeek==5) calThurs(canvas, board,daysInMonth);
				else if(dayOfWeek==6) calFri(canvas, board, daysInMonth);
				else if(dayOfWeek==7) calSat(canvas, board, daysInMonth);
			}
			else if(monthNum==4){
				month = "May";
				daysInMonth = 31;
				
				if(dayOfWeek==1) calSun(canvas, board, daysInMonth);
				else if(dayOfWeek==2) calMon(canvas, board, daysInMonth);
				else if(dayOfWeek==3) calTues(canvas, board, daysInMonth);
				else if(dayOfWeek==4) calWed(canvas, board, daysInMonth);
				else if(dayOfWeek==5) calThurs(canvas, board,daysInMonth);
				else if(dayOfWeek==6) calFri(canvas, board, daysInMonth);
				else if(dayOfWeek==7) calSat(canvas, board, daysInMonth);
			}
			else if(monthNum==5){
				month = "June";
				daysInMonth = 30;
				
				if(dayOfWeek==1) calSun(canvas, board, daysInMonth);
				else if(dayOfWeek==2) calMon(canvas, board, daysInMonth);
				else if(dayOfWeek==3) calTues(canvas, board, daysInMonth);
				else if(dayOfWeek==4) calWed(canvas, board, daysInMonth);
				else if(dayOfWeek==5) calThurs(canvas, board,daysInMonth);
				else if(dayOfWeek==6) calFri(canvas, board, daysInMonth);
				else if(dayOfWeek==7) calSat(canvas, board, daysInMonth);
			}
			else if(monthNum==6){
				month = "July";
				daysInMonth = 31;
				
				if(dayOfWeek==1) calSun(canvas, board, daysInMonth);
				else if(dayOfWeek==2) calMon(canvas, board, daysInMonth);
				else if(dayOfWeek==3) calTues(canvas, board, daysInMonth);
				else if(dayOfWeek==4) calWed(canvas, board, daysInMonth);
				else if(dayOfWeek==5) calThurs(canvas, board,daysInMonth);
				else if(dayOfWeek==6) calFri(canvas, board, daysInMonth);
				else if(dayOfWeek==7) calSat(canvas, board, daysInMonth);
			}
			else if(monthNum==7){
				month = "August";
				daysInMonth = 31;
				
				if(dayOfWeek==1) calSun(canvas, board, daysInMonth);
				else if(dayOfWeek==2) calMon(canvas, board, daysInMonth);
				else if(dayOfWeek==3) calTues(canvas, board, daysInMonth);
				else if(dayOfWeek==4) calWed(canvas, board, daysInMonth);
				else if(dayOfWeek==5) calThurs(canvas, board,daysInMonth);
				else if(dayOfWeek==6) calFri(canvas, board, daysInMonth);
				else if(dayOfWeek==7) calSat(canvas, board, daysInMonth);
			}
			else if(monthNum==8){
				month = "September";
				daysInMonth = 30;
				
				if(dayOfWeek==1) calSun(canvas, board, daysInMonth);
				else if(dayOfWeek==2) calMon(canvas, board, daysInMonth);
				else if(dayOfWeek==3) calTues(canvas, board, daysInMonth);
				else if(dayOfWeek==4) calWed(canvas, board, daysInMonth);
				else if(dayOfWeek==5) calThurs(canvas, board,daysInMonth);
				else if(dayOfWeek==6) calFri(canvas, board, daysInMonth);
				else if(dayOfWeek==7) calSat(canvas, board, daysInMonth);
			}
			else if(monthNum==9){
				month = "October";
				daysInMonth = 31;
				
				if(dayOfWeek==1) calSun(canvas, board, daysInMonth);
				else if(dayOfWeek==2) calMon(canvas, board, daysInMonth);
				else if(dayOfWeek==3) calTues(canvas, board, daysInMonth);
				else if(dayOfWeek==4) calWed(canvas, board, daysInMonth);
				else if(dayOfWeek==5) calThurs(canvas, board,daysInMonth);
				else if(dayOfWeek==6) calFri(canvas, board, daysInMonth);
				else if(dayOfWeek==7) calSat(canvas, board, daysInMonth);
			}
			else if(monthNum==10){
				month = "November";
				daysInMonth = 30;
				
				if(dayOfWeek==1) calSun(canvas, board, daysInMonth);
				else if(dayOfWeek==2) calMon(canvas, board, daysInMonth);
				else if(dayOfWeek==3) calTues(canvas, board, daysInMonth);
				else if(dayOfWeek==4) calWed(canvas, board, daysInMonth);
				else if(dayOfWeek==5) calThurs(canvas, board,daysInMonth);
				else if(dayOfWeek==6) calFri(canvas, board, daysInMonth);
				else if(dayOfWeek==7) calSat(canvas, board, daysInMonth);
				
				if(dayOfWeek==1) calSun(canvas, board, daysInMonth);
				else if(dayOfWeek==2) calMon(canvas, board, daysInMonth);
				else if(dayOfWeek==3) calTues(canvas, board, daysInMonth);
				else if(dayOfWeek==4) calWed(canvas, board, daysInMonth);
				else if(dayOfWeek==5) calThurs(canvas, board,daysInMonth);
				else if(dayOfWeek==6) calFri(canvas, board, daysInMonth);
				else if(dayOfWeek==7) calSat(canvas, board, daysInMonth);
				
			}
			else if(monthNum==11){
				month = "December";
				daysInMonth = 31;
				
				if(dayOfWeek==1) calSun(canvas, board, daysInMonth);
				else if(dayOfWeek==2) calMon(canvas, board, daysInMonth);
				else if(dayOfWeek==3) calTues(canvas, board, daysInMonth);
				else if(dayOfWeek==4) calWed(canvas, board, daysInMonth);
				else if(dayOfWeek==5) calThurs(canvas, board,daysInMonth);
				else if(dayOfWeek==6) calFri(canvas, board, daysInMonth);
				else if(dayOfWeek==7) calSat(canvas, board, daysInMonth);
			}
	
			canvas.setFont(new Font("arial", Font.BOLD, 50));
			canvas.setColor(Color.RED);
			canvas.drawString(month, 550, 50);
			
			board.repaint();
	}
	
	
	private static void calSun(Graphics canvas, DrawingBoard board, int daysInMonth) {
		
		canvas.setColor(Color.red);
		canvas.setFont(new Font("arial", Font.BOLD, 25));
		
		canvas.drawString("1", 180, 100);
		canvas.drawString("2", 380, 100);
		canvas.drawString("3", 580, 100);
		canvas.drawString("4", 780, 100);
		canvas.drawString("5", 980, 100);
		canvas.drawString("6", 1180, 100);
		canvas.drawString("7", 1380, 100);
		
		canvas.drawString("8", 180, 200);
		canvas.drawString("9", 380, 200);
		canvas.drawString("10", 570, 200);
		canvas.drawString("11", 770, 200);
		canvas.drawString("12", 970, 200);
		canvas.drawString("13", 1170, 200);
		canvas.drawString("14", 1370, 200);
		
		canvas.drawString("15", 170, 300);
		canvas.drawString("16", 370, 300);
		canvas.drawString("17", 570, 300);
		canvas.drawString("18", 770, 300);
		canvas.drawString("19", 970, 300);
		canvas.drawString("20", 1170, 300);
		canvas.drawString("21", 1370, 300);
		
		canvas.drawString("22", 170, 400);
		canvas.drawString("23", 370, 400);
		canvas.drawString("24", 570, 400);
		canvas.drawString("25", 770, 400);
		canvas.drawString("26", 970, 400);
		canvas.drawString("27", 1170, 400);
		canvas.drawString("28", 1370, 400);
		
		if(daysInMonth==30){
			canvas.setColor(Color.red);
			canvas.setFont(new Font("arial", Font.BOLD, 25));
			canvas.drawString("29", 170, 500);
			canvas.drawString("30", 370, 500);
			board.repaint();
		}
		else if(daysInMonth==31){
			canvas.setColor(Color.red);
			canvas.setFont(new Font("arial", Font.BOLD, 25));
			canvas.drawString("29", 170, 500);
			canvas.drawString("30", 370, 500);
			canvas.drawString("31", 570, 500);
			board.repaint();
		}
		
	}
	
	private static void calMon(Graphics canvas, DrawingBoard board, int daysInMonth) {
		
		canvas.setColor(Color.red);
		canvas.setFont(new Font("arial", Font.BOLD, 25));
		
		canvas.drawString("1", 380, 100);
		canvas.drawString("2", 580, 100);
		canvas.drawString("3", 780, 100);
		canvas.drawString("4", 980, 100);
		canvas.drawString("5", 1180, 100);
		canvas.drawString("6", 1380, 100);
		canvas.drawString("7", 180, 200);
		canvas.drawString("8", 380, 200);
		canvas.drawString("9", 570, 200);
		canvas.drawString("10", 770, 200);
		canvas.drawString("11", 970, 200);
		canvas.drawString("12", 1170, 200);
		canvas.drawString("13", 1370, 200);
		canvas.drawString("14", 170, 300);
		canvas.drawString("15", 370, 300);
		canvas.drawString("16", 570, 300);
		canvas.drawString("17", 770, 300);
		canvas.drawString("18", 970, 300);
		canvas.drawString("19", 1170, 300);
		canvas.drawString("20", 1370, 300);
		canvas.drawString("21", 170, 400);
		canvas.drawString("22", 370, 400);
		canvas.drawString("23", 570, 400);
		canvas.drawString("24", 770, 400);
		canvas.drawString("25", 970, 400);
		canvas.drawString("26", 1170, 400);
		canvas.drawString("27", 1370, 400);
		canvas.drawString("28", 170, 500);
		
		if(daysInMonth==30){
			canvas.setColor(Color.red);
			canvas.setFont(new Font("arial", Font.BOLD, 25));
			canvas.drawString("29", 370, 500);
			canvas.drawString("30", 570, 500);
			board.repaint();
		}
		else if(daysInMonth==31){
			canvas.setColor(Color.red);
			canvas.setFont(new Font("arial", Font.BOLD, 25));
			canvas.drawString("29", 370, 500);
			canvas.drawString("30", 570, 500);
			canvas.drawString("31", 770, 500);
			board.repaint();
		}
		
	}
	
	private static void calTues(Graphics canvas, DrawingBoard board, int daysInMonth) {
		
		canvas.setColor(Color.red);
		canvas.setFont(new Font("arial", Font.BOLD, 25));
		
		canvas.drawString("1", 580, 100);
		canvas.drawString("2", 780, 100);
		canvas.drawString("3", 980, 100);
		canvas.drawString("4", 1180, 100);
		canvas.drawString("5", 1380, 100);
		canvas.drawString("6", 180, 200);
		canvas.drawString("7", 380, 200);
		canvas.drawString("8", 580, 200);
		canvas.drawString("9", 780, 200);
		canvas.drawString("10", 970, 200);
		canvas.drawString("11", 1170, 200);
		canvas.drawString("12", 1370, 200);
		canvas.drawString("13", 170, 300);
		canvas.drawString("14", 370, 300);
		canvas.drawString("15", 570, 300);
		canvas.drawString("16", 770, 300);
		canvas.drawString("17", 970, 300);
		canvas.drawString("18", 1170, 300);
		canvas.drawString("19", 1370, 300);
		canvas.drawString("20", 170, 400);
		canvas.drawString("21", 370, 400);
		canvas.drawString("22", 570, 400);
		canvas.drawString("23", 770, 400);
		canvas.drawString("24", 970, 400);
		canvas.drawString("25", 1170, 400);
		canvas.drawString("26", 1370, 400);
		canvas.drawString("27", 170, 500);
		canvas.drawString("28", 370, 500);
		
		if(daysInMonth==30){
			canvas.setColor(Color.red);
			canvas.setFont(new Font("arial", Font.BOLD, 25));
			canvas.drawString("29", 570, 500);
			canvas.drawString("30", 770, 500);
			board.repaint();
		}
		else if(daysInMonth==31){
			canvas.setColor(Color.red);
			canvas.setFont(new Font("arial", Font.BOLD, 25));
			canvas.drawString("29", 570, 500);
			canvas.drawString("30", 770, 500);
			canvas.drawString("31", 970, 500);
			board.repaint();
		}

		
	}
	
	private static void calThurs(Graphics canvas, DrawingBoard board, int daysInMonth) {
		
		canvas.setColor(Color.red);
		canvas.setFont(new Font("arial", Font.BOLD, 25));
		
		canvas.drawString("1", 980, 100);
		canvas.drawString("2", 1180, 100);
		canvas.drawString("3", 1380, 100);
		canvas.drawString("4", 180, 200);
		canvas.drawString("5", 380, 200);
		canvas.drawString("6", 580, 200);
		canvas.drawString("7", 780, 200);
		canvas.drawString("8", 980, 200);
		canvas.drawString("9", 1170, 200);
		canvas.drawString("10", 1370, 200);
		canvas.drawString("11", 170, 300);
		canvas.drawString("12", 370, 300);
		canvas.drawString("13", 570, 300);
		canvas.drawString("14", 770, 300);
		canvas.drawString("15", 970, 300);
		canvas.drawString("16", 1170, 300);
		canvas.drawString("17", 1370, 300);
		canvas.drawString("18", 170, 400);
		canvas.drawString("19", 370, 400);
		canvas.drawString("20", 570, 400);
		canvas.drawString("21", 770, 400);
		canvas.drawString("22", 970, 400);
		canvas.drawString("23", 1170, 400);
		canvas.drawString("24", 1370, 400);
		canvas.drawString("25", 170, 500);
		canvas.drawString("26", 370, 500);
		canvas.drawString("27", 570, 500);
		canvas.drawString("28", 770, 500);
		
		if(daysInMonth==30){
			canvas.setColor(Color.red);
			canvas.setFont(new Font("arial", Font.BOLD, 25));
			canvas.drawString("29", 970, 500);
			canvas.drawString("30", 1170, 500);
			board.repaint();
		}
		else if(daysInMonth==31){
			canvas.setColor(Color.red);
			canvas.setFont(new Font("arial", Font.BOLD, 25));
			canvas.drawString("29", 970, 500);
			canvas.drawString("30", 1170, 500);
			canvas.drawString("31", 1370, 500);
			board.repaint();
		}

		
	}
	
	private static void calWed(Graphics canvas, DrawingBoard board, int daysInMonth) {
		
		canvas.setColor(Color.red);
		canvas.setFont(new Font("arial", Font.BOLD, 25));
		
		canvas.drawString("1", 780, 100);
		canvas.drawString("2", 980, 100);
		canvas.drawString("3", 1180, 100);
		canvas.drawString("4", 1380, 100);
		canvas.drawString("5", 180, 200);
		canvas.drawString("6", 380, 200);
		canvas.drawString("7", 580, 200);
		canvas.drawString("8", 780, 200);
		canvas.drawString("9", 980, 200);
		canvas.drawString("10", 1170, 200);
		canvas.drawString("11", 1370, 200);
		canvas.drawString("12", 170, 300);
		canvas.drawString("13", 370, 300);
		canvas.drawString("14", 570, 300);
		canvas.drawString("15", 770, 300);
		canvas.drawString("16", 970, 300);
		canvas.drawString("17", 1170, 300);
		canvas.drawString("18", 1370, 300);
		canvas.drawString("19", 170, 400);
		canvas.drawString("20", 370, 400);
		canvas.drawString("21", 570, 400);
		canvas.drawString("22", 770, 400);
		canvas.drawString("23", 970, 400);
		canvas.drawString("24", 1170, 400);
		canvas.drawString("25", 1370, 400);
		canvas.drawString("26", 170, 500);
		canvas.drawString("27", 370, 500);
		canvas.drawString("28", 570, 500);
		
		if(daysInMonth==30){
			canvas.setColor(Color.red);
			canvas.setFont(new Font("arial", Font.BOLD, 25));
			canvas.drawString("29", 770, 500);
			canvas.drawString("30", 970, 500);
			board.repaint();
		}
		else if(daysInMonth==31){
			canvas.setColor(Color.red);
			canvas.setFont(new Font("arial", Font.BOLD, 25));
			canvas.drawString("29", 770, 500);
			canvas.drawString("30", 970, 500);
			canvas.drawString("31", 1170, 500);
			board.repaint();
		}

		
	}
	
	private static void calFri(Graphics canvas, DrawingBoard board, int daysInMonth) {
		
		canvas.setColor(Color.red);
		canvas.setFont(new Font("arial", Font.BOLD, 25));
		
		canvas.drawString("1", 1180, 100);
		canvas.drawString("2", 1380, 100);
		canvas.drawString("3", 180, 200);
		canvas.drawString("4", 380, 200);
		canvas.drawString("5", 580, 200);
		canvas.drawString("6", 780, 200);
		canvas.drawString("7", 980, 200);
		canvas.drawString("8", 1170, 200);
		canvas.drawString("9", 1370, 200);
		canvas.drawString("10", 170, 300);
		canvas.drawString("11", 370, 300);
		canvas.drawString("12", 570, 300);
		canvas.drawString("13", 770, 300);
		canvas.drawString("14", 970, 300);
		canvas.drawString("15", 1170, 300);
		canvas.drawString("16", 1370, 300);
		canvas.drawString("17", 170, 400);
		canvas.drawString("18", 370, 400);
		canvas.drawString("19", 570, 400);
		canvas.drawString("20", 770, 400);
		canvas.drawString("21", 970, 400);
		canvas.drawString("22", 1170, 400);
		canvas.drawString("23", 1370, 400);
		canvas.drawString("24", 170, 500);
		canvas.drawString("25", 370, 500);
		canvas.drawString("26", 570, 500);
		canvas.drawString("27", 770, 500);
		canvas.drawString("28", 970, 500);
		
		if(daysInMonth==30){
			canvas.setColor(Color.red);
			canvas.setFont(new Font("arial", Font.BOLD, 25));
			canvas.drawString("29", 1170, 500);
			canvas.drawString("30", 1370, 500);
			board.repaint();
		}
		else if(daysInMonth==31){
			canvas.setColor(Color.red);
			canvas.setFont(new Font("arial", Font.BOLD, 25));
			canvas.drawString("29", 1170, 500);
			canvas.drawString("30", 1370, 500);
			canvas.drawString("31", 170, 600);
			board.repaint();
		}

		
	}
	
	private static void calSat(Graphics canvas, DrawingBoard board, int daysInMonth) {
		
		canvas.setColor(Color.red);
		canvas.setFont(new Font("arial", Font.BOLD, 25));
		
		canvas.drawString("1", 1380, 100);
		canvas.drawString("2", 180, 200);
		canvas.drawString("3", 380, 200);
		canvas.drawString("4", 580, 200);
		canvas.drawString("5", 780, 200);
		canvas.drawString("6", 980, 200);
		canvas.drawString("7", 1170, 200);
		canvas.drawString("8", 1370, 200);
		canvas.drawString("9", 170, 300);
		canvas.drawString("10", 370, 300);
		canvas.drawString("11", 570, 300);
		canvas.drawString("12", 770, 300);
		canvas.drawString("13", 970, 300);
		canvas.drawString("14", 1170, 300);
		canvas.drawString("15", 1370, 300);
		canvas.drawString("16", 170, 400);
		canvas.drawString("17", 370, 400);
		canvas.drawString("18", 570, 400);
		canvas.drawString("19", 770, 400);
		canvas.drawString("20", 970, 400);
		canvas.drawString("21", 1170, 400);
		canvas.drawString("22", 1370, 400);
		canvas.drawString("23", 170, 500);
		canvas.drawString("24", 370, 500);
		canvas.drawString("25", 570, 500);
		canvas.drawString("26", 770, 500);
		canvas.drawString("27", 970, 500);
		canvas.drawString("28", 1170, 500);
		
		if(daysInMonth==30){
			canvas.setColor(Color.red);
			canvas.setFont(new Font("arial", Font.BOLD, 25));
			canvas.drawString("29", 1370, 500);
			canvas.drawString("30", 170, 600);
			board.repaint();
		}
		else if(daysInMonth==31){
			canvas.setColor(Color.red);
			canvas.setFont(new Font("arial", Font.BOLD, 25));
			canvas.drawString("29", 1370, 500);
			canvas.drawString("30", 170, 600);
			canvas.drawString("31", 370, 600);
			board.repaint();
		}

		
	}

}
