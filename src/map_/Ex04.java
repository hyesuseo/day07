package map_;

import java.util.HashMap;

public class Ex04 {

	public static void main(String[] args) {
		
		HashMap<String, Integer> a = new HashMap<String, Integer>();
		a.put("one", 1);
		a.put("two", 2);
		a.put("three", 3);
		a.put("four", 4);
		
		System.out.println(a.get("one"));
		System.out.println(a.get("two"));
		
		
	}

}
