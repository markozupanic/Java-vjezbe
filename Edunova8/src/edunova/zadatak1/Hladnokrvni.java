package edunova.zadatak1;

public class Hladnokrvni extends Fauna{

	
	private String xxx;
	

	public Hladnokrvni(String naziv, String xxx) {
		super(naziv);
		this.xxx = xxx;
	}

	public Hladnokrvni() {
		super();
	}

	public String getXxx() {
		return xxx;
	}

	public void setXxx(String xxx) {
		this.xxx = xxx;
	}
	
	
}
