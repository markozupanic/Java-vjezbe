package edunova04;

public class E05InkrementDekrement {

	public static void main(String[] args) {
int i=1;
		
		System.out.println(i++); //1 Varijabla se prvo koristi pa se uve�ava
		System.out.println(i); // 2
		System.out.println(++i); // 3 prvo uve�a pa koristi
	
		System.out.println(i--); // 3 umanji za 1 pa je vrijednost 2
		System.out.println(--i); // umanji za 1 pa ispi�e 1
	
		int t=2, k=7;
		
		t += ++t -k--; // 3 - 7 = -4, t = -2, k = 6
		System.out.println("t=" + t + ", k=" + k);
		k=t++; // k = -2, t = -1
		System.out.println("t=" + t + ", k=" + k);
		System.out.println(k+t);

	}

}
