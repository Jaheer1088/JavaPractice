import java.util.Scanner;

public class penultimateWord {

	public static void main(String[] args) {


		System.out.println("Enter a Sentance : ");
		
		Scanner sc = new Scanner(System.in);
		String statement = sc.nextLine();
		
		String [] s = statement.split("\\s");
		
//		if(s.length>1) {
//			System.out.println("Penultimate word is : " + s[s.length-2]);
//		}
//		else {
//			System.out.println("no penultimate word");
//		}
		
	String s1=(s.length>1)? s[s.length-2]:"no penultimate word";

	}

}
