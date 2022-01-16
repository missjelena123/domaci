package d_13_01_2022;

public class Facebook {
	private String imeIPrezime;
	private String korisnik;
	private String tekstObjave;
	private int brojLajkova;
	private int brojDeljenja;
	
	public FacebookPost (String imeIPrezime, String korisnik ,String tekstObjave) {
		this.imeIPrezime=imeIPrezime;
		this.korisnik=korisnik;
		this.tekstObjave=tekstObjave;
	}

	public String getImeIPrezime() {
		return imeIPrezime;
	}

	public void setImeIPrezime(String imeIPrezime) {
		this.imeIPrezime = imeIPrezime;
	}

	public String getKorisnik() {
		return korisnik;
	}

	public void setKorisnik(String korisnik) {
		this.korisnik = korisnik;
	}

	public String getTekstObjave() {
		return tekstObjave;
	}

	public void setTekstObjave(String tekstObjave) {
		this.tekstObjave = tekstObjave;
	}

	public int getBrojLajkova() {
		return brojLajkova;
	}

	public int getBrojDeljenja() {
		return brojDeljenja;
	}

	public void stampaj(){
		
		System.out.println(this.imeIPrezime + " >>> " + this.korisnik);
		System.out.println(this.tekstObjave);
		System.out.println(this.brojLajkova + "|" + this.brojDeljenja);
		
	}

	public void like() {
		this.brojLajkova = this.brojLajkova + 1;

	}

	public void dislike() {
		if (brojLajkova>0) {
			this.brojLajkova=this.brojLajkova-1;
		}
		
		}
	 public void share() {
		this.brojDeljenja=this.brojDeljenja+1;

}
}
