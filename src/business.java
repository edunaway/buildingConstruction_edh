//Business class which extends Building
public class business extends Building{
	
	//set variables 
	protected int numRentableUnits;
	
	//empty constructor 
	public business() {
		super();
		numRentableUnits =0;
	}
	
	//Preferred constructor 
	public business(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup) {
		super();
		this.projectName= projectName;
		this.completeAddress= completeAddress;
		this.totalSquareFeet= totalSquareFeet;
		this.occupancyGroup= occupancyGroup;
		this.subgroup= subgroup;
	}
	
	
	
	
//getters and setters
	protected int getNumRentableUnits() {
		return numRentableUnits;
	}

	protected void setNumRentableUnits(int numRentableUnits) {
		this.numRentableUnits = numRentableUnits;
	}
//end getters and setters 
	
	
	
	
	
	
	
}


