package Package2;

import java.util.Arrays;

public class MultiplyCorrespondingArrayValues {

	public static void main(String[] args) {
		
		int [] x = {1,2,3,4,5};
		int [] y = {5,4,3,2,1}; //output {1*5,2*4,3*3,4*2,5*1}
		                            //{5,8,9,8,5}
		int [] z =new int[x.length];
		
		for(int i =0;i<x.length;i++) {
			
			z[i]=x[i]*y[i];
		}

		System.out.println(Arrays.toString(z));
	}

}
