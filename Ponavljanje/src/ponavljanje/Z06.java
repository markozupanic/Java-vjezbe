package ponavljanje;

import javax.swing.JOptionPane;

public class Z06 {

	public static void main(String[] args) {
		
		// Program unosi 2 broja
		// Ako su oba broja parni
		// ispisuje njihov zbroj
		// inaèe ispisuje njihovu razliku
		
		int i =Integer.parseInt(JOptionPane.showInputDialog("x"));
		int j =Integer.parseInt(JOptionPane.showInputDialog("y"));
		
		if(i%2==0 && j%2==0) {
			System.out.println(i+j);
		}else {
			System.out.println(i-j);
		}

	}

}
