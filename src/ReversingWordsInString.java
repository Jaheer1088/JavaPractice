
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ReversingWordsInString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a message :");
		String s = sc.nextLine();
		
	String[] s1 =	s.split("\\s");
	
	List<String> li=   Arrays.asList(s1);
	
	Collections.reverse(li);
	
	System.out.print(li);

	}

}
