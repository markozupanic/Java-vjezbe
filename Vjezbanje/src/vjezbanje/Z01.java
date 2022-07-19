package vjezbanje;

import javax.swing.JOptionPane;

public class Z01 {
	// Napisati program koji unosi
		// tri decimalna broja
		// i ispisuje umnožak prvog i treæeg
		// umanjeno za drugi broj
	
	public static void main(String[] args) {
		Double i=Double.parseDouble(JOptionPane.showInputDialog("x"));
		Double x=Double.parseDouble(JOptionPane.showInputDialog("x"));
		Double y=Double.parseDouble(JOptionPane.showInputDialog("x"));
		
		
		double rez= i*y-x;
		System.out.println(rez);
		

	}
	
	

}
