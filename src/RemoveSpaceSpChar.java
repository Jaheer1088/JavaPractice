
public class RemoveSpaceSpChar {

	public static void main(String[] args) {
	
		String s = "82nxgfbh&& (( ert;.";
		
		String newString = s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(newString);
	}

}
