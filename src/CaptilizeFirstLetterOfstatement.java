import java.util.Scanner;

public class CaptilizeFirstLetterOfstatement {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a statement :" );
		
		String statement = sc.nextLine();
		sc.close();
		String newStatement = "";
	String [] splitStatement =	statement.split("\\s");
	
	for(String s : splitStatement) {
		

			char capital =	Character.toUpperCase(s.charAt(0));
			
			String sub = s.substring(1);
			newStatement = capital+sub;
			
			System.out.print(newStatement+" ");
			newStatement = "";
			
		
	}

	}

}
