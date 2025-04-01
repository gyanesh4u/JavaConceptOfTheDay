package test;

import java.util.Arrays;

//Anagram Program In Java
public class Program6 {

	
	public static boolean isAnagaram(String str1,String str2) {
		if(str1.length()!=str2.length()) {
			return false;
		}
		char[] ch1=str1.toCharArray();
		char[] ch2=str2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		return Arrays.equals(ch1, ch2);
	}
	public static void main(String[] args) {
		System.out.println(isAnagaram("keep", "peek"));
	}
}
