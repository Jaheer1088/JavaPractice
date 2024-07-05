import java.util.Arrays;
import java.util.Scanner;

public class AddingElementsToArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter no of digit to put in array : ");
		
		int count = sc.nextInt();
		
		int [] arr = new int[count];
		
		for(int i=0;i<count;i++) {
			
			System.out.println("Enter a num :");
			int num = sc.nextInt();
			
			arr[i]=num;
		}
		
		System.out.println(Arrays.toString(arr));

		sc.close();
	}

}
