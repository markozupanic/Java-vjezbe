package vjezbanje3;

import javax.swing.JOptionPane;

public class Z04 {
	
	public static void main(String[] args) {
		// Za upisana 3 cijela broja
		// program ispisuje najveæi
		
		int i=Integer.parseInt(JOptionPane.showInputDialog("x"));
		int y=Integer.parseInt(JOptionPane.showInputDialog("x"));
		int x=Integer.parseInt(JOptionPane.showInputDialog("x"));
		
		if(i>y && i>x) {
			System.out.println(i);
		}else if(y>i && y>x) {
			System.out.println(y);
		}else {
			System.out.println(x);
		}
		
		
		
	}

}
