package com.codepull.javadatastructures.Interfaces.LinkedList;

public interface BaseLinkedList<E> {

	void add(E value);
	E get(int index);
	E remove();
	int size();

}