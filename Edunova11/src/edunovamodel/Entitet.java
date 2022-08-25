package edunovamodel;

public abstract class Entitet {
	
	private Integer sifra;

	public Integer getSifra() {
		return sifra;
	}

	public void setSifra(Integer sifra) {
		this.sifra = sifra;
	}

	public Entitet() {
		super();
	}

	public Entitet(Integer sifra) {
		super();
		this.sifra = sifra;
	}
	
	
	
	
	

}
