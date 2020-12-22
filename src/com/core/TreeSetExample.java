package com.core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		Set<Integer> intSet = new TreeSet<Integer>();
		intSet.add(55);
		intSet.add(70);
		intSet.add(38);
		intSet.add(43);
		intSet.add(26);
		intSet.add(17);

		// searching
		boolean search1 = intSet.contains(55);
		System.out.println("If 55 is present in the list: " + search1);

		boolean search2 = intSet.contains(5);
		System.out.println("If 5 is present in the list: " + search2);

		// inserting
		intSet.add(5);
		System.out.println("Inserting new value 5: " + intSet);

		// removing
		intSet.remove(2);
		System.out.println("Removing value 38: " + intSet);

		// ascending order sorting
		List<Integer> strList = new ArrayList<Integer>(intSet);
		Collections.sort(strList);
		System.out.println("Ascending order sorting: " + strList);

		// descending order sorting
		Collections.sort(strList, Collections.reverseOrder());
		System.out.println("Descending order sorting: " + strList);
	}
}
