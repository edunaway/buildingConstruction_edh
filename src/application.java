
public class application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//building class test
		Building Building1= new Building();
		System.out.println("--------------------");
		Building1.draw();
		System.out.println(Building1.displayData());
		
		Building Building2= new Building("Phi Tau","1478 s Second st",2450,"Assembly","A-1");
		System.out.println();
		System.out.println("---------------------");
		Building2.draw();
		System.out.println(Building2.displayData());
		//end building class 
		
		//Business class test 
		business Business1= new business();
		System.out.println("----------------------");
		Business1.draw();
		System.out.println(Business1.displayData());
		
		business Business2= new business("Bellarmine","2001 Newburg Road",40205,"Business","B");
		System.out.println("---------------------");
		Business2.draw();
		System.out.println(Business2.displayData());
		//end business class 
		
		//residential class test 
		Residential residential1= new Residential();
		System.out.println("---------------------");
		residential1.draw();
		System.out.println(residential1.displayData());
		
		Residential residential2= new Residential("john","2200 sheffield blvd",40205, "residential","R-1");
		System.out.println("---------------------");
		residential2.draw();
		System.out.println(residential2.displayData());
		//end residential class test 
		
		//Mall class test 
		Mall Mall1= new Mall();
		System.out.println("---------------------");
		Mall1.draw();
		System.out.println(Mall1.displayData());
		
		Mall Mall2= new Mall("St.Matthew","5000 Shelbyville rd", 40207,"Storage","S-1");
		System.out.println();
		System.out.println("---------------------");
		Mall1.draw();
		System.out.println(Mall2.displayData());
		//Mall test end 
		
		//Apartment class test 
		Apartment Apartment1= new Apartment();
		System.out.println("---------------------");
		Apartment1.draw();
		System.out.println(Apartment1.displayData());
		
		Apartment Apartment2= new Apartment("Poplar Level Terrance","1106 Poplar level Plaza", 40217,"Institutional","I-1");
		System.out.println();
		System.out.println("---------------------");
		Apartment2.draw();
		System.out.println(Apartment2.displayData());
		//Apartment class end 
		
		//single family home class test 
		SingleFamilyHome House1= new SingleFamilyHome();
		System.out.println("---------------------");
		House1.draw();
		System.out.println(House1.displayData());
		
		SingleFamilyHome House2= new SingleFamilyHome("Dunaway","1301 oxley ct Union KY", 41091,"Residential");
		System.out.println();
		System.out.println("---------------------");
		House2.draw();
		System.out.println(House2.displayData());
		//single family home end 
	
		
		
	}//end main 

}//end class 
