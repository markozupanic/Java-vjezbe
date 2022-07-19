package vjezbanje;

import javax.swing.JOptionPane;

public class Z02 {

	public static void main(String[] args) {
		// Za uneseni dvoznamenkasti broj
		// ispišite jediniènu vrijednost
		
		
		int i=Integer.parseInt(JOptionPane.showInputDialog("x"));
		
		int rez=i/10;
		
		System.out.println(rez);
		

		int broj=Integer.parseInt(
				JOptionPane.showInputDialog("Unesi dvoznamenskasti broj")
				);
		
		broj%=10;
		
		System.out.println(broj);
		
	}
	
}
