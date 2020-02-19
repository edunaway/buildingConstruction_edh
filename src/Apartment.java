//Apartment class extends the building class 
public class Apartment extends Building {

	//variables 
	private int numRentableUnits;
	private double avgUnitSize;
	private boolean parkingAvailable;
	
	//toString 
	@Override
	public String toString() {
		return "Apartment [numRentableUnits=" + numRentableUnits + ", avgUnitSize=" + avgUnitSize
				+ ", parkingAvailable=" + parkingAvailable + "]";
	}
	//empty constructor 
	public Apartment() {
		super();
		numRentableUnits=0;
		avgUnitSize=0;
		parkingAvailable=false;
	}
	
	//prefered constructor 
	public Apartment(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup) {
		super();
		this.projectName=projectName;
		this.completeAddress=completeAddress;
		this.totalSquareFeet= totalSquareFeet;
		this.occupancyGroup= occupancyGroup;
		this.subgroup= subgroup;
	
	}
	
	public void draw() {
		System.out.println("draw code for apartment");
	}
	
	public String displayData() {
		return toString();
	}
//getters and setters
	private int getNumRentableUnits() {
		return numRentableUnits;
	}

	private void setNumRentableUnits(int numRentableUnits) {
		this.numRentableUnits = numRentableUnits;
	}

	private double getAvgUnitSize() {
		return avgUnitSize;
	}

	private void setAvgUnitSize(double avgUnitSize) {
		this.avgUnitSize = avgUnitSize;
	}

	private boolean isParkingAvailable() {
		return parkingAvailable;
	}

	private void setParkingAvailable(boolean parkingAvailable) {
		this.parkingAvailable = parkingAvailable;
	}
//end getters and setters 
	
	
}
