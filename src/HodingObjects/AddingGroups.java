package HodingObjects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class AddingGroups {

	public static void main(String[] args) {
		Collection<Integer> collection = new ArrayList<Integer>(Arrays.asList(1,2,3,4));
		Integer[] moreIntegers = {5,6,7,8,9};
		collection.addAll(Arrays.asList(moreIntegers));
		
		for(Integer i:collection){
			System.out.println(i);
		}
		
		System.out.println("/////");
		
		Collections.addAll(collection, 11,12,13,14);
		for(Integer i:collection){
			System.out.println(i);
		}
		System.out.println("/////");
		
		Collections.addAll(collection, moreIntegers);
		for(Integer i:collection){
			System.out.println(i);
		}
		System.out.println("/////");
		
		List<Integer> list = Arrays.asList(16,17,18,19);
		list.set(1, 99);
		for(Integer i:list){
			System.out.println(i);
		}
		
		System.out.println("/////");
		
//		list.add(33);
//		for(Integer i:list){
//			System.out.println(i);
//		}
	}

}
