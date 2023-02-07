package model;

public class ExterneMitarbeiter extends Mitarbeiter {

	private String firma;
	

	public ExterneMitarbeiter() {
		super();
	}
	
	public ExterneMitarbeiter(int mitarbeiterNr, String vorname, String nachname, String strasse, String plz,
			String ort, String telefon, String email, String firma) {
		super(mitarbeiterNr, vorname, nachname, strasse, plz, ort, telefon, email);
		this.firma = firma;
	}

	public String getFirma() {
		return firma;
	}

	public void setFirma(String firma) {
		this.firma = firma;
	}
}
