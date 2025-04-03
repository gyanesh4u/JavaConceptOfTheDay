package test;
//How To Find All Pairs of Elements In An Array Whose Sum Is Equal To A Given Number?
public class Program13 {

	private static void findNumberPair(int[] ar,int sum) {
		System.out.println("Pairs of elements whose sum is "+sum+" are : ");
		for(int i=0;i<ar.length;i++) {
			for(int j=i+1;j<ar.length;j++) {
				if(ar[i]+ar[j]==sum) {
					System.out.println(ar[i]+" + "+ar[j]+" = "+sum);
				}
			}
		}
		
	}
	public static void main(String[] args) {
		findNumberPair(new int[] {4, 6, 5, -10, 8, 5, 20}, 10);
	}
}
