package zavrsnimodel;

import java.util.Date;

public class Zaposlenik extends Entitet {
	
	private String ime;
	private String prezime;
	private String kontakt;
	private Date smjena;
	private String znanje;
	
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
	public String getKontakt() {
		return kontakt;
	}
	public void setKontakt(String kontakt) {
		this.kontakt = kontakt;
	}
	public Date getSmjena() {
		return smjena;
	}
	public void setSmjena(Date smjena) {
		this.smjena = smjena;
	}
	public String getZnanje() {
		return znanje;
	}
	public void setZnanje(String znanje) {
		this.znanje = znanje;
	}
	
	
	

}
