package test;

import java.util.HashMap;
import java.util.Set;

//How To Find Duplicate Characters In A String In Java?
public class Program4 {
	
	public static void duplicateCharacterCount(String ip) {
		HashMap<Character, Integer> map=new HashMap<Character,Integer>();
		char[] ch=ip.toCharArray();
		for(char c:ch) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}
			else {
				map.put(c, 1);
			}
		}
		Set<Character> set=map.keySet();
		System.out.println("Duplicate Character in String is " +ip);
		for(Character s:set) {
			if(map.get(s)>1) {
			System.out.println(s+":"+map.get(s));
		}
	}
	}
	public static void main(String[] args) {
		duplicateCharacterCount("JavaJ2EE");
	}
}
