package d_20_01_2022;

public class zadatak1 {

	public static void main(String[] args) {
		
		Igrac Igrac1= new Igrac("Bogdan Bogdanovic", "1321356174", 1992, 7, "bek ", true); 
		Igrac Igrac2= new Igrac("Nemanja Nedovic", "532163830948", 1990, 10, "bek ", false);
		
	Trener	Trener1= new Trener("Jelena Bogdanovic " , "1309992766012" , 1992, 5, "kondicioni");
	Trener	Trener2= new Trener("Dusan Ivkocic " , "15231483982832" , 1955, 25, "personalni");
		
       
		Igrac1.Print();
		Igrac2.Print();
		Trener1.Print();
		Trener2.Print();
	}

}
