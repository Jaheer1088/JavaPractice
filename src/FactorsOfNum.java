import java.util.Scanner;

public class FactorsOfNum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a num to find factors : ");
		int num = sc.nextInt();
		
		int numOfFactors = 0;
		sc.close();
		for(int i = 1;i<=num;i++) {
			
			if(num%i==0) {
				numOfFactors++;
				System.out.println("factors are : " + i+" ");
				
			}
		}
		
		System.out.println("No.of factors are :" + "  "+ numOfFactors);

	}

}
