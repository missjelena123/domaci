package d_14_01_2022;

public class Autor {
	private String imeIPrezime;

	public String getImeIPrezime() {
		return imeIPrezime;
	}

	public void setImeIPrezime(String imeIPrezime) {
		this.imeIPrezime = imeIPrezime;
	}

	public Autor(String imeIPrezime) {
		this.imeIPrezime = imeIPrezime;
	}

	public void stampaj() {
		System.out.println("Autor je " + this.imeIPrezime);
	}

}
