package ponavljanje;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class EForPetlja {

	public static void main(String[] args) {
		
		for(int i=0;i<10;i+=1) {
			
			System.out.println("Osijek");
		}

		
		for(int i=0;i<10;i+=1) {
			System.out.println(i+1);
		}
		
		
		for(int i=0;i<10;i++) {
			System.out.println(i);
		}
		
		int[] niz= {2,3,2,3,3,2};
		
		for(int i=0;i<niz.length;i++) {
			System.out.println(niz[i]);
		}
		
		
		
		String ime = "Edunova";
		for(int i=0;i<ime.length();i++) {
			System.out.println(ime.charAt(i));
		}
		
		
		int d=10;
		int[][] tablica=new int[d][d];
		
		for(int i=0;i<d;i++) {
			for(int j=0;j<d;j++){
				tablica[i][j]=(i+1) *(j+1);
			}
		}
		
	for (int i=0;i<d;i++) {
		System.out.println(Arrays.toString(tablica[i]));
	}
	
	
	for(int i=0;i<10;i++) {
		if(i==3 || i==5) {
			continue;
		}
		System.out.println(i);
	}
		
		
	for(int i=0;i<10;i++) {
		if(i!=3 && i!=5) {
			System.out.println(i);
		}
	}
	
	
	for(int i=0;i<10;i++) {
		if(i==4) {
			break;
		}
		System.out.println(i);
	}
	
	int brojac =0;
	int b=25683;
	boolean prim =true;
	
	for(int i=2;i<b;i++) {
		brojac++;
		if(b%1==0) {
			prim=false;
			break;
		}
	}
	
	if(prim) {
		System.out.println(b + " je prim," + brojac);
		
	}else {
		System.out.println(b + " nije prim," + brojac);
	}
	
	
	vanjska:
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				if(j==1){
					break vanjska;
				}
			}
		}
		
		
		System.out.println((100+1)*50);
		int suma=0;
		for(int i=1;i<=100;i++) {
			suma+=i;
		}
		System.out.println(suma);
		
		
		//int i, s=0; for(i=1;i<=100;i++) s+=i;

		// int i, s; for(i=1, s=0;i<=100; s+=i, i++);
//
		// int i=1, s=0; for( ; i<=100; i++){ s+=i; }
//
//		 int i, s=0; for(i=1; ; i++){ if(i<=100) s+=i; else break;}
//
//		 int i, s=0; for(i=1;i<=100;){ s+=i; i++;}
//
//		 int i, s=0; for(i=1; ; ){ if(i<=100) {s+=i; i++;} else break;}
//
//		 int i=1, s=0; for( ; i<=100 ; ){ s+=i; i++;}
//
//		  int i=1, s=0; for( ; ; i++){if(i<=100)  s+=i; else break;}
//
//		 int i=1, s=0; for( ;  ; ){if(i<=100) {s+=i; i++;} else break;} 
//		
//	
		
		
		// beskona�na petlja
		//for(int i=0;i>0;i++) { // OVO NIJE BESKONA�NA PETLJA
			
		//}
		
		suma=0;
		int i=0;
		for(;;) {
			i=Integer.parseInt(JOptionPane
					.showInputDialog("Daj broj"));
			if(i==-1) {
				break;
			}
			suma+=i;
		}
		System.out.println(suma);
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
		
		
	}
	
	
	
	
	

}
