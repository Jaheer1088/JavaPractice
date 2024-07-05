package Package2;

import java.util.Arrays;

public class Swapping1stAndLastEleOfArray {

	public static void main(String[] args) {
		
		int [] x = {1,2,3,4,5}; //output {5,2,3,4,1}
		
		int len = x.length;
		int first = x[0];
		int last = x[len-1];
		
		for(int i = 0;i<=len-1;i++) {
			
			if(x[i]==first) {
				
				x[i]=last;
				
			}
			
		}
		x[len-1]=first;

		System.out.println(Arrays.toString(x));
		
		
		//If array is 1234 we should get 2143 how to do this sir
	}

}
