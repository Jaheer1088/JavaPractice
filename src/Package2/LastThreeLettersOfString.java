package Package2;

import java.util.Scanner;

public class LastThreeLettersOfString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a statement : ");
		String s = sc.nextLine();
		
		int s1=(s.length()-3);
		String lastThreeLetters = s.substring(s1);
		System.out.println(lastThreeLetters);
		
		sc.close();

	}

}
