package zavrsniutil;

import java.util.List;

import zavrsnimodel.Zaposlenik;

public class ZaposlenikCRUD {
	
	public static Zaposlenik unosNovogZaposlenika() {
		Zaposlenik z=new Zaposlenik();
		z.setIme(Pomocno.ucitajString("Unesite ime zaposlenika"));
		z.setPrezime(Pomocno.ucitajString("Unesite prezime zaposlenika"));
		z.setKontakt(Pomocno.ucitajString("Unesite kontakt zaposlenika"));
		z.setZnanje(Pomocno.ucitajString("Unesite znanje zaposlenika"));
		
		return z;

	}
	
	
	public static void ispis(List<Zaposlenik> zaposlenici) {
		int rb=1;
		
		System.out.println("");
		System.out.println("Zaposlenici u aplikaciji");
		for(Zaposlenik z : zaposlenici) {
			System.out.println(rb++ + ". " + z.getIme() + " " + z.getPrezime());
		}
		
		System.out.println("-----------------");
		
	}
	
	public static void promjena (Zaposlenik z) {
		z.setIme(Pomocno.ucitajString("ime  (" + z.getIme() + ")"));
		z.setPrezime(Pomocno.ucitajString("prezime  (" + z.getPrezime() + ")"));
		z.setKontakt(Pomocno.ucitajString("kontakt (" + z.getKontakt() + ")"));
		
		
	}
	
	
	
	
	

}
