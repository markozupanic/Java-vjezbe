package zavrsnimodel;

public abstract class Entitet {

	
	private Integer sifra;
	
	
	

	public Entitet(Integer sifra) {
		super();
		this.sifra = sifra;
	}

	public Entitet() {
		super();
	}

	public Integer getSifra() {
		return sifra;
	}

	
	
	
}
