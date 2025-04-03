package test;

import java.util.Arrays;

//How To Move Zeros To End Of An Array?
public class Program20 {
	public static void moveZeroToEnd(int input[]) {
		int counter=0;
		for(int i=0;i<input.length;i++) {
			if(input[i]!=0) {
				input[counter]=input[i];
				counter++;
			}
		}
		while(counter<input.length) {
			input[counter]=0;
			counter++;
		}
		System.out.println(Arrays.toString(input));
	}
	public static void main(String[] args) {
	    moveZeroToEnd(new int[] {12, 0, 7, 0, 8, 0, 3});
	    
        moveZeroToEnd(new int[] {1, -5, 0, 0, 8, 0, 1});
 
        moveZeroToEnd(new int[] {0, 1, 0, 1, -5, 0, 4});
 
        moveZeroToEnd(new int[] {-4, 1, 0, 0, 2, 21, 4});
	}

}
