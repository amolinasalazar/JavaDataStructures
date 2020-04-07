package com.codepull.javadatastructures.Interfaces.LinkedList;

public interface ExtendedLinkedList<E> {

	void add(E value);
	E get(int index);
	E remove(int index);
	int size();

	void add(int index, E element);
	void clear();
	boolean contains(Object o);
}