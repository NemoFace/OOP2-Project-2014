
//Niamh Moylan
//T00158725
//Start Date - 27/11/2014
//OOP2 Project 

//Ofical Army Class - Derived Class

import java.io.*;

public class Offical extends Army implements Serializable {

private String unit;
private int regNo;
private final int bonus = 7;
	
	
	public Offical() {
		super ();
		setUnit("Unknown");
		setRegNo(0);
		
	}
	
	public Offical (String unit, int regNo, int moral, int arms, int support){
    	super(moral, arms, support);
		setUnit(unit);
		setRegNo(regNo);
	}
	
	public String getUnit(){
		return unit;
	}
	
	public int getRegNo(){
		return regNo;
	}
	
	public void setOfArms(int arms){
		setArms(getArms() + bonus);
	}
	
	public void setUnit(String u){
		unit = u;
	}
	public void setRegNo (int r){
		regNo = r;
	}
	
	public String toString(){
		return String.format("Unit: %s \nReg. Number: %d", unit, regNo + super.toString());
		
	}
}