import java.util.Scanner;

public class Compare2Nnums {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first num :");
	int firstNum =	sc.nextInt();
	System.out.println("enter second num :");
	int secondNum = sc.nextInt();
	
	sc.close();
	
	if(firstNum>secondNum) {
		System.out.println(firstNum+" is greater");
	}else if(firstNum<secondNum) {
		System.out.println(secondNum+" is greater");
	}else {
		System.out.println("both are equal");
	}

	}

}
