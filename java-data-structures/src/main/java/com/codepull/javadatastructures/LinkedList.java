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
            LinkedListNode<E> node = head;
            while(node.next != null){
                node = node.next;
            }

            node.next = new LinkedListNode<E>(value);
        }

        this.size++;
    }

    @Override
    public E get(final int index) {
        if(index < 0 || index >= this.size){
            return null;
        }

        if(size == 0){
            return null;
        }
        else{
            int counter;
            LinkedListNode<E> node = head;
            
            for(counter = 0; node.next != null && counter < index; counter++){
                node = node.next;
            }

            return counter == index ? node.value : null;
        }
    }

    @Override
    public E remove(final int index) {
        
        return null;
    }

    @Override
    public int size() {
        return this.size;
    }
}