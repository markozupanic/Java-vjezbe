package edunova;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Z03 {

	public static void main(String[] args) {
		// Korisnik unosi dimenzije 
		// matrice (x i y)
		// program puni matricu sluèajnim 
		// vrijednostima izmeðu 5 i 9
		// program ispisuje izgraðenu matricu
		
		int x=Integer.parseInt(JOptionPane.showInputDialog("x"));
		int y=Integer.parseInt(JOptionPane.showInputDialog("y"));
		int [][] matrica=new int[x][y];
		int i=0;
		
		while(i<matrica.length) {
			
			if(i>=5 && i<=9) {
				i=(int)(Math.random()*100);
				System.out.printf("4%d",(x+1)*(y+1));
		}

			System.out.println();
	}

}
}
