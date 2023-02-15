package model;

public class Kunden extends Mitarbeiter {

	private String branche;
	private int kundenNr;

	public Kunden() {
		super();
	}

	public Kunden( int kundenNr, String vorname, String nachname, String strasse, String plz, String ort,
			String telefon, String email, String branche) {
		super(0, vorname, nachname, strasse, plz, ort, telefon, email);
		this.branche = branche;
		this.kundenNr = kundenNr;
	}

	public int getKundenNr() {
		return kundenNr;
	}

	public void setKundenNr(int kundenNr) {
		this.kundenNr = kundenNr;
	}

	public String getBranche() {
		return branche;
	}

	public void setBranche(String branche) {
		this.branche = branche;
	}

	@Override
	public String toString() {
		return "KundenNr= " + kundenNr + ", Vorname= " + getVorname() + ", Nachname= " + getNachname()
				+ ", Strasse= " + getStrasse() + ", Plz= " + getPlz() + ", Ort= " + getOrt() + ", Telefon= " 
				+ getTelefon() + ", Email= " + getEmail() + ", Branche= " + branche ;
	}
	

	
	
	
}
