package edunova04;

import javax.swing.JOptionPane;

public class Zadatak1 {

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
		
		System.out.println(niz[0]+niz[1]+niz[2]+niz[3]);



	}

}
