package edunova.zadatak2;

public class Televizor extends Uredjaj{
	
	private String televizor;
	
	public Televizor(String proizvodjac, String televizor) {
		super(proizvodjac);
		this.televizor = televizor;
	}

	public Televizor() {
		super();
	}

	public String getTelevizor() {
		return televizor;
	}

	public void setTelevizor(String televizor) {
		this.televizor = televizor;
	}
	
	

}
