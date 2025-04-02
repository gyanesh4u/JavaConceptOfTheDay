package test;
//Write a program to find Armstrong Number
public class Program7 {

	public static boolean isArmstrong(int num) {
		
		int originalNum=num;
		int cube=0;
		while(num>0) {
			int digit=num%10;
			cube=cube+(digit*digit*digit);
			num=num/10;
		}
		if(cube==originalNum) {
			
			 System.out.println(originalNum + " is an Armstrong number");
		return true;
		}
		else 
			System.out.println(originalNum + " is not an Armstrong number");
		return false;
		
		 }
	public static void main(String[] args) {
		isArmstrong(153);
		isArmstrong(111);
	}
	}

