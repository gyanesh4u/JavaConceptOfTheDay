package test;

public class Program16 {

	public static void main(String[] args) {
		String s1="JavaJ2eeStrutsHibernate";
		String s2="StrutsHibernateJavaJ2ee";
		
		if(s1.length()!=s2.length()) {
			System.out.println("s2 is not rotated version of s1");
		}
		else {
			String s3=s1+s2;
			if(s3.contains(s2)) {
				System.out.println("s2 is rotated version of s1");
			}
			else {
				System.out.println("s2 is not rotated version of s1");
			}
		}
	}
}
