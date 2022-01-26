package d_24_01_2022;

public class Tetrapak {
	public class Tetrapak extends Ambalaza {

		private boolean reciklaza;
		private double osnovnaCena;
		
		public Tetrapak(boolean reciklaza, double osnovnaCena,String barkod, String naziv, double netoTezina, double brutoTezina) {
			super(barkod, naziv, netoTezina, brutoTezina);
			this.reciklaza = reciklaza;
			this.osnovnaCena = osnovnaCena;
		}

		public boolean isReciklaza() {
			return reciklaza;
		}

		public void setReciklaza(boolean reciklaza) {
			this.reciklaza = reciklaza;
		}

		public double getOsnovnaCena() {
			return osnovnaCena;
		}

		public void setOsnovnaCena(double osnovnaCena) {
			this.osnovnaCena = osnovnaCena;
		}

		@Override
		public double cenaArtikla() {
			if(this.reciklaza == true) {
				return (this.tezinaPakovanja() * 1.5) + this.osnovnaCena;
			}else {
			return this.osnovnaCena;
			}
		}

		@Override
		public void stampaj() {
			System.out.println("Da li se reciklira " +this.reciklaza);
			System.out.println("Cena je " +this.osnovnaCena);
			
		}