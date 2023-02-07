package DataAccessObject;

import java.sql.Connection;
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
			
			String query = "INSERT INTO mitarbeiter VALUE('" + t.getMitarbeiterNr() + "' , '" + t.getVorname() + "' , '" + t.getNachname() + "' , '"
					+ t.getStrasse() + "' , '" + t.getPlz() + "' , '" + t.getOrt() + "' , '" + t.getTelefon() + "' , '"
					+ t.getEmail() + "')";
			
			int result = stm.executeUpdate(query);
			
			System.out.println("Du hast neue Mitarbeiter zugefuegt. Folgende Code wurde eingegeben: " + query);
			System.out.println("Es wurden: " + result + " Daten hinzugefuegt.");
			MysqlDatabase.disconnect(con);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public int update(Mitarbeiter t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(Mitarbeiter t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<Mitarbeiter> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Mitarbeiter selectById() {
		// TODO Auto-generated method stub
		return null;
	}

}
