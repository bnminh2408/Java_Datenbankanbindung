package DataAccessObject;

import java.sql.Connection;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Database.MysqlDatabase;
import model.ExterneMitarbeiter;

public class DAOExterneMitarbeiter implements DAOInterface<ExterneMitarbeiter> {

	@Override
	public void insert(ExterneMitarbeiter t) {
		Connection con = MysqlDatabase.connect();
		try {
			Statement st = con.createStatement();
			String query = "INSERT INTO Mitarbeiter (mitarbeiterNr, vorname, nachname, strasse, plz, ort, telefon, email, firma)"
					+ "VALUE(" + t.getMitarbeiterNr() + " , " + t.getVorname() + " , " + t.getNachname() + " , "
					+ t.getStrasse() + " , " + t.getPlz() + " , " + t.getOrt() + " , " + t.getTelefon() + " , "
					+ t.getEmail() + " , " + t.getFirma() + ")";
			int result = st.executeUpdate(query);
			System.out.println("Du hast neue externen Mitarbeiter zugefügt. Folgende Code wurde eingegeben: " + query);
			System.out.println("Das " + " wurde geändert ");
		} catch (SQLException e) {
			e.printStackTrace();
		}	
	}

	@Override
	public int update(ExterneMitarbeiter t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(ExterneMitarbeiter t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<ExterneMitarbeiter> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ExterneMitarbeiter selectById() {
		// TODO Auto-generated method stub
		return null;
	}

}
