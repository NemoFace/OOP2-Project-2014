//Niamh Moylan
//T00158725
//Start Date - 20/11/2014
//OOP2 Project 

//Japanese Soldier Class - Derived Class

public class Japanese extends Soldier{
	
	private String unit;
	private int regNo;
	
	
	public Japanese() {
		super ();
		setUnit("Unknown");
		setRegNo(0);
		
	}
	
	public Japanese (String unit, int regNo, String name, char gender, String nationality){
		super (name, gender, nationality);
		setUnit(unit);
		setRegNo(regNo);
	}
	
	public String getUnit(){
		return unit;
	}
	
	public int getRegNo(){
		return regNo;
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
