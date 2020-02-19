
public class Residential extends Building {

	protected int numBedrooms;
	protected int numBathrooms;
	protected boolean laundry;
	
	public Residential() {
		super();
		numBedrooms =0;
		numBathrooms =0;
		laundry =false;
	}
	
	public Residential(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup) {
		super();
		this.projectName= projectName;
		this.completeAddress = completeAddress;
		this.totalSquareFeet= totalSquareFeet;
		this.occupancyGroup= occupancyGroup; 
		this.subgroup= subgroup; 
				
	}
//getters and setter
	protected int getNumBedrooms() {
		return numBedrooms;
	}

	protected void setNumBedrooms(int numBedrooms) {
		this.numBedrooms = numBedrooms;
	}

	protected int getNumBathrooms() {
		return numBathrooms;
	}

	protected void setNumBathrooms(int numBathrooms) {
		this.numBathrooms = numBathrooms;
	}

	protected boolean isLaundry() {
		return laundry;
	}

	protected void setLaundry(boolean laundry) {
		this.laundry = laundry;
	}
//end getters and setters 
	
	
	
	
}//close residential class 
