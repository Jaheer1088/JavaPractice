import java.util.Scanner;

public class AsciiValue {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character : ");
		char c = sc.nextLine().charAt(0);
		sc.close();
		int ch = (int)c;
		System.out.println(ch);

	}

}
