package Package2;

import java.util.Arrays;

public class LeftRotateArrayBy1Ele {

	public static void main(String[] args) {
		
		int [] x = {1,2,3,4,5}; //output [2,3,4,5,1]
		
		int len = x.length;
		int first = x[0];
		
		for(int i = 0;i<len-1;i++) {
			x[i]=x[i+1];
		}
		
		x[len-1]=first;
		System.out.println(Arrays.toString(x));

	}

}
