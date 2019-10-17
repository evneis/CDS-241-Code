public class LinkedList<T> {
    private Node<T> head;
    private int length;

    //creates an empty list
    public LinkedList(){
        head = null;
        length = 0;
    }

    //return the number of items currently in the linked list
    public int length(){
        return length;
    }

    //add an item to the FRONT of the linked list
    public void addFirst(T value){
        head = new Node<T>(value, head);
        length++;
    }

    //remove the first item from the linked list
    //we return T because this is consistent with built-in Java container classes
    public T removeFirst(){
        T temp = head.getData();
        head = head.next();
        length--;
        return temp;
    }

    //return true if value is in the list, false otherwise
    public boolean contains(T value){
        if(length == 0)
            return false;
        Node<T> n = head;
        while(n != null && !n.getData().equals(value)){
            n = n.next();
        }

        return n != null;
    }

    //loop through the list and print out all values, in order
    public void print(){
        Node<T> current = head;
        while(current.next() != null){
            System.out.println(current.getData());
            current = current.next();
        }
    }

//    public T get(int i){
//        assert i < length;
//
//        Node<T> current = head;
//
//        for(int j = 0; j <= i; j++){
//            current = current.next();
//        }
//    }

    
    public static void main(String args[]){
        LinkedList<Integer> list = new LinkedList<>();
        for(int i = 0; i < 10; ++i){
            list.addFirst(i);
        }

        System.out.println(list.contains(5));
        System.out.println(list.contains(15));

        list.print();
    }
}
