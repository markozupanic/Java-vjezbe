package ponavljanje;

import javax.swing.JOptionPane;

public class Z02 {

	public static void main(String[] args) {
		// Za upisani cjeli broj
		// program ispisuje da li je 
		// parni broj ili ne
		
		int i=Integer.parseInt(JOptionPane.showInputDialog("x"));
		
		if(i%2==1) {
			System.out.println("neparni");
		}else {
			System.out.println("parni");
		}

	}

}
