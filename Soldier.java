//Niamh Moylan
//T00158725
//Start Date - 19/11/2014
//OOP2 Project 

//Soldier Class - Base Class

//This class give the blueprint for every soilder created within this game


public class Soldier{
	
	private String name;
	private char gender;
	private String nationality;


public Soldier (){
	 this ("Unnamed", 'x', "Unknown");
	
}// end of no-arg

public Soldier (String name, char gender, String nationality ){

this.name = name;
this.gender = gender;
this.nationality = nationality;

}	//end of multi-arg
	
	public void setName(String n) {
		name = n;
	}
	
	public void setGender (char g) {
		gender = g;
	}
	
	public void setNationality (String nat) {
		nationality = nat;
	}
	
	
	public String getName(){
		return name;
	}
	
	public char getGender(){
		return gender;
	} 
	
	public String getNationality(){
		return nationality;
	}
	
	public String toString() {
		return String.format("Name %s \nGender: %s \nNationality %s", name, gender, nationality);
		
	}
	
	
	
}// end of class

