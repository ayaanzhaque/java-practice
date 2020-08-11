package jrJava.sorting_objects;

import java.util.StringTokenizer;

public class Balls implements Comparable{

	int x,y,radius;
	
	public Balls(String line){
		
		StringTokenizer st = new StringTokenizer(line, ", ");
		x = Integer.parseInt(st.nextToken());
		y = Integer.parseInt(st.nextToken());
		radius = Integer.parseInt(st.nextToken());

		
	}
	
	public String toString(){
		return x + "," + y  + "," + radius + "," + Math.sqrt(x*x+y*y);
	}
	public int compareTo(Object o) {
		Balls b = (Balls) o;
		
		if(radius > b.radius) return 1;
		else if(radius < b.radius) return -1;
		else{
			if(Math.sqrt(x*x+y*y) > Math.sqrt(b.x*b.x+b.y*b.y)) return 1;
			else if(Math.sqrt(x*x+y*y) < Math.sqrt(b.x^2+b.y*b.y)) return -1;
			else return 0;
		}
	}

}
