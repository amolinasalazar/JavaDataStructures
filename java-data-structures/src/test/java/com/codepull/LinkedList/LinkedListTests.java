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

	@Test
	public void removeIndex_emptyLinkedList_null() {
		// Arrange
		final LinkedList<Integer> emptyLinkedList = new LinkedList<>();

		// Act - Assert
		assertEquals(null, emptyLinkedList.remove(0));
		assertEquals(null, emptyLinkedList.remove(3));
	}

	@Test
	public void removeIndex_negativeIndex_null() {
		// Arrange
		final LinkedList<Integer> linkedList = LinkedListTestDataHelper.getInitializedLinkedList();

		// Act - Assert
		assertEquals(null, linkedList.remove(-1));
	}

	@Test
	public void removeIndex_validIndexes_removeThemCorrectly() {
		// Arrange
		final LinkedList<Integer> linkedList = LinkedListTestDataHelper.getInitializedLinkedList();

		// Act
		final Integer valueRemoved1 = linkedList.remove(0);
		final Integer valueRemoved3 = linkedList.remove(1);

		// Assert
		assertEquals(1, linkedList.size());
		assertEquals(LinkedListTestDataHelper.VALUE_ADDED_1, valueRemoved1);
		assertEquals(LinkedListTestDataHelper.VALUE_ADDED_3, valueRemoved3);
	}

	@Test
	public void clear_emptyList_emptyList() {
		// Arrange
		final LinkedList<Integer> linkedList = new LinkedList<>();

		// Act
		linkedList.clear();

		// Assert
		assertEquals(0, linkedList.size());
	}

	@Test
	public void clear_severalElements_emptyList() {
		// Arrange
		final LinkedList<Integer> linkedList = LinkedListTestDataHelper.getInitializedLinkedList();

		// Act
		linkedList.clear();

		// Assert
		assertEquals(0, linkedList.size());
	}

	@Test
	public void contains_elementNotPresent_false() {
		// Arrange
		final LinkedList<Integer> linkedList = LinkedListTestDataHelper.getInitializedLinkedList();

		// Act - Assert
		assertEquals(false, linkedList.contains(100));
	}

	@Test
	public void contains_elementPresent_true() {
		// Arrange
		final LinkedList<Integer> linkedList = LinkedListTestDataHelper.getInitializedLinkedList();

		// Act - Assert
		assertEquals(true, linkedList.contains(LinkedListTestDataHelper.VALUE_ADDED_1));
	}
}