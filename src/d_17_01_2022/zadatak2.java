package d_17_01_2022;

public class zadatak2 {

	public static void main(String[] args) {
	 Racun primalac =new Racun(3126-253-143, "Jelena Bogdanovic, 2000");
	 Racun posiljalac= new Racun (423-325-2413, "Pera Peric", 20000);
	 
	 Transakcija transakcija=new Transakcija("1424",posiljalac, primalac);
	  
	 transakcija.izvrsiTransakciju(2000);
	 transakcija.Print();
	 
	}

}
