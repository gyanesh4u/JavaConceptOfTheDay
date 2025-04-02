package test;

//How To Check The Equality Of Two Arrays In Java?
public class Program5 {


	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5};
		int b[]= {1,2,3,4,5};
		
		boolean equalOrNot=true;
		
		if(a.length==b.length) {
			for(int i=0;i<a.length;i++) {
				if( a[i]!=b[i]) {
					equalOrNot=false;
				}
			}
		}
		else {
			equalOrNot=false;
			
		}
		if(equalOrNot) {
			System.out.println("Two Arrays are equal");
		}
		else {
			System.out.println("Two Arrays are not equal");
		}
		//System.out.println(Arrays.equals(a, b));
	}
}
