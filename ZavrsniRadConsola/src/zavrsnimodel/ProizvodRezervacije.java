package zavrsnimodel;

public class ProizvodRezervacije extends Entitet{
	
	private Integer proizvod;
	private Rezervacija rezervacija;
	
	
	
	
	public ProizvodRezervacije(Integer sifra, Integer proizvod, Rezervacija rezervacija) {
		super(sifra);
		this.proizvod = proizvod;
		this.rezervacija = rezervacija;
	}
	public ProizvodRezervacije() {
		super();
	}
	public Integer getProizvod() {
		return proizvod;
	}
	public void setProizvod(Integer proizvod) {
		this.proizvod = proizvod;
	}
	public Rezervacija getRezervacija() {
		return rezervacija;
	}
	public void setRezervacija(Rezervacija rezervacija) {
		this.rezervacija = rezervacija;
	}
	
	
}
