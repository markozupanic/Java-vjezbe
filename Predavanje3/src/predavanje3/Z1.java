package predavanje3;

import javax.swing.JOptionPane;

public class Z1 {
	public static void main(String[] args) {
		// Za dva unesena cijela broja
		// program ispisuje Osijek
		// ako je zbroj veæi od 10 
		// inaèe ispisuje Edunova
		
		
		int i=Integer.parseInt(
				JOptionPane.showInputDialog("Unesi cijeli broj")
				);
		
		int j=Integer.parseInt(
				JOptionPane.showInputDialog("Unesi cijeli broj")
				);
		
		if(i+j<10) {
			System.out.println("Osijek");
		}else {
			System.out.println("Eduova");
		}
		
		
		
		
		
		
		
		
		
		

	}


}
