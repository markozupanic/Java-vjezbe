package ponavljanje;

import javax.swing.JOptionPane;

public class Z04 {

	public static void main(String[] args) {
		// Za upisana 3 cijela broja
		// program ispisuje najveæi
		
		int i=Integer.parseInt(JOptionPane.showInputDialog("x"));
		int j=Integer.parseInt(JOptionPane.showInputDialog("y"));
		int k=Integer.parseInt(JOptionPane.showInputDialog("z"));
		
		if(i>j || i>k) {
			System.out.println(i);
		}else if(j>i || j>k) {
			System.out.println(j);
		}else {
			System.out.println(k);
		}
		
	}
}
