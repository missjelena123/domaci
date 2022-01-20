package d_18_01_2022;

public class zadatak1 {

	public static void main
	Student student1 = new Student("43431", "Jelena Bogdanovic", "Motorika");
		
		Ispit ispit1 = new Ispit ("teorija i metodika", 7, "Pera Peric");
		Ispit ispit2 = new Ispit ("kosarka", 10, "Marko Markovic");
		Ispit ispit3 = new Ispit ("plivanje", 8, "Djura DJuric");
		Ispit ispit4 = new Ispit ("anatomija", 9, "Marko Markovic");
		Ispit ispit5 = new Ispit ("fiziologija", 8, "Radovan Radovanovic");
		

	student1.dodajIspit(ispit1);
	student1.dodajIspit(ispit2);
	student1.dodajIspit(ispit3);
	student1.dodajIspit(ispit4);
	student1.dodajIspit(ispit5);
	
	
	student1.Print();
		
	}

}
}
}



