package inputandprocess;
import java.util.Scanner;

import model.ExterneMitarbeiter;
import model.Kunden;
import model.Mitarbeiter;

public class UserInput{

    public String inputValues(String text, Scanner sc) {
		System.out.print(text);
		String input = sc.nextLine();
		return input;
	}

    public Mitarbeiter setMitarbeiter(Scanner sc){
        int id = Integer.parseInt(inputValues("Bitte ID eingeben: ", sc));
        String vorname = inputValues("Bitte Vorname eingeben: ", sc);
        String nachname = inputValues("Bitte Nachname eingeben: ", sc);
        String strasse = inputValues("Bitte Strasse eingeben: ", sc);
        String plz = inputValues("Bitte Plz eingeben: ", sc);
        String ort = inputValues("Bitte Ort eingeben: ", sc);
        String telefon = inputValues("Bitte Telefon eingeben: ", sc);
        String email = inputValues("Bitte Email eingeben: ", sc);

        return new Mitarbeiter(id, vorname, nachname, strasse, plz, ort, telefon, email);
    }

    public ExterneMitarbeiter setExterneMitarbeiter(Scanner sc){
        int id = Integer.parseInt(inputValues("Bitte ID eingeben: ", sc));
        String vorname = inputValues("Bitte Vorname eingeben: ", sc);
        String nachname = inputValues("Bitte Nachname eingeben: ", sc);
        String strasse = inputValues("Bitte Strasse eingeben: ", sc);
        String plz = inputValues("Bitte Plz eingeben: ", sc);
        String ort = inputValues("Bitte Ort eingeben: ", sc);
        String telefon = inputValues("Bitte Telefon eingeben: ", sc);
        String email = inputValues("Bitte Email eingeben: ", sc);
        String firma = inputValues("Bitte Firma angeben: ", sc);

        return new ExterneMitarbeiter(id, vorname, nachname,strasse, plz, ort, telefon, email, firma);
    }

    public Kunden setKunden(Scanner sc){
        int id = Integer.parseInt(inputValues("Bitte ID eingeben: ", sc));
		String vorname = inputValues("Bitte Vorname eingeben: ", sc);
		String nachname = inputValues("Bitte Nachname eingeben: ", sc);
		String strasse = inputValues("Bitte Strasse eingeben: ", sc);
		String plz = inputValues("Bitte Plz eingeben: ", sc);
		String ort = inputValues("Bitte Ort eingeben: ", sc);
		String telefon = inputValues("Bitte Telefon eingeben: ", sc);
		String email = inputValues("Bitte Email eingeben: ", sc);
		String branche = inputValues("Bitte Branche eingeben: ", sc);

        return new Kunden(id, vorname, nachname, strasse, plz, ort, telefon, email, branche);
    }
    
    public int firstProcess() {
    	UserInput userInput = new UserInput();
		Scanner sc = new Scanner(System.in);

		int input = 0;
		try {
			input = Integer.parseInt(userInput.inputValues("Weche folgende Daten moechten sie bearbeiten:\n"
					+ "(1) Mitarbeiter\n" + "(2) Externe Mitarbeiter\n" + "(3) Kunden\n" + "(4) Quit\n"
					+ "Bitte nur Zahlen von 1 bis 4 eingeben: ", sc));
			return input;
		} catch (Exception e) {
			System.out.println("Keine invalide Eingabe!");
		}
		return input;
    }
    
    public int secondProcess() {
		UserInput userInput = new UserInput();
		Scanner sc = new Scanner(System.in);

		int input = 0;
		try {
			input = Integer.parseInt(userInput.inputValues("Was moechten sie tun ?\n" + "(1) Insert\n" + "(2) Delete\n"
					+ "(3) Select All\n" + "(4) Select by ID\n" + "Bitte nur Zahlen eingeben: ", sc));
			return input;
		} catch (Exception e) {
			System.out.println("Keine invalide Eingabe!");
		}
		return input;
	}
}