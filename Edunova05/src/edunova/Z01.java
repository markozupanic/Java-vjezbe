package edunova;

public class Z01 {

	public static void main(String[] args) {

		// Deklarirajte niz decimalnih
		// brojeva du�ine 12 i svim elementima
		// niza postavite vrijednost 3,14
		// s while petljom
		
		
		double [] niz=new double[12];
		int i=0;
		while(i<niz.length) {
			niz[i]=3.14;
			System.out.println(niz[i]);
			
			++i;
		}

	}

}
