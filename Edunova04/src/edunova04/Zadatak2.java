package edunova04;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Zadatak2 {

	public static void main(String[] args) {
		// Program unosi jedan cijeli broj
		// izme�u 10 i 20. U slu�aju da broj
		// nije u tom rasponu program se zavr�ava
		// Program ispisuje tablicu mno�enja lijepo formatiranu
		
		int i =Integer.parseInt(JOptionPane.showInputDialog("Unesi broj izme�u 10 i 20"));
		
		 int tableSize = i;
		 ispisiTablicu(tableSize);
	        
	        if (i<10 || i>20) {
	        	System.out.println("krivi unos broja");
	        	
	        	
	        }

	}


	

	private static void ispisiTablicu(int tableSize) {
		
		System.out.format("   ");
		for(int i=1;i<=tableSize;i++) {
			System.out.format("%4d", i);
		}
		System.out.println();
		System.out.println("-------------------------------------------------------------------------------");
		
		for(int i=1;i<=tableSize;i++) {
			System.out.format("%4d |", i);
			for (int j=1;j<=tableSize;j++) {
				System.out.format("%4d", i*j);
			}
			System.out.println();
		}
	}

	
		
	

	
}

//https://www.quickprogrammingtips.com/java/creating-multiplication-table-in-java.html
