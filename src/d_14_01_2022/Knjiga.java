package d_14_01_2022;

public class Knjiga {
	private String ISBN;
	private String naziv;
	private int godinaIzdanja;
	private Autor autor;
	
	public Knjiga (){
		
	}
	
	public Knjiga (String ISBN, String naziv, int godinaIzdanja, Autor autor) {
   	 this.ISBN=ISBN;
   	 this.naziv=naziv;
   	 this.godinaIzdanja=godinaIzdanja;
   	 this.autor=autor;
    }
	
	
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public int getGodinaIzdanja() {
		return godinaIzdanja;
	}
	public void setGodinaIzdanja(int godinaIzdanja) {
		this.godinaIzdanja = godinaIzdanja;
	}
	
	
	public void stampaj() {
		System.out.println("ISBN je " + this.ISBN);
		System.out.println("Naziv : " + this.naziv +" - Godina izdanja " + this.godinaIzdanja);
		this.autor.stampaj();
		
	}
}



