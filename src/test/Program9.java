package test;
//Java Program To Find The Sum Of All Digits Of A Number In Java :
public class Program9 {

	public static void sumOfAllNumber(int ip) {
		int copyOfNumber=ip;
		int sum=0;
		while(copyOfNumber!=0) {
			int lastDigit=copyOfNumber%10;
			sum=sum+lastDigit;
			copyOfNumber=copyOfNumber/10;
		}
		System.out.println("Sum Of All Digits In "+ip+" = "+sum);
	}
	public static void main(String[] args) {
		sumOfAllNumber(12345);
		sumOfAllNumber(47862);
	}
}
