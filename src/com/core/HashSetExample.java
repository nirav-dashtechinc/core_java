package com.core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetExample {
	public static void main(String args[]) {
		Set<String> intSet = new HashSet<String>();
		intSet.add("tom");
		intSet.add("rick");
		intSet.add("john");
		intSet.add("peter");
		intSet.add("maddy");

		// search
		boolean search = intSet.contains("john");
		System.out.println(search);

		boolean search2 = intSet.contains("ohn");
		System.out.println(search2);

		// insert new value
		intSet.add("ohn");
		System.out.println("After adding one value: " + intSet);

		// sorting ascending
		List<String> strList = new ArrayList<String>(intSet);
		Collections.sort(strList);
		System.out.println("Ascending order sorting: " + strList);

		Collections.sort(strList, Collections.reverseOrder());
		System.out.println("Descending order sorting: " + strList);
	}
}
