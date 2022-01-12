package d_11_01_2021;

public class zadatak2 {

	public static void main(String[] args) {
		
	SmartAirConditioning j = new SmartAirConditioning() ;
	j.ime= "samsung";
	j.mod= true;
	j.temp= 25;
	SmartAirConditioning b= new SmartAirConditioning();
	b.ime= "LG";
	b.mod= false;
	b.temp=20;
	 
	j.stampaj();

	b.stampaj();
		
	}
	

}
