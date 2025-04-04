package Arrays;

import java.util.Arrays;

public class SecondLargestNumber {
	
	public static int findSecondLargest(int[] arr,int total) {
		Arrays.sort(arr);
		return arr[total-2];
	}
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6};
		int b[]= {12,33,535,4234,34325523};
		
		System.out.println("Second Largest " + findSecondLargest(a, 6));
		System.out.println("Second Largest " + findSecondLargest(b, 5));
	}

}
