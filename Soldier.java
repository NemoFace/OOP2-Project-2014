//Niamh Moylan
//T00158725
//Start Date - 19/11/2014
//OOP2 Project 

//Soldier Class - Base Class

//This class give the blueprint for every soilder created within this game


public class Soldier{
	
	private String name;
	private char gender;
	private String faction;
	private int regNo;


public Soldier (){
	 this ("Unnamed", 'x', "Unknown", 0);
	
}// end of no-arg

public Soldier (String name, char gender, String faction, int regNo ){

this.name = name;
this.gender = gender;
this.faction = faction;
this.regNo = regNo;

}	//end of multi-arg
	
	public void setName(String n) {
		name = n;
	}
	
	public void setGender (char g) {
		gender = g;
	}
	
	public void setFaction (String f) {
		faction = f;
	}
	
	public void setRegNo (int r) {
		regNo = r;
	}
	
	
	public String getName(){
		return name;
	}
	
	public char getGender(){
		return gender;
	} 
	
	public String getFaction(){
		return faction;
	}
	
	public int getRegNo(){
		return regNo;
	}
	
	public String toString() {
		return String.format("Name %s \nGender: %s \nFaction %s \nRegNo %d", name, gender, faction, regNo);
		
	}
	
	
	
}// end of class

