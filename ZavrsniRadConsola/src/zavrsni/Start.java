package zavrsni;

import java.util.Scanner;

import zavrsniutil.Pomocno;

public class Start {
	
	public Start() {
		Pomocno.ulaz=new Scanner(System.in);
		System.out.println("***** Zavrsni rad konzolna aplikacija V1 *****");
		izbornik();
		Pomocno.ulaz.close();
	}

	private void pokreniProgram() {
		
		switch (Pomocno.ucitajInt("Odaberi ", 1, 4)) {
		case 1:
			proizvod();
			break;
			
		case 2:
			rezervacija();
			break;
		
		case 3:
			zaposlenik();
			break;
			
		case 4:
			System.out.println("Doviðenja");
			
		
		}
	}
	
	private void zaposlenik() {
		System.out.println("Doðe izbornik za zaposlenike");
		
		izbornik();
		
	}

	

	private void rezervacija() {
		System.out.println("Doðe izbornik za rezervacije");
		
		izbornik();
		
	}

	private void proizvod() {
		System.out.println("Doðe izbornik za proizvode");
		
		izbornik();
		
	}
	
	private void izbornik() {
		
		System.out.println("");
		System.out.println("Glavni izbornik");
		System.out.println("1. Zaposlenik");
		System.out.println("2. Rezervacija");
		System.out.println("3. Proizvod");
		System.out.println("4. Izlaz");
		System.out.println("");
		pokreniProgram(); 
		
	}
	
	
	
	
	
	
	
	
	
	

	public static void main(String[] args) {
		new Start();
	}
}
