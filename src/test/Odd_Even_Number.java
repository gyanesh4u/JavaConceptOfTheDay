package test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Odd_Even_Number {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

		// using java stream
		Map<Boolean, List<Integer>> oe = list.stream().collect(Collectors.partitioningBy(i -> i % 2 == 0));
		System.out.println("Odd Nuber is " + oe.get(false));
		System.out.println("Even number is " + oe.get(true));
	}
}
