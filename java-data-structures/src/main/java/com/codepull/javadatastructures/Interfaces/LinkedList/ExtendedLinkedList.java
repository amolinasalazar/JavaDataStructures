package com.codepull.javadatastructures.Interfaces.LinkedList;

public interface ExtendedLinkedList<E> {

	void add(E value);
	E get(int index);
	E remove();
	int size();

	void add(int index, E element);
	E remove(int index);
	void clear();
	boolean contains(Object o);
}