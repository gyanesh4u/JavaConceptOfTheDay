package test;

import java.util.HashMap;
import java.util.Map;

public class Program12 {

	public static void characterCount(String input) {
		Map<Character, Integer> map=new HashMap<Character,Integer>();
		char[] ch= input.toCharArray();
		for(char c:ch) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}
			else {
				map.put(c, 1);
			}
		}
		System.out.println(input+" : "+map);
		
	}
	public static void main(String[] args) {
		characterCount("All is Well");
	}
}
