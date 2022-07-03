package ponavljanje;

import java.util.Arrays;

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
		System.out.println(b+ "je prim," +brojac);
		
	}else {
		System.out.println(b+ "nije prim," +brojac);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
		
		
	}
	
	
	
	
	

}
