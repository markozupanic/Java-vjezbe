package vjezbanje3;

import javax.swing.JOptionPane;

public class Z06 {
	public static void main(String[] args) {

		// Program unosi 2 broja
		// Ako su oba broja parni
		// ispisuje njihov zbroj
		// inaèe ispisuje njihovu razliku
		
		
		
		int i=Integer.parseInt(JOptionPane.showInputDialog("x"));
		int y=Integer.parseInt(JOptionPane.showInputDialog("x"));
		
		if(i%2==0 && y%2==0 ) {
			System.out.println(i+y);
		}else {
			System.out.println(i-y);
		}
		
		
	}

}
