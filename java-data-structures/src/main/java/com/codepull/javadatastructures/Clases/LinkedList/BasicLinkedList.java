package com.codepull.javadatastructures.Clases.LinkedList;

import com.codepull.javadatastructures.Interfaces.LinkedList.BaseLinkedList;

public class BasicLinkedList<E> implements BaseLinkedList<E> {

	LinkedListNode<E> head;
	int size;

	public BasicLinkedList(){
		this.size = 0;
	}

	public BasicLinkedList(BasicLinkedList<E> linkedList){
		if(linkedList != null){
			for(int i=0; i<linkedList.size(); i++){
				this.add(linkedList.get(i));
			}
	
			this.size = linkedList.size();
		}
	}

	@Override
	public void add(final E value) {
		if(size == 0){
			this.head = new LinkedListNode<E>(value);
		}
		else{
			LinkedListNode<E> node = this.head;
			while(node.next != null){
				node = node.next;
			}

			node.next = new LinkedListNode<E>(value);
		}

		this.size++;
	}

	@Override
	public E get(final int index) {
		if(!validateIndex(index)){
			return null;
		}

		int counter;
		LinkedListNode<E> node = this.head;
		
		for(counter = 0; node.next != null && counter < index; counter++){
			node = node.next;
		}

		return counter == index ? node.value : null;
	}

	@Override
	public E remove(final int index) {
		if(!validateIndex(index)){
			return null;
		}

		if(this.size == 1){
			this.size--;
			this.head = null;
			return null;
		}

		if(index == 0){
			this.size--;
			E removedElement = this.head.value;
			this.head = this.head.next;
			return removedElement;
		}

		int counter;
		LinkedListNode<E> node = this.head;
		LinkedListNode<E> previousNode = this.head;

		for(counter = 0; node.next != null && counter < index; counter++){
			previousNode = node;
			node = node.next;
		}

		this.size--;
		E removedElement = node.value;
		previousNode.next = node.next;
		return removedElement;
	}

	@Override
	public int size() {
		return this.size;
	}

	private boolean validateIndex(int index){
		return index >= 0 && index < this.size;
	}
}