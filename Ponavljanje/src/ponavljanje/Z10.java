package ponavljanje;

public class Z10 {

		// Za dani jednodimenzinalni niz
		// cjelih brojeva program ispisuje 
		// najve�i
		
		public static void main(String[] args) {
			
			int[] niz = {5,5,8,6,-6,8,-1,0,9,0};
			// 9
			
			
			int max = Integer.MIN_VALUE;
			for (int a : niz) {
				if (a > max) {
					max = a;
				}

			}

			System.out.println(max);

	}

}
