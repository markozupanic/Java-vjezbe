package predavanje3;

import javax.swing.JOptionPane;

public class Z06 {
	// Program unosi 2 broja
		// Ako su oba broja parni
		// ispisuje njihov zbroj
		// inaèe ispisuje njihovu razliku
	
	public static void main(String[] args) {
		
		int i = Integer.parseInt(
				JOptionPane.showInputDialog("Unesi broj")
				);
		
		int j = Integer.parseInt(
				JOptionPane.showInputDialog("Unesi broj")
				);
		
		if(i%2==0 && j%2==0) {
			System.out.println(i+j);
		}else {
			System.out.println(i-j);
		}
		
		
	}
}
