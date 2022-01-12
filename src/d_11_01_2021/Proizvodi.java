package d_11_01_2021;

public class Proizvodi {


	String naziv;
	double cena;
	double tezina;
	
	
	
	public void stampaj () {	 
		System.out.println("naziv: " + this.naziv);
		System.out.println("cena: " + this.cena);
		System.out.println("tezina: " + this.tezina);
		System.out.println("Cena postarine je " + this.racunajPostarinu() );
}
	public void povecajCenu (int poskupljenje) {
		this.cena = this.cena + poskupljenje;
	}
	public double vratiCenuSaPopustom (int popust) {
		double dva=this.cena/100 *popust;
		this.cena= this.cena -dva;
		return this.cena;
		
	}
	 public double racunajPostarinu() {
		 if (this.tezina< 100) {
			 return 200;
			
		}else if (this.tezina>100 && this.tezina<500) {
			return 400;
			
		}else {
			return 1000;
		}
			
	 }
}
