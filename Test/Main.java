package Test;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Scanner;

import DataAccessObject.DAOMitarbeiter;
import Database.MysqlDatabase;
import model.Kunden;
import model.Mitarbeiter;

public class Main {

	public static void main(String[] args) 	 {
		
<<<<<<< HEAD
//		System.out.println();
//		int input;
//		
//		
//		Mitarbeiter mitarbeiter1 = new Mitarbeiter();
//		DAOMitarbeiter daoMitarbeiter = new DAOMitarbeiter();
//		
//		Scanner sc = new Scanner(System.in);
//		
//		switch (input = Integer.parseInt(inputValues("Bitte waehlen Sie folgende fuktionen:\n"
//				+ "(1) Neue Daten hinzufuegen\n"
//				+ "(2) Daten loeschen", sc))){
//		case 1: {
//			int id = Integer.parseInt(inputValues("Bitte ID eingeben: ",sc));
//			String vorname = inputValues("Bitte Vorname eingeben: ",sc);
//			String nachname = inputValues("Bitte Nachname eingeben: ",sc);
//			String strasse = inputValues("Bitte Strasse eingeben: ",sc);
//			String plz = inputValues("Bitte Plz eingeben: ",sc);
//			String ort = inputValues("Bitte Ort eingeben: ",sc);
//			String telefon = inputValues("Bitte Telefon eingeben: ",sc);
//			String email = inputValues("Bitte Email eingeben: ",sc);
//			
//			daoMitarbeiter.insert(mitarbeiter1 = new Mitarbeiter(id, vorname, nachname, strasse, plz, ort, telefon, email));
//			System.out.println();
//			System.out.println("Sie haben folgenden Daten hizugefuegt: " + mitarbeiter1);
//			
//			break;
//		}
//		case 2:
//			mitarbeiter1.setMitarbeiterNr(input = Integer.parseInt(inputValues("kkkk", sc)));
//		}
		
		
		/* Scanner sc = new Scanner(System.in);
=======

		Scanner sc = new Scanner(System.in);
>>>>>>> 033b595558bfdce1d993bc5066d76c5853dbe049
		int id = Integer.parseInt(inputValues("Bitte ID eingeben: ",sc));
		String vorname = inputValues("Bitte Vorname eingeben: ",sc);
		String nachname = inputValues("Bitte Nachname eingeben: ",sc);
		String strasse = inputValues("Bitte Strasse eingeben: ",sc);
		String plz = inputValues("Bitte Plz eingeben: ",sc);
		String ort = inputValues("Bitte Ort eingeben: ",sc);
		String telefon = inputValues("Bitte Telefon eingeben: ",sc);
		String email = inputValues("Bitte Email eingeben: ",sc);
<<<<<<< HEAD
		sc.close(); */

		//Mitarbeiter mi = new Mitarbeiter(id, vorname, nachname, strasse, plz, ort, telefon, email);
		//System.out.println(mi);
		// Test 
		//Connection database = MysqlDatabase.connect();
		//Test SelectById
//		Mitarbeiter mit1 = new Mitarbeiter(10,"b","f","f","f","f","f","w");
//		
//		DAOMitarbeiter test =  new DAOMitarbeiter();
//		Mitarbeiter mitarbeiter = test.selectById(mit1);
//		System.out.println(mitarbeiter.toString());
//		// Test Insert
//		DAOMitarbeiter test1 = new DAOMitarbeiter(); 
=======

		Mitarbeiter mit1 = new Mitarbeiter(10,"b","f","f","f","f","f","w");

		sc.close();

		Mitarbeiter mi = new Mitarbeiter(id, vorname, nachname, strasse, plz, ort, telefon, email);
		System.out.println(mi);
		// Test Update
		DAOMitarbeiter test =  new DAOMitarbeiter();
		test.update(mi);
>>>>>>> 033b595558bfdce1d993bc5066d76c5853dbe049
		
		// test DELETE
//		Mitarbeiter m1 = new Mitarbeiter();
//		m1.setMitarbeiterNr(13);
//		DAOMitarbeiter testDelete = new DAOMitarbeiter();
//		testDelete.delete(m1);
		// Test Array
		DAOMitarbeiter test = new DAOMitarbeiter();
		ArrayList<Mitarbeiter> list = test.selectAll();
		
		for (Mitarbeiter mitarbeiter : list) {
			
			System.out.println(mitarbeiter.toString());
			
		}
		
	Kunden ku = new Kunden();
	ku.setMitarbeiterNr(1);
	System.out.println(ku.getMitarbeiterNr());
		
		
	}

	public static String inputValues(String text, Scanner sc){
		
		System.out.print(text);
		String input = sc.nextLine();
		
		return input;
	}
}
