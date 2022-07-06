package edunova;

public class Z01 {

	public static void main(String[] args) {
		// Kreirati program koji prvo traži
		// broj predmeta. Zatim sa svaki predmet
		// unosi naziv i zakljuèenu ocjenu
		// program ispisuje popis svih predmeta s 
		// ocjenama i prosjek ocjena
		
		
		Predmet[] predmeti=new Predmet[Pomocno.ucitajInt("Unesi broj predmeta")];
		
		Predmet predmet;
		Profesor profesor;
		Mjesto mjesto;
		for(int i=0;i<predmeti.length;i++) {
			predmet=new Predmet();
			predmet.setNaziv(Pomocno.ucitajString("Unesi naziv za " + (i+1) + " . predmet"));
			
			profesor=new Profesor();
			profesor.setIme("Pero");
		    profesor.setPrezime("Peric");
		    
		    mjesto=new Mjesto();
		    mjesto.setNaziv("Osijek");
		    profesor.setMjesto(mjesto);
		    predmet.setProfesor(profesor);
		    
		    predmet.setOcjena(Pomocno.ucitajInt("Unesi ocjenu za " + (i+1) + ". predmet"));
		    predmeti[i]=predmet;
		   
			
			
			}
		
		int suma=0;
		
		for(Predmet p:predmeti) {
			suma+=p.getOcjena();
			System.out.println(p.getProfesor().getMjesto().getNaziv() + " " +
					p.getProfesor().getIme() + ", "+ 
					p.getNaziv() + ": " + p.getOcjena());
		}
		
		float prosjek=suma/(float)predmeti.length;
		System.out.println("Prosjek: " + prosjek);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
	}

}
