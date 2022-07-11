package edunova.zadatak2;

public class Racunalo extends Uredjaj{
	
	
	private String vrstaPrikljucka;
	
	
	
	

	public Racunalo(String proizvodjac, String vrstaPrikljucka) {
		super(proizvodjac);
		this.vrstaPrikljucka = vrstaPrikljucka;
	}

	public Racunalo() {
		super();
	}

	public String getVrstaPrikljucka() {
		return vrstaPrikljucka;
	}

	public void setVrstaPrikljucka(String vrstaPrikljucka) {
		this.vrstaPrikljucka = vrstaPrikljucka;
	}

	
	

}
