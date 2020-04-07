package com.codepull.LinkedList;

import com.codepull.javadatastructures.Clases.LinkedList.LinkedList;

public class LinkedListTestDataHelper {
	public static final Integer VALUE_ADDED_1 = 0, VALUE_ADDED_2 = 1, VALUE_ADDED_3 = 2;
	public static final int LIST_SIZE = 3;
	
	public static LinkedList<Integer> getInitializedLinkedList(){
		final LinkedList<Integer> linkedList = new LinkedList<>();

		linkedList.add(VALUE_ADDED_1);
		linkedList.add(VALUE_ADDED_2);
		linkedList.add(VALUE_ADDED_3);

		return linkedList;
	}
}