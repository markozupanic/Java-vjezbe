package edunova.zadatak1;

public class Toplokrvni extends Fauna{
	
	private String temperatura;
	

	public Toplokrvni(String naziv, String temperatura) {
		super(naziv);
		this.temperatura = temperatura;
	}

	public Toplokrvni() {
		super();
	}

	public String getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(String temperatura) {
		this.temperatura = temperatura;
	}
	
	

}
