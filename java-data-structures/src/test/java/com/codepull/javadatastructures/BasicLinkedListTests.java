package com.codepull.javadatastructures;

import com.codepull.javadatastructures.Clases.LinkedList.BasicLinkedList;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class BasicLinkedListTests {
	private final Integer valueAdded1 = 0, valueAdded2 = 1, valueAdded3 = 2;
	private BasicLinkedList<Integer> getLinkedListWithSeveralElements(){
		final BasicLinkedList<Integer> linkedList = new BasicLinkedList<>();

		linkedList.add(valueAdded1);
		linkedList.add(valueAdded2);
		linkedList.add(valueAdded3);

		return linkedList;
	}
	
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
		final BasicLinkedList<Integer> linkedList = new BasicLinkedList<Integer>(getLinkedListWithSeveralElements());

		// Act - Assert
		assertEquals(3, linkedList.size());
		assertEquals(valueAdded1, linkedList.get(0));
		assertEquals(valueAdded2, linkedList.get(1));
		assertEquals(valueAdded3, linkedList.get(2));
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
		final BasicLinkedList<Integer> linkedList = getLinkedListWithSeveralElements();

		// Assert
		assertEquals(3, linkedList.size());
		assertEquals(valueAdded1, linkedList.get(0));
		assertEquals(valueAdded2, linkedList.get(1));
		assertEquals(valueAdded3, linkedList.get(2));
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
		assertEquals(null, emptyLinkedList.remove(0));
		assertEquals(null, emptyLinkedList.remove(3));
	}

	@Test
	public void remove_negativeIndex_null() {
		// Arrange
		final BasicLinkedList<Integer> linkedList = getLinkedListWithSeveralElements();

		// Act - Assert
		assertEquals(null, linkedList.remove(-1));
	}

	@Test
	public void remove_validIndexes_removeThemCorrectly() {
		// Arrange
		final BasicLinkedList<Integer> linkedList = getLinkedListWithSeveralElements();

		// Act
		final Integer valueRemoved1 = linkedList.remove(0);
		final Integer valueRemoved3 = linkedList.remove(1);

		// Assert
		assertEquals(1, linkedList.size());
		assertEquals(valueAdded1, valueRemoved1);
		assertEquals(valueAdded3, valueRemoved3);
	}

	@Test
	public void size_allCases_currentSize() {
		// Arrange
		final BasicLinkedList<Integer> emptyLinkedList = new BasicLinkedList<>();
		final BasicLinkedList<Integer> linkedList = getLinkedListWithSeveralElements();

		// Act - Assert
		assertEquals(0, emptyLinkedList.size());
		assertEquals(3, linkedList.size());
	}
}