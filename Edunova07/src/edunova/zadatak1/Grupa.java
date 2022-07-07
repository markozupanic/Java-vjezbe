package edunova.zadatak1;
//Kreirajte klasu Grupa s svojstvima
		// naziv, datum poèetka, smjer i predavaè
		// Smjer ima naziv i cijenu
		// Predavaè ima ime i prezime
		// SVE KLASE MORAJU BITI U PAKETU
		// edunova.zadatak1

import java.util.Date;

public class Grupa {

	
	public String naziv;
	public Date  datumPocetka;
	public String smjer;
	public String predavac;
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public Date getDatumPocetka() {
		return datumPocetka;
	}
	public void setDatumPocetka(Date datumPocetka) {
		this.datumPocetka = datumPocetka;
	}
	public String getSmjer() {
		return smjer;
	}
	public void setSmjer(String smjer) {
		this.smjer = smjer;
	}
	public String getPredavac() {
		return predavac;
	}
	public void setPredavac(String predavac) {
		this.predavac = predavac;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
