package edunova.klase;

public abstract class Osoba extends  Object {
	
	private String ime;
	private String prezime;
	
	
	
	
	
	
	
	public Osoba(String ime, String prezime) {
		super();
		this.ime = ime;
		this.prezime = prezime;
	}
	public Osoba() {
		super();
	}
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getPrezime() {
		return prezime;
	}
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	
	public String toString() {
		StringBuilder sb= new StringBuilder();
		sb.append(ime).append(" ").append(prezime);
		return sb.toString();
	}
	
	

}
