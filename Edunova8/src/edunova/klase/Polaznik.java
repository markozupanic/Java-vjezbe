package edunova.klase;

public class Polaznik extends Osoba{

	
	private String iban;

	
	
	public Polaznik() {
		super();
	}
	
	
	

	public Polaznik(String ime, String prezime, String brojUgovora) {
		super(ime, prezime);
		this.iban = brojUgovora;
	}





	public String getBrojUgovora() {
		return iban;
	}

	public void setBrojUgovora(String brojUgovora) {
		this.iban = brojUgovora;
	}



	@Override
	public String toString() {
		return super.toString()  + " " + iban;
	}











	
	
}
