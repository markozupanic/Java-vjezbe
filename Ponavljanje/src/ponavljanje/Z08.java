package ponavljanje;

import javax.swing.JOptionPane;

public class Z08 {

	public static void main(String[] args) {
		// Deklarirajte niz od 4 cijela broja,
		// u niz uèitajte vrijednosti od korisnika
		// ispišite sumu svih upisanih vrijednosti
		
		
		
		int niz[] = {
				
				Integer.parseInt(JOptionPane.showInputDialog("Unesi cjeli broj")),
				Integer.parseInt(JOptionPane.showInputDialog("Unesi cjeli broj")),
				Integer.parseInt(JOptionPane.showInputDialog("Unesi cjeli broj")),
				Integer.parseInt(JOptionPane.showInputDialog("Unesi cjeli broj"))
				
		};
		

		int suma=0;
		
		for(int i=0;i<niz.length;i++) {
			suma=niz[0]+niz[1]+niz[2]+niz[3];
		}
			System.out.println(suma);
		}
		
		
		
		
		
		
		
		
	}


