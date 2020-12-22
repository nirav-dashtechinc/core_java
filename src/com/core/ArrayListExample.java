package com.core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExample {
	public static void main(String args[]) {
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(55);
		intList.add(70);
		intList.add(38);
		intList.add(43);
		intList.add(26);
		intList.add(17);

		// searching
		boolean search1 = intList.contains(55);
		System.out.println("If 55 is present in the list: " + search1);

		boolean search2 = intList.contains(5);
		System.out.println("If 5 is present in the list: " + search2);

		// inserting
		intList.add(5);
		System.out.println("Inserting new value 5: " + intList);

		// removing
		intList.remove(2);
		System.out.println("Removing value 38: " + intList);

		// ascending order sorting
		Collections.sort(intList);
		System.out.println("Ascending order sorting: " + intList);

		// descending order sorting
		Collections.sort(intList, Collections.reverseOrder());
		System.out.println("Descending order sorting: " + intList);
	}
}
