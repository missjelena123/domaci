package d_21_01_2022;

import java.util.ArrayList;

public class Menadzer extends Radnik{

		public Menadzer(String imeIPrezime, ArrayList<Sektor> sektoriUKojimaRadi) {
			super(imeIPrezime, sektoriUKojimaRadi);

		}

		@Override
		public double plata() {
			double plata = 0;

			for (int i = 0; i < sektoriUKojimaRadi.size(); i++) {
				plata = plata + sektoriUKojimaRadi.get(i).getPlataSektora();

			}

			return plata;
		}
	}


