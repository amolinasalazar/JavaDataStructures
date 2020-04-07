package com.codepull.javadatastructures.Clases.LinkedList;

import com.codepull.javadatastructures.Interfaces.LinkedList.ExtendedLinkedList;

public class LinkedList<E> extends BasicLinkedList<E> implements ExtendedLinkedList<E> {

	@Override
	public void add(int index, E element){
		if(validateIndex(index)){
			if(size == 0){
				this.head = new LinkedListNode<E>(element);
			}
			else{
				LinkedListNode<E> newNode = new LinkedListNode<E>(element);

				if(index == 0){
					LinkedListNode<E> nextNode = this.head;
					this.head = newNode;
					this.head.next = nextNode;
				}
				else if(this.size-1 == index){
					getNthNode(index).next = newNode;
				}
				else{
					LinkedListNode<E> previousNode = getNthNode(index-1);
					LinkedListNode<E> nextNode = previousNode.next;
					previousNode.next = newNode;
					previousNode.next.next = nextNode;
				}
			}

			this.size++;
		}
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

	public void clear(){
		for(int i=0; i<this.size; i++){
			remove(i);
		}
	}

	public boolean contains(Object o){
		return false;
	}
}