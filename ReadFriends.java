import java.io.*;
import java.util.*;
public class ReadFriends{
	public static void main(String args[]){
	LinkedList<Resistance> myPeople = new LinkedList<Resistance>();
	
	
	try{
	
	File people = new File("rebels.dat");
	
	FileInputStream fis = new FileInputStream(people);
	ObjectInputStream ois = new ObjectInputStream(fis);
	myPeople =(LinkedList<Resistance>) ois.readObject();
		
	}//end try
	catch(Exception e){
	System.out.println(e.getMessage());
		
	}//end catch
	for(Resistance p : myPeople){
		System.out.println(p.toString());
	}	
	}
	
}