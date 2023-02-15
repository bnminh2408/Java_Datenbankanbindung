package model;

public class Mitarbeiter {

	private int mitarbeiterNr;
	private String vorname, nachname, strasse, plz, ort, telefon, email;
	
	public Mitarbeiter() {	
	}

	public Mitarbeiter(int mitarbeiterNr , String vorname, String nachname, String strasse, String plz, String ort,
			String telefon, String email) {
		this.mitarbeiterNr = mitarbeiterNr;
		this.vorname = vorname;
		this.nachname = nachname;
		this.strasse = strasse;
		this.plz = plz;
		this.ort = ort;
		this.telefon = telefon;
		this.email = email;	
	}

	public int getMitarbeiterNr() {
		return mitarbeiterNr;
	}

	public void setMitarbeiterNr(int mitarbeiterNr) {
		this.mitarbeiterNr = mitarbeiterNr;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public String getStrasse() {
		return strasse;
	}

	public void setStrasse(String strasse) {
		this.strasse = strasse;
	}

	public String getPlz() {
		return plz;
	}

	public void setPlz(String plz) {
		this.plz = plz;
	}

	public String getOrt() {
		return ort;
	}

	public void setOrt(String ort) {
		this.ort = ort;
	}

	public String getTelefon() {
		return telefon;
	}

	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "MitarbeiterNr= " + mitarbeiterNr + ", Vorname= " + vorname + ", Nachname= " + nachname
				+ ", Strasse= " + strasse + ", Plz= " + plz + ", Ort= " + ort + ", Telefon= " 
				+ telefon + ", Email= " + email;
	}
}
