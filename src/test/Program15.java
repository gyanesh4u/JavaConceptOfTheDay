package test;
//Java Program To Check Whether The Given Number Is Binary Or Not :
public class Program15 {

	public static void isBinary(int number) {
		boolean isBinary=true;
		int copyOfNumber=number;
		while(copyOfNumber!=0) {
			int temp=copyOfNumber%10; //gives last digit of number
			if(temp>1) {
				isBinary=false;
				break;
				
			}
			else {
				copyOfNumber=copyOfNumber/10;
				
			}
		}
		if (isBinary) {
			System.out.println(number +" is binary number");
			
		}
		else {
			System.out.println(number +" is not binary number");
		}
	}
	public static void main(String[] args) {
		isBinary(123456789);
		isBinary(10101010);
	}
}
