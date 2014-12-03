
//Niamh Moylan
//T00158725
//Start Date - 27/11/2014
//OOP2 Project 

//Resistance Class - Derived Class

import java.io.*;

public class Resistance extends Army implements Serializable {
	
	private String name;
	private char gender;
	private String nationality;
	private final int bonus = 5;
	
    public Resistance() {
    	
    	super ();
    	setName("Unknown");
    	setGender('x');
    	setNat("Unknown"); 
    }
    
    public Resistance(String name, char gender, String nationality, int moral, int arms, int support){
    	
    	super(moral, arms, support);
    	setName(name);
    	setGender(gender);
    	setNat(nationality);
    }
    
    public void setName(String n) {
		name = n;
	}
	
	public void setGender (char g) {
		gender = g;
	}
	
	public void setNat(String nat) {
		nationality = nat;
	}
	
	public void setResMor(int moral){
		setMoral(getMoral() + bonus);
		
	}public void setResSup(int support){
		setSupport(getSupport() + bonus);
	}
	
	
	public String getName(){
		return name;
	}
	
	public char getGender(){
		return gender;
	} 
	
	public String getNat(){
		return nationality;
	}
	
	public String toString() {
		return String.format("Name %s \nGender: %s \nNationality: %s",name, gender, nationality + super.toString()  + " \n \n" );
		
	}
    
}