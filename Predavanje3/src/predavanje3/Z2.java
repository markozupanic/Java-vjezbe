package predavanje3;

import javax.swing.JOptionPane;

public class Z2 {
	// Za upisani cjeli broj
		// program ispisuje da li je 
		// parni broj ili ne
	public static void main(String[] args) {
		int i = Integer.parseInt(
				JOptionPane.showInputDialog("Unesi broj")
				);
		
	 	if(i%2==1) {
	 		
	 		System.out.println("neparani");
	 	}else {
	 		System.out.println("parni");
	 	}
		
		
		
		
		
	}
}
