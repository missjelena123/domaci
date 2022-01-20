package d_17_01_2022;

public class Racun {
	
	private String brRacuna;
	private String imeIPrezime;
	private double stanje;
	
	
	public Racun(String brRacuna,String imeIPrezime, double stanje) {
		this.brRacuna=brRacuna;
		this.imeIPrezime=imeIPrezime;
		this.stanje=stanje;
	}
	public Racun () {
		
	}
	public String getBrRacuna() {
		return brRacuna;
	}
	public void setBrRacuna(String brRacuna) {
		this.brRacuna = brRacuna;
	}
	public String getImeIPrezeme() {
		return imeIPrezime;
	}
	public void setImeIPrezeme(String imeIPrezime) {
		this.imeIPrezime = imeIPrezime;
	}
	public double getStanje() {
		return stanje;
	}
	public void smanjiStanje(double stanje) {
		this.stanje=this.stanje-stanje;
		if (this.stanje -stanje>0 ) {
			this.stanje=this.stanje-stanje;
			
			
		} else {
              	System.out.println("nemate dovoljno sredstava");
		}
		
		
	}
	public void print() {
		System.out.println("ime i prezime " + this.imeIPrezime + "-" + "broj racuna" + this.brRacuna);
	  System.out.println("stanje na racunu je " + this.stanje);
	   
	}
	 public void povecajStanje(double stanje) {
		 this.stanje= this.stanje + stanje;
	 }

}

