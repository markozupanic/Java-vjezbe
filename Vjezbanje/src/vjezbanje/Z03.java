package vjezbanje;

import javax.swing.JOptionPane;

public class Z03 {
	public static void main(String[] args) {
		// Za unesena dva cijela broja
		// ispišite rezutat djeljenja
		
		int i=Integer.parseInt(JOptionPane.showInputDialog("x"));
		int y=Integer.parseInt(JOptionPane.showInputDialog("x"));
		

		float rez= (float )i / y;
		
		System.out.println(rez);
		
		
	}

}
