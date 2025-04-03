package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//How To Remove Duplicate Elements From ArrayList In Java?
public class Program14 {

	public static void main(String[] args) {
		ArrayList<String> duplicateList=new ArrayList<String>(Arrays.asList("JAVA","J2EE","PYTHON","JAVA","RUBY"));
		System.out.print("ArrayList with duplicate element :");
		System.out.println(duplicateList);
		
		Set<String> withoutDuplicate =new HashSet<String>(duplicateList);
		System.out.print("ArrayList without duplicate element :");
		System.out.println(withoutDuplicate);
		
	}
}
