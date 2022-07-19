package vjezbanje;

import javax.swing.JOptionPane;

public class Z02 {

	public static void main(String[] args) {
		// Za uneseni dvoznamenkasti broj
		// ispišite jediniènu vrijednost
		
		
		int i=Integer.parseInt(JOptionPane.showInputDialog("x"));
		
		i%=10;
		
		System.out.println(i);
		

		
	}
	
}
