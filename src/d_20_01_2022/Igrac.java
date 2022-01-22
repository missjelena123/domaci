package d_20_01_2022;

public class Igrac extends Osoba {
	private int broj;
	private String pozicija;
	private boolean kapiten;

	public Igrac() {
		super();

	}

	public Igrac(String imeIPrezime, String jmbg, int godRodjenja, int broj, String pozicija, boolean kapiten) {
		super(imeIPrezime, jmbg, godRodjenja);
		this.broj = broj;
		this.pozicija = pozicija;
		this.kapiten = kapiten;
	}

	public int getBroj() {
		return broj;
	}

	public void setBroj(int broj) {
		this.broj = broj;
	}

	public String getPozicija() {
		return pozicija;
	}

	public void setPozicija(String pozicija) {
		this.pozicija = pozicija;
	}

	public boolean isKapiten() {
		return kapiten;
	}

	public void setKapiten(boolean kapiten) {
		this.kapiten = kapiten;
		
	} public void Print() {
		super.Print();
		System.out.println("broj igraca "+ this.broj + " pozicija "+this.pozicija );
		
		
		if (isKapiten()) {
			System.out.println("igrac je kapiten ");
		}else
			System.out.println("igrac nije kapiten ");
		
		
	

}
}
