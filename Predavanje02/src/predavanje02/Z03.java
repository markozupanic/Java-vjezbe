package predavanje02;

import javax.swing.JOptionPane;

public class Z03 {

	public static void main(String[] args) {
		// Za unesena dva cijela broja
		// ispišite rezutat djeljenja
		
		int prviBroj = Integer.parseInt(
				JOptionPane.showInputDialog("Unesi cijeli broj")
				);
		
		int drugiBroj = Integer.parseInt(
				JOptionPane.showInputDialog("Unesi cijeli broj")
				);
		
		float rez;
		
		rez = (float )prviBroj / drugiBroj;
		
		System.out.println(rez);

	}

}
