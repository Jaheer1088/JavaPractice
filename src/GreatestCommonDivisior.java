import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class GreatestCommonDivisior {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first Num: ");
		int firstNum = sc.nextInt();
		
		System.out.println("Enter second Num: ");
		int secondNum = sc.nextInt();
		
		sc.close();
		Set<Integer> factors = new LinkedHashSet<Integer>();
		int gcd=1;
		for(int i =1;i<=firstNum;i++) {
			
			if(firstNum%i==0) {
				factors.add(i);
			}
		}
		
		for(int j =1;j<=secondNum;j++) {
			if(secondNum%j==0) {
				if(!(factors.add(j))){
					gcd=j;
					
				}
			}
		}
		
		System.out.println("GCD is : "+ gcd);
		
	double sqrtOfGCD =	Math.sqrt(gcd);
	System.out.println(sqrtOfGCD);

	}

}
