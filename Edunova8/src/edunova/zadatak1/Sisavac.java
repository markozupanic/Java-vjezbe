package edunova.zadatak1;

public class Sisavac extends Fauna{
	
	
	private String danaTrudnoce;

	
	
	public Sisavac(String naziv, String danaTrudnoce) {
		super(naziv);
		this.danaTrudnoce = danaTrudnoce;
	}

	public Sisavac() {
		super();
	}

	public String getDanaTrudnoce() {
		return danaTrudnoce;
	}

	public void setDanaTrudnoce(String danaTrudnoce) {
		this.danaTrudnoce = danaTrudnoce;
	}
	
	
	

}
