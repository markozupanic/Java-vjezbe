package edunova04;

import java.util.Arrays;

public class E01JednodimenzionalniNizovi {

	public static void main(String[] args) {
		
		// sinonimi
				//Array na eng.
				// nizovi ili polja na hr.
				// mi æemo koristiti nizovi
		
		int t1=2;
		int t2=-1;
		//...
		int t12=6;
		
		//ovo nije dobar naèin za pohranu 
				// više vrijednosti istog tipa
		
		
		int [] temp;
		
		temp = new int[12];
		
		temp[0]=2;
		temp[1]=-1;
		
		temp[temp.length-1]=6;
		
		System.out.println(Arrays.toString(temp));
		
		int boje[]=new int[4];
		
		boje[1]=7;
		System.out.println(boje[1]);
		
		int[] vrijednost = {2,3,3,2,3,8,5,6,7,5,5};
		
		System.out.println(vrijednost[0] + "," +
		vrijednost[vrijednost.length-1]);
		
		System.out.print(vrijednost[0]);
		System.out.print(",");
		System.out.print(vrijednost[vrijednost.length-1]);
		System.out.println();
		
		
		
		double[] brojevi= new double[5];
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
