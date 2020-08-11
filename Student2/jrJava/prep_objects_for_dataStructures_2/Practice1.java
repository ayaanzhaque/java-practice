package jrJava.prep_objects_for_dataStructures_2;

public class Practice1 {

	public static void main(String[] args) {
		
		Thing[] things = new Thing[3];
		things[0] = new Thing(10);
		things[1] = new Thing(20);
		things[2] = new Thing(30);
		
		removeThing(things, 20); 
	}

	
	public static void removeThing(Thing[] things, int aValue){
		// This method will remove the ref of Thing which has its a is the aValue..
		Thing toRemove = new Thing(aValue);
		
		//for(int i=0; i<things.length; i++){
			// Shouldn't do this. It will test whether they are physically same object.
		//	if(things[i]==toRemove) things[i] = null;
		//}
		
		for(int i=0; i<things.length; i++){
			// Should use this. It will test whether they are logically equal.
			if(things[i].equals(toRemove)) things[i] = null;
		}
	}
	
}
