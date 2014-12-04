

//Niamh Moylan
//T00158725
//Start Date - 27/11/2014
//OOP2 Project 

//Army Class - Base Class

//This class give the blueprint for every Army created within this game


import java.io.*;
public class Army implements Serializable {
	
	private int morale;
	private int arms;
	private int support;
	
	
	public Army (){
		this (0,0,0);
	}
	
	
	public Army (int morale, int arms, int support){
		this.morale = morale;
		this.arms = arms;
		this.support = support;	
	}

	public void setMorale(int morale) {
		this.morale = morale;
	}
	public void setArms(int arms){	
		this.arms = arms;
	}
	public void setSupport(int support) {
		this.support = support;
	}
	
	public int getMorale(){
		return morale;
	}
	
	public int getArms() {
		return arms;
	}
	public int getSupport(){
		return support;
	}
	
	public String toString(){
		return String.format("\nCurrent level of: \nMorale: %d \nArms: %d \nSupport: %d", morale, arms, support);
	}
		
	}
