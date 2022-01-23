package d_21_01_2022;
import java.util.ArrayList;

public class zadatak1 {

	public static void main(String[] args) {
		

	




				ArrayList<Sektor> magacionerskiSektor = new ArrayList<Sektor>();
				ArrayList<Sektor> menadzerskiSektor = new ArrayList<Sektor>();

				Magacioner mag1 = new Magacioner("Jelena Bogdanovic", magacionerskiSektor);

				Menadzer men1 = new Menadzer("Bogdan Bogdanovic", menadzerskiSektor);

				Sektor magacin = new Sektor("Sektor Magacina ", 43500.00);
				Sektor distribucija = new Sektor("Distribucija ", 38000.00);
				Sektor prodaja = new Sektor("Prodaja ", 55000.00);

				Sektor logistike = new Sektor("Logistika ", 65000.00);
				Sektor finansija = new Sektor("Finansije ", 50000.00);
				Sektor nabavke = new Sektor("Nabavka ", 30000.00);

				mag1.zaposliUSektor(magacin);
				mag1.zaposliUSektor(prodaja);
				mag1.zaposliUSektor(distribucija);
				

				men1.zaposliUSektor(nabavke);
				men1.zaposliUSektor(logistike);
				men1.zaposliUSektor(finansija);
				
				System.out.println("Plata menadzera iznosi: " + men1.plata());
				System.out.println();
				System.out.println("Plata magacionera iznosi: " + mag1.plata());
				

			
			}

	

	}


