package ponavljanje;

import javax.swing.JOptionPane;

public class Z05 {

	public static void main(String[] args) {
		// program unosi broj izmeðu 
		// 1 i 999
		// U sluèaju da je izvan tog raspona
		// ispisati grešku i prekinuti program
		// Program ispisuje 1. znamenku upisanog broja
		
		// -5 greška
		// 1067 greška
		// 456 4
		// 6 6
		// 89 8
		
		
		int i =Integer.parseInt(JOptionPane.showInputDialog("x"));
		
		if(i<0 || i>1000) {
			System.out.println("greska");
		}else if(i<10) {
			System.out.println(i);
		}else if (i>=10 && i<100){
			System.out.println(i/10);
		}else{
			System.out.println(i/100);
		}
		
		
		
	}
}
