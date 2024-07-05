package Package2;

import java.util.Arrays;

public class MovingString1PositionLeft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "google";
		char [] ch = text.toCharArray(); // [g, o, o, g, l, e]  output [o,o,g,l,e,g]
	    String afterRotation=""; 
		char first = ch[0];
		for(int j = 0;j<ch.length-1;j++) {
			ch[j]=ch[j+1];
		}
		
		ch[ch.length-1]=first;
		
		for(Character c:ch) {
			afterRotation+=c;
		}
		
		System.out.println(afterRotation);
	}

}
