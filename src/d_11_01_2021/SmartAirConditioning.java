package d_11_01_2021;

public class SmartAirConditioning {

	String ime;
	int elHladi;
	int elGreje;
	int temp;
	boolean mod;

	public void stampaj() {
    	System.out.println(this.ime +"," +this.metodaMod() +"," + this.temp);
    System.out.println("mesecna potrosnja je " +this.mesecnaPotrosnja());
   System.out.println("mesecni trosak "+ this.mesecniTrosakNovca());
	}
	

	public String metodaMod() {
		if (this.mod = true) {
			return "hladi";
		} else {
			return "greje ";
		}
	
	}

	public int  mesecnaPotrosnja() {
		if (this.mod) {
			return 30 * 15;

		} else {
			return 30 * 15 * 2;

		}
	} public int mesecniTrosakNovca() {
		int cena=0;
		cena=350*6 +((this.mesecnaPotrosnja()-350) *9);

		return cena;
				
			
		}
	}
