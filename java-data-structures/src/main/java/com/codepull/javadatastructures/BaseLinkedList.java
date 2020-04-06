package com.codepull.javadatastructures;

public interface BaseLinkedList<E> {
	void add(E value);
	E get(int index);
	E remove(int index);
	int size();
}