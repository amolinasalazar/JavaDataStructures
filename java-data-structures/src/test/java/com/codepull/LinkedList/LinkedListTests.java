package com.codepull.LinkedList;

import com.codepull.javadatastructures.Clases.LinkedList.LinkedList;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class LinkedListTests {
	@Test
	public void addIndex_negativeIndex_elementNotAdded() {
		// Arrange
		final LinkedList<Integer> linkedList = LinkedListTestDataHelper.getInitializedLinkedList();

		// Act
		linkedList.add(-1, 3);

		// Assert
		assertEquals(LinkedListTestDataHelper.LIST_SIZE, linkedList.size());
	}

	@Test
	public void addIndex_outOfBoundsIndex_elementNotAdded() {
		// Arrange
		final LinkedList<Integer> linkedList = LinkedListTestDataHelper.getInitializedLinkedList();

		// Act
		linkedList.add(LinkedListTestDataHelper.LIST_SIZE + 1, 3);

		// Assert
		assertEquals(LinkedListTestDataHelper.LIST_SIZE, linkedList.size());
	}

	@Test
	public void addIndex_validIndex_elementAdded() {
		// Arrange
		final LinkedList<Integer> linkedList = LinkedListTestDataHelper.getInitializedLinkedList();

		// Act
		linkedList.add(LinkedListTestDataHelper.LIST_SIZE/2, 200);
		linkedList.add(0, 100);
		linkedList.add(LinkedListTestDataHelper.LIST_SIZE+1, 300);

		// Assert
		assertEquals(LinkedListTestDataHelper.LIST_SIZE+3, linkedList.size());
		assertEquals((Integer) 100, linkedList.get(0));
		assertEquals(LinkedListTestDataHelper.VALUE_ADDED_1, linkedList.get(1));
		assertEquals((Integer) 200, linkedList.get(2));
		assertEquals(LinkedListTestDataHelper.VALUE_ADDED_2, linkedList.get(3));
		assertEquals(LinkedListTestDataHelper.VALUE_ADDED_3, linkedList.get(4));
		assertEquals((Integer) 300, linkedList.get(5));
	}
}