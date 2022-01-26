package d_24_01_2022;

public class Korpa {
	public class Korpa {
		
		private ArrayList<Ambalaza> nizAmbalaza = new ArrayList<Ambalaza>();
		
		
		public ArrayList<Ambalaza> getNizAmbalaza() {
			return nizAmbalaza;
		}
		public void setNizAmbalaza(ArrayList<Ambalaza> nizAmbalaza) {
			this.nizAmbalaza = nizAmbalaza;
		}


		public void dodajAmbalazu(Ambalaza ambalaza) {
			this.nizAmbalaza.add(ambalaza);

		}
		public void izbaciAmbalazu(String barkod) {
			for(int i = 0; i < this.nizAmbalaza.size(); i++) {
				if(this.nizAmbalaza.get(i).getBarkod().equals(barkod)) {
					this.nizAmbalaza.remove(i);
				}
			}
		}
		private double cenaSaPopustom(int popust) {
			double sumaCena = 0; 
			for(int i = 0; i < this.nizAmbalaza.size(); i++) {
				sumaCena = sumaCena + (this.nizAmbalaza.get(i).cenaArtikla() - popust);
			}
			return sumaCena;
		}
		public double ukupnaCenaKorpe(SuperKartica superKartica) {
			return this.cenaSaPopustom(superKartica.getPopust());
			
		}
	}

}
