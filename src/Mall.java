// Mall extends Building
public class Mall extends Building{

	//set variables 
	private int numRentedUnits;
	private double medianUnitSize;
	private int numParkingSpaces;
	
	//set toString 
	@Override
	public String toString() {
		return "Mall [numRentedUnits=" + numRentedUnits + ", medianUnitSize=" + medianUnitSize + ", numParkingSpaces="
				+ numParkingSpaces + "]";
	}
//empty constructor 
	public Mall() {
		super();
		numRentedUnits =0;
		medianUnitSize =0;
		numParkingSpaces =0;
	}
	
	//prefered constructor
	public Mall(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup){
		super();
		this.projectName= projectName;
		this.completeAddress= completeAddress;
		this.totalSquareFeet= totalSquareFeet;
		this.occupancyGroup= occupancyGroup;
		this.subgroup= subgroup;
	}
	public void draw() {
		System.out.println("draw code for mall");
	}
	public String displayData() {
		return toString;
	}
	
	//getters and setters 
	protected int getNumRentedUnits() {
		return numRentedUnits;
	}
	protected void setNumRentedUnits(int numRentedUnits) {
		this.numRentedUnits = numRentedUnits;
	}
	protected double getMedianUnitSize() {
		return medianUnitSize;
	}
	protected void setMedianUnitSize(double medianUnitSize) {
		this.medianUnitSize = medianUnitSize;
	}
	protected int getNumParkingSpaces() {
		return numParkingSpaces;
	}
	protected void setNumParkingSpaces(int numParkingSpaces) {
		this.numParkingSpaces = numParkingSpaces;
	}
	//end getters and setters 
	
}//end public class 
