import java.lang.reflect.Array;

import java.util.NoSuchElementException;

class SimpleLinkedList<T> {

    int size =0;
    private Node<T> head;
    private Node<T> current;
    static class Node<T>{
        private final T data;
        private Node<T> next;

        public Node(T data){
            this.data = data;
            this.next = null;
        }
    }

    SimpleLinkedList() {
    }

    SimpleLinkedList(T[] values) {
        for(T value :values){
            push(value);
        }
    }

    void push(T value) {
        Node<T> newNode =  new Node<>(value);
        if(size == 0){
            head = newNode;
        }
        else{
            current.next =  newNode;
        }
        current = newNode;
        size++;
    }

    T pop() {
        if(size == 0 )
            throw new NoSuchElementException();
        Node<T> prev = head;
        while(size >1 && prev.next.next != null ){
            prev = prev.next;
        }

        T poppedData ;
        poppedData = current.data;
        if(size == 1){
            head = null;
            current = null;
        }
        else{
            prev.next =  null;
            current =  prev;
        }
        size--;
        return poppedData;
    }

    void reverse() {
        current = head;
        Node<T> prev = null;
        Node<T>next;
        while(current != null){
            next =  current.next;
            current.next =  prev;
            prev =  current;
            current = next;
        }
        current = head;
        head = prev;
    }

    T[] asArray(Class<T> clazz) {
        Node<T> slider =  head;
        int index =size;
        T[] returnArrayOfNodeData = (T[]) Array.newInstance(clazz, size);
        while(slider != null){
            returnArrayOfNodeData[--index] = slider.data;
            slider = slider.next;
        }
        return returnArrayOfNodeData;
    }

    int size() {
            return this.size;
    }
}
