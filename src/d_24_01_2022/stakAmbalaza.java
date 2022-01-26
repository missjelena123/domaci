package d_24_01_2022;

public class stakAmbalaza {



public class StaklenaAmbalaza extends Ambalaza {

	private double kaucija;
	private boolean daLisePlacaKaucija;
	private double osnovnaCena;
	
 public StaklenaAmbalaza(double kaucija, boolean daLisePlacaKaucija, double osnovnaCena,
			String barkod, String naziv, double netoTezina, double brutoTezina) {
		super(barkod, naziv, netoTezina, brutoTezina);
		this.kaucija = kaucija;
		this.daLisePlacaKaucija = daLisePlacaKaucija;
		this.osnovnaCena = osnovnaCena;
	}

	public double getKaucija() {
		return kaucija;
	}

	public void setKaucija(double kaucija) {
		this.kaucija = kaucija;
	}

	public boolean isDaLisePlacaKaucija() {
		return daLisePlacaKaucija;
	}

	public void setDaLisePlacaKaucija(boolean daLisePlacaKaucija) {
		this.daLisePlacaKaucija = daLisePlacaKaucija;
	}

	public double getOsnovnaCena() {
		return osnovnaCena;
	}

	public void setOsnovnaCena(double osnovnaCena) {
		this.osnovnaCena = osnovnaCena;
	}

	@Override
	public double cenaArtikla() {
		if(this.daLisePlacaKaucija == true) {
			return (this.osnovnaCena * 1.2) + this.kaucija;
		}else {
		return this.osnovnaCena * 1.2;
	}
}
	@Override
	public void stampaj() {
		System.out.println("Kaucija je " + this.kaucija);
		System.out.println("Da li se plaća kaucija " +this.daLisePlacaKaucija );
		System.out.println("Cena je" +this.osnovnaCena);
	}



}

}
