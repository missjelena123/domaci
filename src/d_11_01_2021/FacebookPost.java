package d_11_01_2021;

public class FacebookPost {

	String korisnik;
	String imeProfila;
	String tekst;
	int lajkovi;
	int deljenje;

	public void like() {
		this.lajkovi = this.lajkovi + 1;

	}

	public void dislike() {
	  if (lajkovi>0) {
		this.lajkovi= this.lajkovi-1;
	  }		
	}
	  public void share() {
		  this.deljenje=this.deljenje +1;
		  
	}
	  public void print() {
       System.out.println( this.korisnik +">>>" + this.imeProfila );
       System.out.println( this.tekst);
       System.out.println( this.lajkovi +"|" + this.deljenje);
       
   }
}