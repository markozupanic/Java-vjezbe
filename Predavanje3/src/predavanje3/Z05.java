package predavanje3;

import javax.swing.JOptionPane;

public class Z05 {
	// program unosi broj izme�u 
		// 1 i 999
		// U slu�aju da je izvan tog raspona
		// ispisati gre�ku i prekinuti program
		// Program ispisuje 1. znamenku upisanog broja
		
		// -5 gre�ka
		// 1067 gre�ka
		// 456 4
		// 6 6
		// 89 8
	public static void main(String[] args) {
		
		
		int i =Integer.parseInt(
				JOptionPane.showInputDialog("Unesi broj")
				);
		
		if (i<0 || i>1000) {
			System.out.println("greska");
		}else if (i<10) {
			System.out.println(i);
		}else if (i>=10 && i<100) {
			System.out.println(i/10);
		}else {
			System.out.println(i/100);
		}
		

	}

}
