package DataAccessObject;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import Database.MysqlDatabase;
import model.Mitarbeiter;

public class DAOMitarbeiter implements DAOInterface<Mitarbeiter> {

	@Override
	public void insert(Mitarbeiter t) {
		try {
			Connection con = MysqlDatabase.connect();

			Statement stm = con.createStatement();

			String query = "INSERT INTO mitarbeiter VALUE('" + t.getMitarbeiterNr() + "' , '" + t.getVorname() + "' , '"
					+ t.getNachname() + "' , '" + t.getStrasse() + "' , '" + t.getPlz() + "' , '" + t.getOrt() + "' , '"
					+ t.getTelefon() + "' , '" + t.getEmail() + "')";

			int result = stm.executeUpdate(query);

			System.out.println("Du hast neue Mitarbeiter zugefuegt.\n" + "Folgende Code wurde eingegeben: " + query);
			System.out.println("Es wurden: " + result + " Daten hinzugefuegt.");
			MysqlDatabase.disconnect(con);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/*
	 * @Override public int update(Mitarbeiter t) { try { Connection con =
	 * MysqlDatabase.connect();
	 * 
	 * Statement stm = con.createStatement();
	 * 
	 * String query = "UPDATE  mitarbeiter" + "SET" + "MitarbeiterNr='"+
	 * t.getMitarbeiterNr()+"'"+ "Vorname'"+ t.getVorname()+"'"+ "Nachname'"+
	 * t.getNachname()+"'"+ "Strasse'"+ t.getStrasse()+"'"+ "Plz'"+ t.getPlz()+"'"+
	 * "Ort'"+ t.getOrt()+"'"+ "Telefon'"+ t.getTelefon()+"'"+ "Email'"+
	 * t.getEmail()+"'";
	 * 
	 * int result = stm.executeUpdate(query);
	 * 
	 * System.out.
	 * println("Du hast neue Mitarbeiter zugefuegt. Folgende Code wurde eingegeben: "
	 * + query); System.out.println("Es wurden: " + result +
	 * " Daten hinzugefuegt."); MysqlDatabase.disconnect(con);
	 * 
	 * } catch (Exception e) { e.printStackTrace(); } return 0; }
	 */

	@Override
	public void delete(Mitarbeiter t) {
		try {
			Connection con = MysqlDatabase.connect();

			Statement stm = con.createStatement();

			String query = "DELETE FROM  mitarbeiter WHERE " + "MitarbeiterNr='" + t.getMitarbeiterNr() + "'";

			int result = stm.executeUpdate(query);

			System.out.println("Du hast neue Mitarbeiter geloescht.\n" + "Folgende Code wurde eingegeben: " + query);
			System.out.println("Es wurden: " + result + " Daten geloesch.");

			MysqlDatabase.disconnect(con);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public ArrayList<Mitarbeiter> selectAll() {
		ArrayList<Mitarbeiter> mitarbeiterList = new ArrayList<>();

		try {
			Connection con = MysqlDatabase.connect();

			Statement stm = con.createStatement();

			String query = "SELECT * FROM mitarbeiter ";

			ResultSet result = stm.executeQuery(query);

			while (result.next()) {
				String mitarbeiterNr = result.getString("MitarbeiterNr");
				String vorname = result.getString("Vorname");
				String nachname = result.getString("Nachname");
				String strasse = result.getString("Strasse");
				String plz = result.getString("PLZ");
				String ort = result.getString("Ort");
				String telefon = result.getString("Telefon");
				String email = result.getString("Email");

				Mitarbeiter mitarbeiter = new Mitarbeiter(mitarbeiterNr, vorname, nachname, strasse, plz, ort, telefon,
						email);
				mitarbeiterList.add(mitarbeiter);
			}

			MysqlDatabase.disconnect(con);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return mitarbeiterList;

	}

	@Override
	public Mitarbeiter selectById(Mitarbeiter t) {
		Mitarbeiter mitarbeiter = null;
		try {
			Connection con = MysqlDatabase.connect();

			Statement stm = con.createStatement();

			String query = "SELECT * FROM mitarbeiter WHERE MitarbeiterNr= '" + t.getMitarbeiterNr() + "';";

			ResultSet result = stm.executeQuery(query);

			System.out.println("Folgende Code wurde eingegeben: " + query);

			while (result.next()) {
				String mitarbeiterNr = result.getString("MitarbeiterNr");
				String vorname = result.getString("Vorname");
				String nachname = result.getString("Nachname");
				String strasse = result.getString("Strasse");
				String plz = result.getString("PLZ");
				String ort = result.getString("Ort");
				String telefon = result.getString("Telefon");
				String email = result.getString("Email");

				mitarbeiter = new Mitarbeiter(mitarbeiterNr, vorname, nachname, strasse, plz, ort, telefon, email);
			}

			MysqlDatabase.disconnect(con);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return mitarbeiter;

	}

}
