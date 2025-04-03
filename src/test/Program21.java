package test;

import java.text.DecimalFormat;

/*Java Program To Find The Percentage Of Uppercase Letters, Lowercase 
Letters, Digits And Other Special Characters In A String :*/
public class Program21 {
	
	public static void characterPercentage(String ip) {
		int totalChar=ip.length();
		int upperCase=0;
		int lowerCase=0;
		int digit=0;
		int others=0;
		
		for(int i=0;i<totalChar;i++) {
			char ch=ip.charAt(i);
			
			if(Character.isUpperCase(ch)) {
				upperCase++;
			}
			else if(Character.isLowerCase(ch)) {
				lowerCase++;
			
			}
			else if(Character.isDigit(ch)) {
				digit++;
			}
			else {
				others++;
			}
		}
		double upperCasePercentage=(upperCase*100.0)/totalChar;
		double lowerCasePercentage=(lowerCase*100.0)/totalChar;
		double digitPercentage=(digit*100.0)/totalChar;
		double otherPercentage=(others*100.0)/totalChar;
		
		
		DecimalFormat dFormat=new DecimalFormat("##.##");
		 System.out.println("In '"+ip+"' : ");
         
	        System.out.println("Uppercase letters are "+dFormat.format(upperCasePercentage)+"% ");
	         
	        System.out.println("Lowercase letters are "+dFormat.format(lowerCasePercentage)+"%");
	         
	        System.out.println("Digits Are "+dFormat.format(digitPercentage)+"%");
	         
	        System.out.println("Other Characters Are "+dFormat.format(otherPercentage)+"%");
	         
	        System.out.println("-----------------------------");
	}
	public static void main(String[] args) {
		characterPercentage("Tiger Runs @ The Speed Of 100 km/hour.");
        
        characterPercentage("My e-mail : eMail_Address321@anymail.com");
         
        characterPercentage("AUS : 123/3, 21.2 Overs");
	}
	

}
