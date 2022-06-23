package edunova04;

public class VjezbeIncrementDecrement {
	
	public static void main(String[] args) {
		
		
		int t=2,k=1;
		
		t += ++t -k--;  // 3-1=2    t=4 ,k=0
		k=t++;  // k=4    t=5   
		System.out.println("t=" + t + ", k=" + k);
		System.out.println("t=" + t + ", k=" + k);
		System.out.println(k+t);
         
        //int t=2, k=7;
		
		//t += ++t -k--; // 3 - 7 = -4, t = -2, k = 6
		//System.out.println("t=" + t + ", k=" + k);
		//k=t++; // k = -2, t = -1
		//System.out.println("t=" + t + ", k=" + k);
		//System.out.println(k+t);
		

}
}