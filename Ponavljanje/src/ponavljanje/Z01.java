package ponavljanje;

import javax.swing.JOptionPane;

public class Z01 {

	public static void main(String[] args) {
		// Za dva unesena cijela broja
		// program ispisuje Osijek
		// ako je zbroj veæi od 10 
		// inaèe ispisuje Edunova
		
		int i=Integer.parseInt(JOptionPane.showInputDialog("x"));
		int j=Integer.parseInt(JOptionPane.showInputDialog("y"));
		
		
		if(i+j>10) {
			System.out.println("Edunova");
		}else {
			System.out.println("Osijek");
		}

	}

}
