public class Node1<T> {
    private T data;
    private Node1<T> next;

    public Node1(T x){
        this(x,null);
    }

    public Node1(T x, Node1<T> n){
        data = x;
        next = n;
    }

    public T getData(){
        return data;
    }

    public void setData(T d){
        data = d;
    }

    public Node1<T> next(){
        return next;
    }

    public void setNext(Node1<T> n){
        next = n;
    }

    public String toString(){
        return "Node value: " + data;
    }


}
