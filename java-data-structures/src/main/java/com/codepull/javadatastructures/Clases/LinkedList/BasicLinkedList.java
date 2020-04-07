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
	public void add(final E element) {
		if(size == 0){
			this.head = new LinkedListNode<E>(element);
		}
		else{
			LinkedListNode<E> node = this.head;
			while(node.next != null){
				node = node.next;
			}

			node.next = new LinkedListNode<E>(element);
		}

		this.size++;
	}

	@Override
	public E get(final int index) {
		if(!validateIndex(index)){
			return null;
		}

		return getNthNode(index).value;
	}

	@Override
	public E remove() {
		return null;
	}

	@Override
	public int size() {
		return this.size;
	}

	protected boolean validateIndex(int index){
		return index >= 0 && index < this.size;
	}

	
	protected LinkedListNode<E> getNthNode(final int index){
		int counter;
		LinkedListNode<E> node = this.head;

		for(counter = 0; node.next != null && counter < index; counter++){
			node = node.next;
		}

		return node;
	}
}