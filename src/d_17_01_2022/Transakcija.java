package d_17_01_2022;

public class Transakcija {
	private String idTransakcija;
	private Racun posiljalac;
	private Racun primalac;
	
	public Transakcija() {
		
		
	}

	public Transakcija(String idTransakcija, Racun posiljalac, Racun primalac) {
		this.idTransakcija = idTransakcija;
		this.posiljalac = posiljalac;
		this.primalac = primalac;
	}

	public String getIdTransakcija() {
		return idTransakcija;
	}

	public void setIdTransakcija(String idTransakcija) {
		this.idTransakcija = idTransakcija;
	}

	public Racun getPosiljalac() {
		return posiljalac;
	}

	public void setPosiljalac(Racun posiljalac) {
		this.posiljalac = posiljalac;
	}

	public Racun getPrimalac() {
		return primalac;
	}

	public void setPrimalac(Racun primalac) {
		this.primalac = primalac;
	}
	 private double provizija (double visinaTransakcije) {
          if (visinaTransakcije<4500) {
			 return 45;
		}
	 else {
		 return visinaTransakcije/100;
	 }
	 } public void izvrsiTransakciju(double prenesenaSredstva) {
	 this.posiljalac.smanjiStanje(prenesenaSredstva + provizija(prenesenaSredstva));
      this.primalac.povecajStanje(prenesenaSredstva);
      
	 } 
	 public void Print()  {
		 System.out.println("id transakcija" + this.idTransakcija);
		 System.out.println("racun sa" + this.posiljalac.getImeIPrezeme() +"-"+ this.posiljalac.getStanje());
		 System.out.println("racun na" + this.primalac.getImeIPrezime+ " -" +this.primalac()+"-" + this.primalac.getStanje());.
	 }
	 
	 
	 }
           

