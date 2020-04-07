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
		if(!validateIndex(index)) return null;

		E removedElement;

		if(this.size == 1){
			removedElement = this.head.value;
			this.head = null;
		}
		else if(index == 0){
			removedElement = this.head.value;
			this.head = this.head.next;
		}
		else{
			LinkedListNode<E> previousNode = getNthNode(index-1);
			removedElement = previousNode.next.value;
			previousNode.next = previousNode.next.next;
		}

		this.size--;
		return removedElement;
	}

	public void clear(){
		while(this.size > 0){
			remove();
		}
	}

	public boolean contains(Object o){
		return false;
	}
}