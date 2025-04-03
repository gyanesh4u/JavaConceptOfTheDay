package test;

import java.util.Scanner;

public class CheckMobileNumber {
	
		public static void main(String[] args) {
			System.out.println("Enter your Mobile Number");
			Scanner scanner=new Scanner(System.in);
			String input =scanner.next();
			if(Program18.isNumberOrNot(input)&&(input.length()==10)) {

	            System.out.println("Good!!! You have entered valid mobile number");
			}
			else {

	            System.out.println("Sorry!!!! You have entered invalid mobile number. Try again..");
			}
			scanner.close();
		}
	}


