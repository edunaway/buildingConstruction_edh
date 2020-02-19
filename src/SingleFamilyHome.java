//Single Family home extends building 
public class SingleFamilyHome extends Building {

	//variable 
	private boolean garage; 
	
	
	//toString 
	@Override
	public String toString() {
		return "SingleFamilyHome [garage=" + garage + "]";
	}
//empty constructor 
	public SingleFamilyHome() {
		super();
		
	}
	
	//prefered constructor 
	public SingleFamilyHome(String projectName, String completeAddress, double totalSquareFeet, String subgroup) {
		super();
		this.projectName= projectName;
		this.completeAddress =completeAddress;
		this.totalSquareFeet =totalSquareFeet;
		this.occupancyGroup= occupancyGroup;
		this.subgroup= subgroup;
		
	}
	
	public void draw() {
		System.out.println("Draw out code for Single Family Home");
	}
	
	public String displayData() {
		return toString(); 
	}
	
	//getters and setters 
	private boolean isGarage() {
		return garage;
	}
	private void setGarage(boolean garage) {
		this.garage = garage;
	}
	//end getters and setters 
	
	
	
	
}//end class 
