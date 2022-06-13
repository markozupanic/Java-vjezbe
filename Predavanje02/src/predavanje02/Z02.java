package predavanje02;

import javax.swing.JOptionPane;

public class Z02 {

	public static void main(String[] args) {
		
		// Za uneseni dvoznamenkasti broj
				// ispišite jediniènu vrijednost
		
		int broj=Integer.parseInt(
				JOptionPane.showInputDialog("Unesi dvoznamenskasti broj")
				);
		
		broj%=10;
		
		System.out.println(broj);
		
		
		
	}
	
}
