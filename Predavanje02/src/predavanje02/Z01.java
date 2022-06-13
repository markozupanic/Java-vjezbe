package predavanje02;

import javax.swing.JOptionPane;

public class Z01 {

	public static void main(String[] args) {
		// Napisati program koji unosi
		// tri decimalna broja
		// i ispisuje umnožak prvog i treæeg
		// umanjeno za drugi broj
		
		double prviBroj = Double.parseDouble(
				JOptionPane.showInputDialog("Unesi prvi broj")
				);
		double drugiBroj = Double.parseDouble(
				JOptionPane.showInputDialog("Unesi drugi broj")
				);
		
		double treciBroj = Double.parseDouble(
				JOptionPane.showInputDialog("Unesi treci broj")
				);
		
		double rez = prviBroj * treciBroj + drugiBroj;
		
		System.out.println(rez);
		

	}

}
