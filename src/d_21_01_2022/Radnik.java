package d_21_01_2022;

import java.util.ArrayList;

public abstract class  Radnik {
	
		
		private String ImeIPrezime;
		ArrayList<Sektor> sektoriUKojimaRadi = new ArrayList<Sektor>();
		
		public Radnik(String imeIPrezime, ArrayList<Sektor> sektoriUKojimaRadi) {
			super();
			this.ImeIPrezime= imeIPrezime;
			this.sektoriUKojimaRadi = sektoriUKojimaRadi;
		}

		public abstract double plata(); 

		public void zaposliUSektor(Sektor sektor) {
			sektoriUKojimaRadi.add(sektor);
		}
		
     
	}
     


