/**
 *@author Niamh Moylan
 *T00158725
 *@since 27/11/2014
 *OOP2 Project 
 *Offical Army Class - Derived Class
 *
*/
import java.io.*;

public class Offical extends Army implements Serializable {

private String unit;
private int regNo;
private final int bonus = 7;
	
/**
	 * No-Argument Constructor that provides empty values for soldier 
	 */	
	public Offical() {
		super ();
		setUnit("Unknown");
		setRegNo(0);
		
	}
	/**
	 * Multi Argument Constructor 
	 *@param morale, arms, support Gives stats to soldier
	 *@param unit Gives name for unit of soldier
     *@param regNo Gives regNo for soldier
     */
	public Offical (String unit, int regNo, int morale, int arms, int support){
    	super(morale, arms, support);
		setUnit(unit);
		setRegNo(regNo);
	}
	
		/**
		 *returns value for unit
		 *
		 *@return unit 
		 */
	
	public String getUnit(){
		return unit;
	}
	
		
		/**
		 *returns value for regNO
		 *
		 *@return regNo 
		 */
	
	public int getRegNo(){
		return regNo;
	}
	/**
	 *Gives a bonus of 5 to the 'Arms' Stat
	 *@param arms
	 *@return int A combomantion of the randomly generated atat and it's bonus
	 *
	 */
	public void setOfArms(int arms){
		setArms(getArms() + bonus);
	}
	
		
		/**
		 *sets value for unit
		 *
		 *@param unit
		 */
	
	
	
	public void setUnit(String u){
		unit = u;
	}
	
		
		/**
		 *sets value for regNO
		 *
		 *@param regNo 
		 */
	
	public void setRegNo (int r){
		regNo = r;
	}
	
	
	/**
	 *returns String 
	 */
	public String toString(){
		return String.format("Unit: %s \nReg. Number: %d, %s", unit, regNo , super.toString());
		
	}
}