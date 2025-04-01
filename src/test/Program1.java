package test;
//Write a java program to reverse a string?
public class Program1 {
	
	public static void main(String[] args) {
		String s="MyJava";
//		char[] str=s.toCharArray();
//		for(int i=str.length-1;i>=0;i--) {
//			System.out.print(str[i]);
//		}
		String revString="";
		for(int i=s.length()-1;i>=0;i--) {
			revString=revString+s.charAt(i);
			
		}
		System.out.println(revString);
	}

}
