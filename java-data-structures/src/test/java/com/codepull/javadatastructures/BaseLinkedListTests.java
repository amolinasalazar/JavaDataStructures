package com.codepull.javadatastructures;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class BaseLinkedListTests {
    private final Integer valueAdded1 = 0, valueAdded2 = 1, valueAdded3 = 2;
    private LinkedList<Integer> getLinkedListWithSeveralElements(){
        final LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.add(valueAdded1);
        linkedList.add(valueAdded2);
        linkedList.add(valueAdded3);

        return linkedList;
    }

    @Test
    public void add_nullElement_addItCorrectly() {
        // Arrange
        final LinkedList<Integer> linkedList = new LinkedList<>();

        // Act
        linkedList.add(null);

        // Assert
        assertEquals(1, linkedList.size());
        assertEquals(null, linkedList.get(0));
    }

    @Test
    public void add_severalElements_addThemCorrectly() {
        // Arrange - Act
        final LinkedList<Integer> linkedList = getLinkedListWithSeveralElements();

        // Assert
        assertEquals(valueAdded1, linkedList.get(0));
        assertEquals(valueAdded2, linkedList.get(1));
        assertEquals(valueAdded3, linkedList.get(2));
    }

    @Test
    public void get_negativeOutOfBoundsIndex_null() {
        // Arrange
        final LinkedList<Integer> linkedList = new LinkedList<>();

        // Act - Assert
        assertEquals(null, linkedList.get(-1));
    }

    @Test
    public void get_positiveOutOfBoundsIndex_null() {
        // Arrange
        final LinkedList<Integer> linkedList = new LinkedList<>();

        // Act - Assert
        assertEquals(null, linkedList.get(1));
    }

    @Test
    public void remove_emptyLinkedList_null() {
        // Arrange
        final LinkedList<Integer> emptyLinkedList = new LinkedList<>();

        // Act - Assert
        assertEquals(null, emptyLinkedList.remove(0));
        assertEquals(null, emptyLinkedList.remove(3));
    }

    @Test
    public void remove_negativeIndex_null() {
        // Arrange
        final LinkedList<Integer> linkedList = getLinkedListWithSeveralElements();

        // Act - Assert
        assertEquals(null, linkedList.remove(-1));
    }

    @Test
    public void remove_validIndexes_removeThemCorrectly() {
        // Arrange
        final LinkedList<Integer> linkedList = getLinkedListWithSeveralElements();

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
        final LinkedList<Integer> emptyLinkedList = new LinkedList<>();
        final LinkedList<Integer> linkedList = getLinkedListWithSeveralElements();

        // Act - Assert
        assertEquals(0, emptyLinkedList.size());
        assertEquals(3, linkedList.size());
    }

}