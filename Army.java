//Niamh Moylan
//T00158725
//Start Date - 27/11/2014
//OOP2 Project 

//Army Class - Base Class

//This class give the blueprint for every Army created within this game



public class Army {
	
	private int moral;
	private int arms;
	private int support;
	
	public Army (){
		this (0,0,0);
	}
	
	
	public Army (int moral, int arms, int support){
		this.moral = moral;
		this.arms = arms;
		this.support = support;	
	}

	public void setMoral(int moral) {
		moral = moral;
	}
	public void setArms(int arms){	
		arms = arms;
	}
	public void setSupport(int support) {
		support = support;
	}
	
	public int getMoral(){
		return moral;
	}
	
	public int getArms() {
		return arms;
	}
	public int getSupport(){
		return support;
	}
	
	public String toString(){
		return String.format("\nCurrent level of: \nMoral: %d \nArms: %d \nSupport: %d", moral, arms, support);
	}
		
	}
