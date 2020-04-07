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

	public void clear(){

	}

	public boolean contains(Object o){
		return false;
	}
}