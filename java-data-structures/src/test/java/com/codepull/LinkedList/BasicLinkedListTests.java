package com.codepull.LinkedList;

import com.codepull.javadatastructures.Clases.LinkedList.BasicLinkedList;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class BasicLinkedListTests {
	@Test
	public void copyConstructor_nullLinkedList_emptyLinkedList() {
		// Arrange
		final BasicLinkedList<Integer> linkedList = new BasicLinkedList<Integer>(null);

		// Act - Assert
		assertEquals(0, linkedList.size());
	}

	@Test
	public void copyConstructor_validLinkedList_linkedListCopy() {
		// Arrange
		final BasicLinkedList<Integer> linkedList = new BasicLinkedList<Integer>(LinkedListTestDataHelper.getInitializedLinkedList());

		// Act - Assert
		assertEquals(LinkedListTestDataHelper.LIST_SIZE, linkedList.size());
		assertEquals(LinkedListTestDataHelper.VALUE_ADDED_1, linkedList.get(0));
		assertEquals(LinkedListTestDataHelper.VALUE_ADDED_2, linkedList.get(1));
		assertEquals(LinkedListTestDataHelper.VALUE_ADDED_3, linkedList.get(2));
	}

	@Test
	public void add_nullElement_addItCorrectly() {
		// Arrange
		final BasicLinkedList<Integer> linkedList = new BasicLinkedList<>();

		// Act
		linkedList.add(null);

		// Assert
		assertEquals(1, linkedList.size());
		assertEquals(null, linkedList.get(0));
	}

	@Test
	public void add_severalElements_addThemCorrectly() {
		// Arrange - Act
		final BasicLinkedList<Integer> linkedList = LinkedListTestDataHelper.getInitializedLinkedList();

		// Assert
		assertEquals(LinkedListTestDataHelper.LIST_SIZE, linkedList.size());
		assertEquals(LinkedListTestDataHelper.VALUE_ADDED_1, linkedList.get(0));
		assertEquals(LinkedListTestDataHelper.VALUE_ADDED_2, linkedList.get(1));
		assertEquals(LinkedListTestDataHelper.VALUE_ADDED_3, linkedList.get(2));
	}

	@Test
	public void get_negativeIndex_null() {
		// Arrange
		final BasicLinkedList<Integer> linkedList = new BasicLinkedList<>();

		// Act - Assert
		assertEquals(null, linkedList.get(-1));
	}

	@Test
	public void get_outOfBoundsIndex_null() {
		// Arrange
		final BasicLinkedList<Integer> linkedList = new BasicLinkedList<>();

		// Act - Assert
		assertEquals(null, linkedList.get(1));
	}

	@Test
	public void remove_emptyLinkedList_null() {
		// Arrange
		final BasicLinkedList<Integer> emptyLinkedList = new BasicLinkedList<>();

		// Act - Assert
		assertEquals(null, emptyLinkedList.remove());
	}

	@Test
	public void remove_validIndexes_removeThemCorrectly() {
		// Arrange
		final BasicLinkedList<Integer> linkedList = LinkedListTestDataHelper.getInitializedLinkedList();

		// Act
		final Integer valueRemoved = linkedList.remove();

		// Assert
		assertEquals(LinkedListTestDataHelper.LIST_SIZE-1, linkedList.size());
		assertEquals(LinkedListTestDataHelper.VALUE_ADDED_3, valueRemoved);
	}

	@Test
	public void size_allCases_currentSize() {
		// Arrange
		final BasicLinkedList<Integer> emptyLinkedList = new BasicLinkedList<>();
		final BasicLinkedList<Integer> linkedList = LinkedListTestDataHelper.getInitializedLinkedList();

		// Act - Assert
		assertEquals(0, emptyLinkedList.size());
		assertEquals(LinkedListTestDataHelper.LIST_SIZE, linkedList.size());
	}
}