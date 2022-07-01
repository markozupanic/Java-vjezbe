package ponavljanje;

import javax.swing.JOptionPane;

public class Z03 {

	public static void main(String[] args) {
		// Za unesena dva cjela broj
		// program ispisuje najveæi
		
		int i=Integer.parseInt(JOptionPane.showInputDialog("x"));
		int j=Integer.parseInt(JOptionPane.showInputDialog("y"));
		
		if(i>j) {
			System.out.println(i);
		}else {
			System.out.println(j);
		}
	}

}
