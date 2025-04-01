package test;
//Java White Spaces Removal Program 
public class Program3 {

	public static void main(String[] args) {
		String s="I Love Java ";
		String withoutSpace=s.replaceAll("\\s", "");
		System.out.println(withoutSpace);
		
	}
}
