public class NodeHomework {

    public class Node<T>{
        private T element;
        private Node next;
        public Node(T t, Node next) {
            this.element = t;
            next = null;

        }

        public T getElement(Node n){return element;}

        public void setElement(Node n, T element){
            n.element = element;
        }

        public Node getNext(Node n){return n.next;}

        public void setNext(Node n, Node next){
            n.next = next;
        }
    }


    public static void main(String[] args){

    }
}
