package Package2;

public class MovingString3PositionLeft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text = "google";
		char [] ch = text.toCharArray(); // [g, o, o, g, l, e]  output [g,l,e,g,o,o]
	    String afterRotation=""; 
		int len = ch.length;
		
		for(int n=0;n<3;n++) {
			char first = ch[0];
		for(int j = 0;j<ch.length-1;j++) {
			ch[j]=ch[j+1];
		}
		
		ch[len-1] = first;
		
		
		}
			
	
		
		
		for(Character c:ch) {
			afterRotation+=c;
		
		}
		System.out.println(afterRotation);

	}

}
