package d_11_01_2021;

public class zadatak1 {

	public static void main(String[] args) {
		

		Proizvodi jedan= new Proizvodi() ;
		jedan.naziv= "sampon";
		jedan.cena= 550;
		jedan.tezina=200;
		
		
		jedan.stampaj();

		
		Proizvodi dva=new Proizvodi();
		dva.naziv= "parfem";
		dva.cena=8500;
		dva.tezina=800;
		
		dva.stampaj();
		 int poskupljenje= 10;
		 
		 jedan.povecajCenu(poskupljenje);
		 int popust =50;
		 
		 dva.vratiCenuSaPopustom(popust);
		 dva.stampaj();
		 

	}        
}
