package Package2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class RemovingDuplicateEleInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String : ");
	char [] c =	sc.nextLine().toCharArray();
	sc.close();
	String afterDulicateRemoval="";
	Set<Character> ch = new LinkedHashSet<Character>();
	
	for(Character c1 : c) {
		ch.add(c1);
	}
    for(Character ch1 : ch) {
    	
    	afterDulicateRemoval+=ch1;
    }
	 
    System.out.println(afterDulicateRemoval);
	}

}
