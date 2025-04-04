package Arrays;

public class DuplicateElement {

	public static void findDuplicateElement(int[] array) {
		
		for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				if(array[i]==array[j]) {
					System.out.println("Duplicate Element found :" + array[i]);
					break;
				}
			}
		}
		
	}
	public static void main(String[] args) {
		int[] array= {2,3,4,5,6,5,7,6};
		findDuplicateElement(array);
	}
}
