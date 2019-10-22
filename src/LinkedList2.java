import java.util.Iterator;

public class LinkedList2<T> {
    private Node2<T> head;
    private int length;

    //creates an empty list
    public LinkedList2(){
        head = null;
        length = 0;
    }

    //return the number of items currently in the linked list
    public int length(){
        return length;
    }

    //add an item to the FRONT of the linked list
    public void addFirst(T value){
        head = new Node2<T>(value,head);
        ++length;
    }

    //remove the first item from the linked list
    //we return T because this is consistent with built-in Java container classes
    public T removeFirst(){
        if(head == null){
            return null;
        }

        Node2<T> n = head;
        head = head.next();
        --length;
        return n.getData();
    }

    //return true if value is in the list, false otherwise
    public boolean contains(T value){
        Node2<T> n = head;
        while(n != null && !n.getData().equals(value)){
            n = n.next();
        }

        return n != null;
    }

    //loop through the list and print out all values, in order
    public void print(){
        Node2<T> n = head;
        while(n != null){
            System.out.println(n);
            n = n.next();
        }
    }

    //add an item at index i; assumes the list is non-empty
    public void add(int i, T value) throws IndexOutOfBoundsException{
        Node2<T> current = head;
        if(i > length || i < 0)
            throw new IndexOutOfBoundsException("Out of Bounds");
        else if(length == 0)
            head = new Node2<T>(value, null);
        else{
            for(int j = 0; j < i-1; j++){
                current = current.next();
            }
            current.setNext(new Node2<T>(value, current.next()));
        }
        length++;
    }

    public static void main(String args[]){
        LinkedList2<Integer> LLint = new LinkedList2<>();
        System.out.println(LLint.length);
        LLint.addFirst(5);
        LLint.add(1,10);
        System.out.println(LLint.length);
        LLint.print();
        LLint.add(1, 100);
        LLint.print();
    }
}
