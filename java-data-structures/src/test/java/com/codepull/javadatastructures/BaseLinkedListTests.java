package com.codepull.javadatastructures;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class BaseLinkedListTests {
    @Test
    public void add_emptyLinkedList_addsItCorrectly() {
        // Arrange
        LinkedList<Integer> linkedList = new LinkedList<>();
        Integer valueToAdd = 1;

        // Act
        linkedList.add(valueToAdd);

        // Assert
        assertEquals(valueToAdd, linkedList.get(0));
    }

    @Test
    public void add_severalElements_addThemCorrectly() {
        // Arrange
        LinkedList<Integer> linkedList = new LinkedList<>();
        Integer valueToAdd1 = 0, valueToAdd2 = 1, valueToAdd3 = 2;

        // Act
        linkedList.add(valueToAdd1);
        linkedList.add(valueToAdd2);
        linkedList.add(valueToAdd3);

        // Assert
        assertEquals(valueToAdd1, linkedList.get(0));
        assertEquals(valueToAdd2, linkedList.get(1));
        assertEquals(valueToAdd3, linkedList.get(2));
    }

    @Test
    public void get_negativeOutOfBoundsIndex_null() {
        // Arrange
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Act - Assert
        assertEquals(null, linkedList.get(-1));
    }

    @Test
    public void get_positiveOutOfBoundsIndex_null() {
        // Arrange
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Act - Assert
        assertEquals(null, linkedList.get(1));
    }
}