package Package2;

import java.util.Scanner;

public class FirstOccuranceInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] x = {1,2,3,5,5,5,9,8};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a num : ");
		int num = sc.nextInt();
		int index=0;
		sc.close();
		boolean validNum = false;
		for(Integer i : x) {
			
			if(i==num) {
				validNum = true;
				break;
			}
			
			index++;
			
		}
		
		if(validNum) {
			System.out.println("Number found at index :" + index);
		}else {
			System.out.println("Num is not present in Array");
		}

	}

}
