package Test;

import java.util.Scanner;

import model.Mitarbeiter;

public class Main {

	public static void main(String[] args) 	 {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Bitte Vorname eingeben: ");
		String vorname = sc.nextLine();
		System.out.println("Bitte ID eingeben: ");
		int id = sc.nextInt();
		System.out.println("Bitte Nachname eingen: ");
		String nachname = sc.nextLine();
		System.out.println("Bitte Strasse eingeben: ");
		String strasse = sc.nextLine();
		System.out.println("Bitte Plz eingeben: ");
		String plz = sc.nextLine();
		System.out.println("Bitte Ort eingeben: ");
		String ort = sc.nextLine();
		System.out.println("Bitte Telefon eingeben: ");
		String telefon = sc.nextLine();
		System.out.println("Bitte Email eingeben: ");
		String email = sc.nextLine();
		sc.close();
		
		Mitarbeiter mi = new Mitarbeiter(id, vorname, nachname, strasse, plz, ort, telefon, email);
		
		
		
	}
}
