package com.core;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
	public static void main(String args[]) {
		List<Integer> intList = new LinkedList<Integer>();
		intList.add(55);
		intList.add(70);
		intList.add(38);
		intList.add(43);
		intList.add(26);
		intList.add(17);

		// searching
		boolean search1 = intList.contains(43);
		System.out.println("If 43 is present in the list: " + search1);

		boolean search2 = intList.contains(6);
		System.out.println("If 6 is present in the list: " + search2);

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
