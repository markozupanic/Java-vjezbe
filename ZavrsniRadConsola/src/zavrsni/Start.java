package zavrsni;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import zavrsnimodel.Proizvod;
import zavrsnimodel.Rezervacija;
import zavrsnimodel.Zaposlenik;
import zavrsniutil.Pomocno;
import zavrsniutil.ProizvodCRUD;

public class Start {
	
	private List<Proizvod> proizvodi;
	private List<Rezervacija> rezervacije;
	private List<Zaposlenik> zaposlenici;
	
	
	public Start() {
		
		proizvodi =new ArrayList<>();
		rezervacije=new ArrayList<>();
		zaposlenici=new ArrayList<>();
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
		izbornikProgram();
		pokreniProizvodAkciju();
		
		
	}
	
	private void izbornik() {
		
		System.out.println("");
		System.out.println("Glavni izbornik");
		System.out.println("1. Proizvod");
		System.out.println("2. Rezervacija");
		System.out.println("3. Zaposlenik");
		System.out.println("4. Izlaz");
		System.out.println("");
		pokreniProgram(); 
		
	}
	
	private void izbornikProgram() {
		System.out.println("1. Unos");
		System.out.println("2. Pregled");
		System.out.println("3. Promjena");
		System.out.println("4. Brisanje");
		System.out.println("5. povratak na glavni izbornik");
	}
	
	private void proizvodi() {
		System.out.println("Program proizvodi");
		izbornikProgram();
		pokreniProizvodAkciju();
		
	}
	
	private void pokreniProizvodAkciju() {
		
		switch (Pomocno.ucitajInt("Odaberi akciju", 1,5)) {
		case 1: 
			proizvodi.add(ProizvodCRUD.unosNovog());
			proizvodi();
			break;
			
		case 2:
			ProizvodCRUD.ispis(proizvodi);
			proizvodi();
			break;
			
		case 3:
			ProizvodCRUD.ispis(proizvodi);
			ProizvodCRUD.promjena(proizvodi.get(Pomocno.ucitajInt("Odaberi smjer",1,
					proizvodi.size())-1));
			
			proizvodi();
			break;
			
		case 4:
			ProizvodCRUD.ispis(proizvodi);
			proizvodi.remove(Pomocno.ucitajInt("Odaberi smjer",1,proizvodi.size())-1);
			proizvodi();
			break;
			
		case 5:
			izbornik();
		
			
			
		
		}
		
	}
	
	
	
	
	
	
	
	
	
	

	public static void main(String[] args) {
		new Start();
	}
}
