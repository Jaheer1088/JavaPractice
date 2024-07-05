import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class OccuranceInString {

	public static void main(String[] args) {
		
		String s1 = "god";
		String s = s1.replaceAll("\\s", "");
		char [] c = s.toCharArray();
		int count = 1;
		
		Map<Character, Integer> m = new HashMap<Character, Integer>();
		
		for(char c1 : c) {
			if(!(m.containsKey(c1))) {
				
				m.put(c1, count);
				
			}else {
				
				m.put(c1, (m.get(c1)+1));
				
			}
			
		}
		
	Set<Character> set =	m.keySet();
	
	for(Character ch : set) {
		if(m.get(ch)>1) {
			System.out.println(ch + " " + m.get(ch));
		}
	}
		
		
		
		
		
		
		

	}

}
