public class NodeHomework {

    public static class Node<T>{
        private T element;
        private Node next;
        public Node(T t) {
            this.element = t;
            this.next = null;

        }

        public T getElement(){return this.element;}

        public void setElement(T element){
            this.element = element;
        }

        public Node<T> getNext(){return this.next;}

        public void setNext(Node next){
            this.next = next;
        }
    }


    public static void main(String[] args){

        Node<Integer> testNode = new Node<>(5);

        System.out.println(testNode.getElement());
        testNode.setElement(10);
        System.out.println(testNode.getElement());

        Node<String> test2 = new Node<>("Hello");

        test2.setNext(testNode);
        System.out.println(test2.getNext());
        System.out.println(test2.getElement());
    }
}
