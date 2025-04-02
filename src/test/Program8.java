package test;


import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

//How To Find Duplicates In Array In Java?
public class Program8 {

	public static void findDuplicateUsingMap(int [] ip) {
		Map<Integer, Integer> map=new HashMap<Integer,Integer>();
		for(int i:ip) {
			if(map.containsKey(i)) {
				map.put(i, map.get(i)+1);
			}
			else {
				map.put(i, 1);
			}
		}
		Set<Entry<Integer, Integer>> entrySet =map.entrySet();
		for(Entry<Integer, Integer> entry:entrySet) {
			if(entry.getValue()>1) {
				System.out.println("Duplicate Element " + entry.getKey()+ "  found "+entry.getValue());
			}
		}
	}
	public static void findDuplicateByStreams(int[] ip) {
		Set<Integer> uniqueElement=new HashSet<>();
		Set<Integer> duplicateElement =Arrays.stream(ip)
										.filter(i ->!uniqueElement.add(i))
										.boxed()
										.collect(Collectors.toSet());
		System.out.println(duplicateElement);
	}
	public static void main(String[] args) {
		int[] ip=new int[]{1,1,2,2,2,3,4};
		findDuplicateUsingMap(ip);
		findDuplicateByStreams(ip);
	}
}
