package test;
//How To Reverse Each Word Of A String In Java?
public class Program19 {

	public static void main(String[] args) {
		reverseEachWordInString("Java Concept Of The Day");
	}
	public static void reverseEachWordInString(String input) {
		String[] words=input.split(" ");
		String revreseString="";
		for(int i=0;i<words.length;i++) {
			String word=words[i];
			String reverseWord="";
			for(int j=word.length()-1;j>=0;j--){
				reverseWord=reverseWord+word.charAt(j);
			}
			revreseString=revreseString+reverseWord +" ";
		}
		System.out.println(input);
		System.out.println(revreseString);
		System.out.println("-------------");
	}
}
