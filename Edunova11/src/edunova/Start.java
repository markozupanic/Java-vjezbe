package edunova;

import java.util.Scanner;

import edunovautil.Pomocno;

public class Start {
	
	public Start() {
		Pomocno.ulaz=new Scanner(System.in);
		System.out.println("***** Edunova konzolna aplikacija v1 *****");
		izbornik();
		Pomocno.ulaz.close();
		
		
	}

	private void pokreniProgram() {
		switch (Pomocno.ucitajInt("Odaberi program", 1, 5)) {
		case 1:
			smjerovi();
			break;
			
		case 2:
			grupe();
			break;	
			
		case 3:
			polaznici();
			break;	
			
		case 4:
			predavaci();
			break;	
			
		case 5:
			System.out.println("Dovi�enja");
		
		}
		
	}
	
	
	private void izbornik() {
		System.out.println("");
		System.out.println("Glavni izbornik");
		System.out.println("1. Smjerovi");
		System.out.println("2. Grupe");
		System.out.println("3. Polaznici");
		System.out.println("4. Predava�i");
		System.out.println("5. Izlaz");
		System.out.println("");
		pokreniProgram(); 
		
	}


	


	private void predavaci() {
		System.out.println("Do�e izbornik za predava�e");
		//za sada
		izbornik();
		
	}


	private void polaznici() {
		System.out.println("Do�e izbornik za predava�e");
		//za sada
		izbornik();
		
	}


	private void grupe() {
		System.out.println("Do�e izbornik za predava�e");
		//za sada
		izbornik();
		
	}


	private void smjerovi() {
		System.out.println("Do�e izbornik za smjerove");
		izbornik();
	}


	public static void main(String[] args) {
		new Start();
	}
}
