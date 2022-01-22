package d_20_01_2022;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

public class Trener extends Osoba {
	
	private int iskustvo;
	private String tip;
	
	public Trener() {
		super();
		}
	
	

	public Trener(String imeIPrezime, String jmbg, int godRodjenja, int iskustvo, String tip) {
		super(imeIPrezime, jmbg, godRodjenja);
		this.iskustvo=iskustvo;
		this.tip=tip;
		
		
		
	}



	public int getIskustvo() {
		return iskustvo;
	}

	public void setIskustvo(int iskustvo) {
		this.iskustvo = iskustvo;
	}

	public String getTip() {
		return tip;
	}

	public void setTip(String tip) {
		this.tip = tip;
		
	}
	   public void Print() {
		   super.Print();
		   System.out.println("iskustvo "+ this.iskustvo + " tip " + this.tip);
		   System.out.println(" ");
		   
		   
	   }
	
	
	
	 

}

