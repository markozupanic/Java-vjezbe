package ponavljanje;

import javax.swing.JOptionPane;

public class Z07 {

	public static void main(String[] args) {
		// Deklarirajte niz od 4 cijela broja,
				// u niz uèitajte vrijednosti od korisnika
				// ispišite sumu svih upisanih vrijednosti

				
				//int[] iz= new int[4];
				//niz[0]= Integer.parseInt(JOptionPane.showInputDialog("x"));
				//niz[1]= Integer.parseInt(JOptionPane.showInputDialog("y"));
				//niz[2]= Integer.parseInt(JOptionPane.showInputDialog("z"));
				//niz[niz.length-1]= Integer.parseInt(JOptionPane.showInputDialog("t"));
				//System.out.println(niz[0] + niz[1] + niz[2] + niz[niz.length-1]);
			
			
			
		int niz[] = {
						
						Integer.parseInt(JOptionPane.showInputDialog("Unesi cjeli broj")),
						Integer.parseInt(JOptionPane.showInputDialog("Unesi cjeli broj")),
						Integer.parseInt(JOptionPane.showInputDialog("Unesi cjeli broj")),
						Integer.parseInt(JOptionPane.showInputDialog("Unesi cjeli broj"))
						
				};
				
				System.out.println(niz[0]+niz[1]+niz[2]+niz[3]);
	}

}
