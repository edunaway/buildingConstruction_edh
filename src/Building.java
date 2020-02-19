
public class Building {
//set variables 
	protected String projectName;
	protected String completeAddress;
	protected double totalSquareFeet;
	protected String occupancyGroup;
	protected String subgroup;
	//set toString 
	@Override
	public String toString() {
		return "Building [projectName=" + projectName + ", completeAddress=" + completeAddress + ", totalSquareFeet="
				+ totalSquareFeet + ", occupancyGroup=" + occupancyGroup + ", subgroup=" + subgroup + "]";
	}
	//empty constructor
	public Building() {
		projectName = " ";
		completeAddress =" ";
		totalSquareFeet = 0.0;
		occupancyGroup = " ";
		subgroup =" ";
	}
	//prefered constructor 
	public Building (String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup) {
		this.projectName= projectName;
		this.completeAddress= completeAddress;
		this.totalSquareFeet= totalSquareFeet;
		this.occupancyGroup=occupancyGroup;
		this.subgroup=subgroup; 
		
	}
	//draw constructor 
	public void draw() {
		 System.out.println("drawing code for building");
	}
	//display's toString 
	public String displayData() {
		return toString(); 
	}
	
	
	

	//getters and setters
	protected String getProjectName() {
		return projectName;
	}
	protected void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	protected String getCompleteAddress() {
		return completeAddress;
	}
	protected void setCompleteAddress(String completeAddress) {
		this.completeAddress = completeAddress;
	}
	protected double getTotalSquareFeet() {
		return totalSquareFeet;
	}
	protected void setTotalSquareFeet(double totalSquareFeet) {
		this.totalSquareFeet = totalSquareFeet;
	}
	protected String getOccupancyGroup() {
		return occupancyGroup;
	}
	protected void setOccupancyGroup(String occupancyGroup) {
		this.occupancyGroup = occupancyGroup;
	}
	protected String getSubgroup() {
		return subgroup;
	}
	protected void setSubgroup(String subgroup) {
		this.subgroup = subgroup;
	}
	//getters and setters 
	
	
	
	
	
	
	
	
	
}
