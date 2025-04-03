package test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//Write a java program to find common elements between two arrays?
public class Program17 {

	public static void main(String[] args) {
		String[] s1= {"one","two","three","four"};
		String [] s2= {"three","two","five","six"};
		Set<String> set=new HashSet<>();
		for(int i=0;i<s1.length;i++) {
			for(int j=0;j<s2.length;j++) {
				if(s1[i].equals(s2[j])) {
					set.add(s1[i]);
				}
			}
		}
		System.out.println(set);
		Integer [] i1= {1,2,3,4,5};
		Integer [] i2= {4,5,6,7,8};
		HashSet<Integer> h1=new HashSet<>(Arrays.asList(i1));
		HashSet<Integer> h2=new HashSet<>(Arrays.asList(i2));
		h1.retainAll(h2);
		System.out.println(h1);
		
	}
}
