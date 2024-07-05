package Package2;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number :  ");
		int num = sc.nextInt();
		sc.close();
		
		boolean isPrime = true;
		if(num>1) {
			
			for(int i=2;i<num;i++) {
				
				if(num%i==0) {
					isPrime = false;
				}
				
			}
			
		}
		
	String s =	(isPrime)?"Prime num":"not a prime num";
	System.out.println(s);

	}
}
