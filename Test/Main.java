package Test;

import java.util.Scanner;

import model.Mitarbeiter;

public class Main {

	public static void main(String[] args) 	 {
		
		Scanner sc = new Scanner(System.in);
		int id = Integer.parseInt(inputValues("Bitte ID eingeben: ",sc));
		String vorname = inputValues("Bitte Vorname eingeben: ",sc);
		String nachname = inputValues("Bitte Nachname eingeben: ",sc);
		String strasse = inputValues("Bitte Strasse eingeben: ",sc);
		String plz = inputValues("Bitte Plz eingeben: ",sc);
		String ort = inputValues("Bitte Ort eingeben: ",sc);
		String telefon = inputValues("Bitte Telefon eingeben: ",sc);
		String email = inputValues("Bitte Email eingeben: ",sc);
		sc.close();

		Mitarbeiter mi = new Mitarbeiter(id, vorname, nachname, strasse, plz, ort, telefon, email);
		
		
		
	}

	public static String inputValues(String text, Scanner sc){
		
		System.out.print(text);
		String input = sc.nextLine();
		
		return input;
	}
}
