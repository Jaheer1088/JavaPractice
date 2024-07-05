package Package2;

import java.util.Arrays;

public class RightRotateArrayBy3Ele {

	public static void main(String[] args) {
		
		int [] x = {1,2,3,4,5};
		
		int len = x.length;
		int last = x[len-1];
		
		for(int n=1;n<=3;n++) {
			
		
		for(int i =len-1;i>0;i--) {
			
			x[i] = x[i-1];
			
			
		}
		x[0]=last;
		last--;
		}
		
		
		System.out.println(Arrays.toString(x));

	}

}
