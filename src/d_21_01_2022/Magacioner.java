package d_21_01_2022;

import java.util.ArrayList;

public class Magacioner extends Radnik {
	

		public Magacioner(String imeIPrezime, ArrayList<Sektor> sektoriUKojimaRadi) {
			super(imeIPrezime, sektoriUKojimaRadi);

		}

		private double prosecnaPlata() {
			
			double suma = 0;

			for (int i = 0; i < sektoriUKojimaRadi.size(); i++) {
				suma = suma + sektoriUKojimaRadi.get(i).getPlataSektora();

			}

			double prosecnaPlata = suma / sektoriUKojimaRadi.size() * 0.5;
			return prosecnaPlata;
		}

		@Override
		public double plata() {
			double plata = this.prosecnaPlata() * sektoriUKojimaRadi.size();
			return plata;
		}

		
		}


