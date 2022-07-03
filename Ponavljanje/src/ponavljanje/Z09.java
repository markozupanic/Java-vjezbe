package ponavljanje;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Z09 {

	public static void main(String[] args) {
		// Program unosi jedan cijeli broj
		// izmeðu 10 i 20. U sluèaju da broj
		// nije u tom rasponu program se završava
		// Program ispisuje tablicu množenja lijepo formatiranu
//		 	 1   2   3   4   5   6   7   8   9   10
//			 2   4   6   8  10  12  14  16  18   20
//			 3   6   9  12  15  18  21  24  27   30
//			 4   8  12  16  20  24  28  32  36   40
//			 5  10  15  20  25  30  35  40  45   50
//			 6  12  18  24  30  36  42  48  54   60
//			 7  14  21  28  35  42  49  56  63   70
//			 8  16  24  32  40  48  56  64  72   80
//			 9  18  27  36  45  54  63  72  81   90
//			10  20  30  40  50  60  70  80  90  100
		
		
		int t=Integer.parseInt(JOptionPane.showInputDialog("Unesi cjeli broj"));
		
		int[][] tablica =new int [t][t];
		
		if(t<=10 || t>=20) {
			System.out.println("Krivi unos");
			System.exit(t);
		}
		
		for(int i=0;i<t;i++) {
			for(int j=0;j<t;j++) {
				System.out.printf("%5d", (i+1)*(j+1));
				
			}
			System.out.println();
		}
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
