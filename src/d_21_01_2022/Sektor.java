package d_21_01_2022;

public class Sektor {
	
	protected String nazivSektora;
	protected double plataSektora;

	public Sektor(String nazivSektora, double plata) {
		super();
		this.nazivSektora = nazivSektora;
		this.plataSektora = plata;
	}

	public String getNazivSektora() {
		return nazivSektora;
	}

	public void setNazivSektora(String nazivSektora) {
		this.nazivSektora = nazivSektora;
	}

	public double getPlataSektora() {
		return plataSektora;
	}

	public void setPlataSektora(double plataSektora) {
		this.plataSektora = plataSektora;
	}

}


