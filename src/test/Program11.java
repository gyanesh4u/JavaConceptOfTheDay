package test;

import java.util.Scanner;

public class Program11 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter number of rows");
		
		int row=scanner.nextInt();
		
		System.out.println("Enter number of columns");
		int column=scanner.nextInt();
		
		int[][] matrix=new int[row][column];
		System.out.println("Enter matrix data");
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				matrix[i][j]=scanner.nextInt();
			}
		}
		System.out.println("Your Matrix is : ");
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				System.out.print(matrix[i][j]+"\t");
			}
			System.out.println();
		}
		scanner.close();
	}
	
}
