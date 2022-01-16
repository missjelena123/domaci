package d_14_01_2022;

public class zadatak1 {

	public static void main(String[] args) {
		
		Autor haledHoseini = new Autor ("Lovac na zmajeve");
		Knjiga lovacNaZmajeve = new Knjiga("1256-4567-5897", " Lovac na Zmajeve", 2012, haledHoseini);
		lovacNaZmajeve.stampaj();
		
		Autor stevanSremac = new Autor ("Ivkova slava");
		Knjiga ivkovaSlava = new Knjiga("2154-5487-8754", "Ivkova Slava", 1895, stevanSremac);
		ivkovaSlava.stampaj();
		
	}
	

}
