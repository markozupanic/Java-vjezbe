package predavanje02;

import javax.swing.JOptionPane;

public class Z02 {

	public static void main(String[] args) {
		
		// Za uneseni dvoznamenkasti broj
				// ispi�ite jedini�nu vrijednost
		
		int broj=Integer.parseInt(
				JOptionPane.showInputDialog("Unesi dvoznamenskasti broj")
				);
		
		broj%=10;
		
		System.out.println(broj);
		
		
		
	}
	
}
