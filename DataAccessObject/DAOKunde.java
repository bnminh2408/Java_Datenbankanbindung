package DataAccessObject;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import Database.MysqlDatabase;
import model.Kunden;
import model.Mitarbeiter;

public class DAOKunde extends Mitarbeiter implements DAOInterface<Kunden> {

	@Override
	public void insert(Kunden t) {
		try {
			Connection con = MysqlDatabase.connect();

			Statement stm = con.createStatement();

			String query = "INSERT INTO kunden VALUE('" + t.getKundenNr() + "' , '" + t.getVorname() + "' , '"
					+ t.getNachname() + "' , '" + t.getStrasse() + "' , '" + t.getPlz() + "' , '" + t.getOrt() + "' , '"
					+ t.getTelefon() + "' , '" + t.getEmail() + "' , '" + t.getBranche() + "')";

			int result = stm.executeUpdate(query);

			System.out.println("Du hast neue Kunde zugefuegt. Folgende Code wurde eingegeben: " + query);
			System.out.println("Es wurden: " + result + " Daten hinzugefuegt.");
			MysqlDatabase.disconnect(con);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void delete(Kunden t) {
		try {
			Connection con = MysqlDatabase.connect();

			Statement stm = con.createStatement();

			String query = "DELETE FROM  kunden WHERE " + "KundenNr='" + t.getKundenNr() + "'";

			int result = stm.executeUpdate(query);

			System.out.println("Ein Kunde würde geloescht. Folgende Code wurde eingegeben: " + query);
			System.out.println("Es wurden: " + result + " Daten geloesch.");

			MysqlDatabase.disconnect(con);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public ArrayList<Kunden> selectAll() {
		ArrayList<Kunden> kundenList = new ArrayList<>();

		try {
			Connection con = MysqlDatabase.connect();

			Statement stm = con.createStatement();

			String query = "SELECT * FROM kunden ";

			ResultSet result = stm.executeQuery(query);

			while (result.next()) {
				String kundenNr = result.getString("KundenNr");
				String vorname = result.getString("Vorname");
				String nachname = result.getString("Nachname");
				String strasse = result.getString("Strasse");
				String plz = result.getString("PLZ");
				String ort = result.getString("Ort");
				String telefon = result.getString("Telefon");
				String email = result.getString("Email");
				String branche = result.getString("Branche");

				Kunden kunden = new Kunden(kundenNr, vorname, nachname, strasse, plz, ort, telefon, email, branche);
				kundenList.add(kunden);
			}

			MysqlDatabase.disconnect(con);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return kundenList;
	}

	@Override
	public Kunden selectById(Kunden t) {
		Kunden kunden = null;
		try {
			Connection con = MysqlDatabase.connect();

			Statement stm = con.createStatement();

			String query = "SELECT * FROM kunden WHERE KundenNr= '" + t.getKundenNr() + "';";

			ResultSet result = stm.executeQuery(query);

			while (result.next()) {
				String kundenNr = result.getString("KundenNr");
				String vorname = result.getString("Vorname");
				String nachname = result.getString("Nachname");
				String strasse = result.getString("Strasse");
				String plz = result.getString("PLZ");
				String ort = result.getString("Ort");
				String telefon = result.getString("Telefon");
				String email = result.getString("Email");
				String branche = result.getString("Branche");

				kunden = new Kunden(kundenNr, vorname, nachname, strasse, plz, ort, telefon, email, branche);
			}

			System.out.println(" Folgende Code wurde eingegeben: " + query + "\n");

			MysqlDatabase.disconnect(con);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return kunden;

	}

}
