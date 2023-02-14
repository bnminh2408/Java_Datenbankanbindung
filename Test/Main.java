package Test;

import java.util.ArrayList;
import java.util.Scanner;

import DataAccessObject.DAOExterneMitarbeiter;
import DataAccessObject.DAOKunde;
import DataAccessObject.DAOMitarbeiter;
import model.ExterneMitarbeiter;
import model.Kunden;
import model.Mitarbeiter;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Mitarbeiter mitarbeiter = new Mitarbeiter();
		ExterneMitarbeiter externeMitarbeiter = new ExterneMitarbeiter();
		Kunden kunden = new Kunden();

		DAOMitarbeiter daoMitarbeiter = new DAOMitarbeiter();
		DAOExterneMitarbeiter daoExterneMitarbeiter = new DAOExterneMitarbeiter();
		DAOKunde daoKunden = new DAOKunde();

		ArrayList<Mitarbeiter> listMitarbeiter = daoMitarbeiter.selectAll();
		ArrayList<ExterneMitarbeiter> listExterneMitarbeiter = daoExterneMitarbeiter.selectAll();
		ArrayList<Kunden> listKunden = daoKunden.selectAll();

		int input;
		boolean weiterMachen = true;
		// ab hier
		while (weiterMachen) {
			switch (input = Integer.parseInt(inputValues(
					"Weche folgende Daten moechten sie bearbeiten:\n" + "(1) Mitarbeiter\n" + "(2) Externe Mitarbeiter\n"
							+ "(3) Kunden\n" + "(4) Quit\n" + "Bitte nur Zahlen von 1 bis 4 eingeben: ",
					sc))) {
			case 1: {
				switch (input = Integer
						.parseInt(inputValues("Was moechten sie tun ?\n" + "(1) Insert\n" + "(2) Delete\n"
								+ "(3) Select All\n" + "(4) Select by ID\n" + "Bitte nur Zahlen von 1 bis 4 eingeben: ", sc))) {
				case 1: {
					int id = Integer.parseInt(inputValues("Bitte ID eingeben: ", sc));
					String vorname = inputValues("Bitte Vorname eingeben: ", sc);
					String nachname = inputValues("Bitte Nachname eingeben: ", sc);
					String strasse = inputValues("Bitte Strasse eingeben: ", sc);
					String plz = inputValues("Bitte Plz eingeben: ", sc);
					String ort = inputValues("Bitte Ort eingeben: ", sc);
					String telefon = inputValues("Bitte Telefon eingeben: ", sc);
					String email = inputValues("Bitte Email eingeben: ", sc);

					daoMitarbeiter.insert(
							mitarbeiter = new Mitarbeiter(id, vorname, nachname, strasse, plz, ort, telefon, email));
					System.out.println();
					System.out.println("Sie haben folgenden Daten hizugefuegt: " + mitarbeiter);

					break;
				}
				case 2: {
					mitarbeiter.setMitarbeiterNr(input = Integer
							.parseInt(inputValues("Sie möchte Mitarbeiter mit welche ID loeschen:...", sc)));
					daoMitarbeiter.delete(mitarbeiter);
					break;
				}
				case 3: {
					for (Mitarbeiter elemente : listMitarbeiter) {
						System.out.println(elemente.toString());
					}
					break;
				}
				case 4: {
					mitarbeiter.setMitarbeiterNr(
							input = Integer.parseInt(inputValues("Sie moechte Mitarbeiter mit ID:  ", sc)));
					Mitarbeiter findMitarbeiter = daoMitarbeiter.selectById(mitarbeiter);
					System.out.println(findMitarbeiter);
					break;
				}
				}

				break;
			}
			case 2: {
				switch (input = Integer
						.parseInt(inputValues("Was moechten sie tun ?\n" + "(1) Insert\n" + "(2) Delete\n"
								+ "(3) Select All\n" + "(4) Select by ID\n" + "Bitte nur Zahlen eingeben: ", sc))) {
				case 1: {
					int id = Integer.parseInt(inputValues("Bitte ID eingeben: ", sc));
					String vorname = inputValues("Bitte Vorname eingeben: ", sc);
					String nachname = inputValues("Bitte Nachname eingeben: ", sc);
					String strasse = inputValues("Bitte Strasse eingeben: ", sc);
					String plz = inputValues("Bitte Plz eingeben: ", sc);
					String ort = inputValues("Bitte Ort eingeben: ", sc);
					String telefon = inputValues("Bitte Telefon eingeben: ", sc);
					String email = inputValues("Bitte Email eingeben: ", sc);
					String firma = inputValues("Bitte Firma angeben: ", sc);

					daoExterneMitarbeiter.insert(externeMitarbeiter = new ExterneMitarbeiter(id, vorname, nachname,
							strasse, plz, ort, telefon, email, firma));
					System.out.println();
					System.out.println("Sie haben folgenden Daten hizugefuegt: " + externeMitarbeiter);

					break;
				}
				case 2: {
					externeMitarbeiter.setMitarbeiterNr(input = Integer
							.parseInt(inputValues("Sie moechte externe Mitarbeiter mit welche ID loeschen:... ", sc)));
					daoMitarbeiter.delete(externeMitarbeiter);
					break;
				}
				case 3: {
					for (ExterneMitarbeiter elemente : listExterneMitarbeiter) {
						System.out.println(elemente.toString());
					}
					break;
				}
				case 4: {

					externeMitarbeiter.setMitarbeiterNr(
							input = Integer.parseInt(inputValues("Sie suchen externe Mitarbeiter mit ID:  ", sc)));
					ExterneMitarbeiter findMitarbeiter = daoExterneMitarbeiter.selectById(externeMitarbeiter);
					System.out.println(findMitarbeiter);
					break;
				}
				}

				break;
			}
			case 3: {
				switch (input = Integer
						.parseInt(inputValues("Was moechten sie tun ?\n" + "(1) Insert\n" + "(2) Delete\n"
								+ "(3) Select All\n" + "(4) Select by ID\n" + "Bitte nur Zahlen eingeben: ", sc))) {
				case 1: {
					int id = Integer.parseInt(inputValues("Bitte ID eingeben: ", sc));
					String vorname = inputValues("Bitte Vorname eingeben: ", sc);
					String nachname = inputValues("Bitte Nachname eingeben: ", sc);
					String strasse = inputValues("Bitte Strasse eingeben: ", sc);
					String plz = inputValues("Bitte Plz eingeben: ", sc);
					String ort = inputValues("Bitte Ort eingeben: ", sc);
					String telefon = inputValues("Bitte Telefon eingeben: ", sc);
					String email = inputValues("Bitte Email eingeben: ", sc);
					String branche = inputValues("Bitte Branche eingeben: ", sc);

					daoKunden.insert(
							kunden = new Kunden(id, vorname, nachname, strasse, plz, ort, telefon, email, branche));
					System.out.println();
					System.out.println("Sie haben folgenden Daten hizugefuegt: " + kunden);

					break;
				}
				case 2: {
					kunden.setKundenNr(
							input = Integer.parseInt(inputValues("Sie möchte Kunden mit welche ID loeschen:...", sc)));
					daoKunden.delete(kunden);
					break;
				}
				case 3: {
					for (Kunden elemente : listKunden) {
						System.out.println(elemente.toString());
					}
					break;
				}
				case 4: {
					kunden.setKundenNr(input = Integer.parseInt(inputValues("Sie moechte Kunden mit ID:  ", sc)));
					Kunden findKunden = daoKunden.selectById(kunden);
					System.out.println(findKunden);
					break;
				}
				}

				break;
			}
			case 4: {
				weiterMachen = false;
				System.out.println("Das Program ist beendet.");
			}
			default:
					System.out.println("");
				
				
				
			}
// bis hier
		}

	}

	public static String inputValues(String text, Scanner sc) {

		System.out.print(text);
		String input = sc.nextLine();

		return input;
	}
}
