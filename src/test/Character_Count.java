package test;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Character_Count {

	
	public static void main(String[] args) {
		
		String s="java programming";
		
		Map<Character, Long> map=s.chars()
				.mapToObj(c->(char) c)
				.filter(c -> c !=' ')
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(map);
				
	}
}
