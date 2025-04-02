package test;

import java.util.Scanner;

public class Program2 {
//Write java program to create pyramid of numbers like in Pattern1 of the above image
//	 	1 
//     2 2 
//    3 3 3 
//   4 4 4 4 
//  5 5 5 5 5 
// 6 6 6 6 6 6 

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("How Many Rows You Want In Your Pyramid?");
		int noOfRows=sc.nextInt();
		int rowCount=1;
		System.out.println("Here is your Pyramid");
		for(int i=noOfRows;i>0;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=rowCount;j++) {
				System.out.print(rowCount+" ");
			}
			System.out.println();
			rowCount++;
			sc.close();
		}
		
	}
}
