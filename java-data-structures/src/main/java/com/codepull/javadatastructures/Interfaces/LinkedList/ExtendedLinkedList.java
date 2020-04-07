package com.codepull.javadatastructures.Interfaces.LinkedList;

public interface ExtendedLinkedList<E> {
	void add(int index, E element);
	E remove(int index);
	void clear();
	boolean contains(Object o);
}