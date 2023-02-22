package Test;

import java.util.ArrayList;
import java.util.Scanner;

import DataAccessObject.DAOExterneMitarbeiter;
import DataAccessObject.DAOKunde;
import DataAccessObject.DAOMitarbeiter;
import inputandprocess.UserInput;
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

		UserInput userInput = new UserInput();
		// ab hier
		while (weiterMachen) {
			switch (userInput.firstProcess()) {
			case 1: {
				// ab hier

				switch (userInput.secondProcess()) {

				case 1: {
					mitarbeiter = userInput.setMitarbeiter(sc);

					daoMitarbeiter.insert(mitarbeiter);
					System.out.println();
					System.out.println("Sie haben folgenden Daten hizugefuegt: " + mitarbeiter);

					break;
				}
				case 2: {
					mitarbeiter.setMitarbeiterNr(
							input = Integer.parseInt(userInput.inputValues("Sie loeschen Mitarbeiter mit ID: ", sc)));
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
							input = Integer.parseInt(userInput.inputValues("Sie suchen Mitarbeiter mit ID:  ", sc)));
					Mitarbeiter findMitarbeiter = daoMitarbeiter.selectById(mitarbeiter);
					System.out.println(findMitarbeiter);
					break;
				}
				case 5: {
					break;
				}
				default:
					System.out.println("Wiederholen Sie den Vorgang.\n");
				}
				break;

			}
			case 2: {
				switch (userInput.secondProcess()) {
				case 1: {
					externeMitarbeiter = userInput.setExterneMitarbeiter(sc);

					System.out.println();
					System.out.println("Sie haben folgenden Daten hizugefuegt: " + externeMitarbeiter);

					break;
				}
				case 2: {
					externeMitarbeiter.setMitarbeiterNr(input = Integer
							.parseInt(userInput.inputValues("Sie loeschen externe Mitarbeiter mit ID:  ", sc)));
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

					externeMitarbeiter.setMitarbeiterNr(input = Integer
							.parseInt(userInput.inputValues("Sie suchen externe Mitarbeiter mit ID:  ", sc)));
					ExterneMitarbeiter findMitarbeiter = daoExterneMitarbeiter.selectById(externeMitarbeiter);
					System.out.println(findMitarbeiter);
					break;
				}
				case 5: {
					break;
				}
				default:
					System.out.println("Wiederholen Sie den Vorgang.\n");
				}

				break;
			}
			case 3: {
				switch (userInput.secondProcess()) {
				case 1: {
					kunden = userInput.setKunden(sc);

					daoKunden.insert(kunden);

					System.out.println();
					System.out.println("Sie haben folgenden Daten hizugefuegt: " + kunden);

					break;
				}
				case 2: {
					kunden.setKundenNr(
							input = Integer.parseInt(userInput.inputValues("Sie loeschen Kunden mit ID: ", sc)));
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
					kunden.setKundenNr(
							input = Integer.parseInt(userInput.inputValues("Sie suche Kunden mit ID:  ", sc)));
					Kunden findKunden = daoKunden.selectById(kunden);
					System.out.println(findKunden);
					break;
				}
				case 5: {
					break;
				}
				default:
					System.out.println("Wiederholen Sie den Vorgang.\n");
				}

				break;
			}
			case 4: {
				weiterMachen = false;
				System.out.println("Das Program ist beendet.");
			}
			default:
				System.out.println("Wiederholen Sie den Vorgang.\n");

			}
// bis hier
		}
	}
}
