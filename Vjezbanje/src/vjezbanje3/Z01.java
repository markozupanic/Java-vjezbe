package vjezbanje3;

import javax.swing.JOptionPane;

public class Z01 {
	
	public static void main(String[] args) {

		// Za dva unesena cijela broja
		// program ispisuje Osijek
		// ako je zbroj veæi od 10 
		// inaèe ispisuje Edunova
		
		int i=Integer.parseInt(JOptionPane.showInputDialog("x"));
		int y=Integer.parseInt(JOptionPane.showInputDialog("x"));
		
		if(i+y<10) {
			System.out.println("Osijek");
		}else {
			System.out.println("Edunova");
		}
		
		
		
		
		
		
		
		
	}

}
