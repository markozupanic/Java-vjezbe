package ciklicnatablica;

import javax.swing.JOptionPane;

public class CiklicnaTablica {
	
	
	public static void main(String[] args) {
		
		int red=Integer.parseInt(JOptionPane.showInputDialog("Unesi broj"));
		int stupac=Integer.parseInt(JOptionPane.showInputDialog("Unesi broj"));
		
		
		int[][] tablica=new int[red][stupac];
		
		
		int pocetniRed=red;
		int prviDesniStupac=stupac-1;
		
		
		
		
		
		for(int i=0;i<pocetniRed;i++) {
			System.out.printf("%5d", (i+1));
		}
		
		for(int j=0;j<prviDesniStupac;j++) {
			System.out.printf("%4d",(j+1));
		
		System.out.println();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			/*for(int i=0;i<red;i++) {
				for(int j=0;j<stupac;j++) {
					System.out.printf("%5d", (i+1)*(j+1));
					
				}
				System.out.println();
		}
		*/
		
		
	}

	}
}
