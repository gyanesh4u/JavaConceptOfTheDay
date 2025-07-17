package test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Remove_Duplicate_Element {
	
	public static void main(String[] args) {
		List<String> list=Arrays.asList("Java","Selenium","Java","Ruby");
		List<String> removedDuplicate = list.stream().distinct().collect(Collectors.toList());
		System.out.println(removedDuplicate);
		
	}

	
	
}
