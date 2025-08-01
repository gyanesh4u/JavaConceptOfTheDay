package test;

public class ReplaceCharacter {

	public static void main(String[] args) {
		
		
		String s="abcde";
		
		//char[] ch = s.toCharArray();
		
		String replacedString = s.replace("a", "@");
		
		System.out.println(replacedString);
	}
}
