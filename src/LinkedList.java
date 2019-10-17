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
        Node<T> previous = new Node<>(head.getData(), head.next());
        this.head = new Node<T>(value, previous);
        this.length++;
    }

    //remove the first item from the linked list
    //we return T because this is consistent with built-in Java container classes
    public T removeFirst(){

    }

    //return true if value is in the list, false otherwise
    public boolean contains(T value){
        if(head.getData() == value)
            return true;
        else{
            for(int i = 0; i < length; i++) {
                Node<T> nodeI = head.next();
            }
        }
    }

    //loop through the list and print out all values, in order
    public void print(){
        Node<T> current = head;
        while(head.next() != null){
            System.out.println(current.getData());
        }
    }

    
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
