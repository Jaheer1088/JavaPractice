import java.util.LinkedList;
import java.util.List;

public class StringReverse1By1 {

	public static void main(String[] args) {
		String s1 = "Java is good";
		String[] s2 = s1.split("\\s");
		String s3="";
		for(String s : s2) {
			
			for(int i = s.length()-1;i>=0;i--) {
				
				s3+=s.charAt(i);
				
				
			}
			
			System.out.print(s3+" ");
			s3="";
		}
		
		
		String version = System.getProperty("java.version");
		System.out.println(version);
		

	}

}
