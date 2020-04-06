package com.codepull.javadatastructures;

public class LinkedList<E> implements BaseLinkedList<E> {
	
	public class LinkedListNode<T>{
		public T value;
		public LinkedListNode<T> next;

		public LinkedListNode(T value){
			this.value = value;
		}
	}

	LinkedListNode<E> head;
	int size;

	public LinkedList(){
		this.size = 0;
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