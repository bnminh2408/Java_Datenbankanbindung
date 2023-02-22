package DataAccessObject;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Database.MysqlDatabase;
import model.ExterneMitarbeiter;

public class DAOExterneMitarbeiter implements DAOInterface<ExterneMitarbeiter> {

	@Override
	public void insert(ExterneMitarbeiter t) {
		try {
			Connection con = MysqlDatabase.connect();

			Statement stm = con.createStatement();

			String query = "INSERT INTO externemitarbeiter VALUE('" + t.getMitarbeiterNr() + "' , '" + t.getVorname()
					+ "' , '" + t.getNachname() + "' , '" + t.getStrasse() + "' , '" + t.getPlz() + "' , '" + t.getOrt()
					+ "' , '" + t.getTelefon() + "' , '" + t.getEmail() + "' , '" + t.getFirma() + "')";

			int result = stm.executeUpdate(query);

			System.out.println("Du hast neue externen Mitarbeiter zugefügt. Folgende Code wurde eingegeben: " + query);
			System.out.println("Das " + result + " wurde geändert ");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

//	@Override
//	public int update(ExterneMitarbeiter t) {
//		// TODO Auto-generated method stub
//		return 0;
//	}

	@Override
	public void delete(ExterneMitarbeiter t) {
		try {
			Connection con = MysqlDatabase.connect();

			Statement stm = con.createStatement();

			String query = "DELETE FROM  externemitarbeiter WHERE " + "MitarbeiterNr='" + t.getMitarbeiterNr() + "'";

			int result = stm.executeUpdate(query);

			System.out.println("Du hast neue Mitarbeiter zugefuegt. Folgende Code wurde eingegeben: " + query);
			System.out.println("Es wurden: " + result + " Daten geloesch.");

			MysqlDatabase.disconnect(con);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public ArrayList<ExterneMitarbeiter> selectAll() {
		ArrayList<ExterneMitarbeiter> externemitarbeiterList = new ArrayList<>();

		try {
			Connection con = MysqlDatabase.connect();

			Statement stm = con.createStatement();

			String query = "SELECT * FROM externemitarbeiter ";

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
				String firma = result.getString("Firma");

				ExterneMitarbeiter mitarbeiter = new ExterneMitarbeiter(mitarbeiterNr, vorname, nachname, strasse, plz,
						ort, telefon, email, firma);
				externemitarbeiterList.add(mitarbeiter);
			}

			MysqlDatabase.disconnect(con);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return externemitarbeiterList;
	}

	@Override
	public ExterneMitarbeiter selectById(ExterneMitarbeiter t) {
		ExterneMitarbeiter externeMitarbeiter = null;
		try {
			Connection con = MysqlDatabase.connect();

			Statement stm = con.createStatement();

			String query = "SELECT * FROM externemitarbeiter WHERE MitarbeiterNr= '" + t.getMitarbeiterNr() + "';";

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
				String firma = result.getString("Firma");

				externeMitarbeiter = new ExterneMitarbeiter(mitarbeiterNr, vorname, nachname, strasse, plz, ort,
						telefon, email, firma);
			}

			MysqlDatabase.disconnect(con);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return externeMitarbeiter;
	}

}
