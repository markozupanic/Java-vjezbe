package edunova04;

import javax.swing.JOptionPane;

public class E03ViseDimenzionalniNizovi {

	public static void main(String[] args) {
		
		
		int[][] matrica= new int[10][10];
		
		matrica[9][9]=7;
		
		
		
		int[][] tablica = {
				{1,0,0},
				{0,1,0},
				{0,0,1}
		};
		
		
		
		
		int [][][] kocka=new int[10][10][10];
		
		// Program unosi jedan cijeli broj
				// izme�u 10 i 20. U slu�aju da broj
				// nije u tom rasponu program se zavr�ava
				// Program ispisuje tablicu mno�enja lijepo formatiranu
//				 	 1   2   3   4   5   6   7   8   9   10
//					 2   4   6   8  10  12  14  16  18   20
//					 3   6   9  12  15  18  21  24  27   30
//					 4   8  12  16  20  24  28  32  36   40
//					 5  10  15  20  25  30  35  40  45   50
//					 6  12  18  24  30  36  42  48  54   60
//					 7  14  21  28  35  42  49  56  63   70
//					 8  16  24  32  40  48  56  64  72   80
//					 9  18  27  36  45  54  63  72  81   90
//					10  20  30  40  50  60  70  80  90  100

				int b = Integer.parseInt(JOptionPane.showInputDialog("Upi�i broj izme�u 10 i 20"));
				if (b >= 10 && b <= 20) {

					//int[][] tablica = new int[b][b];
					for (int i = 0; i < b; i++) {
						for (int j = 0; j < b; j++) {
						//	tablica[i][j] = (i + 1) * (j + 1);
							System.out.printf("%5d",(i+1)*(j+1));
						}
						System.out.println(" ");
						}
					
				} else {
					System.out.println("Gre�ka!");
				}
		
		
		
		
		
		

	}

}
