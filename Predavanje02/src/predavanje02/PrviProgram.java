package predavanje02;

import javax.swing.JOptionPane;


public class PrviProgram {

	public static void main(String[] args) {
		String unosOdKorisnika = JOptionPane.showInputDialog("Unesi broj");

		int b = Integer.parseInt(unosOdKorisnika);

		System.out.println(b);


	}

}
