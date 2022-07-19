package vjezbanje3;

import javax.swing.JOptionPane;

public class Z03 {

	public static void main(String[] args) {
		// Za unesena dva cjela broj
		// program ispisuje najveæi
		
		
		int i=Integer.parseInt(JOptionPane.showInputDialog("x"));
		int y=Integer.parseInt(JOptionPane.showInputDialog("x"));
		
		
		if(i<y) {
			System.out.println(y);
		}else {
			System.out.println(i);
		}
		
		
	}
}
