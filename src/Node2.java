public class Node2<T> {
    private T data;
    private Node2<T> next;

    public Node2(T x){
        this(x,null);
    }

    public Node2(T x, Node2<T> n){
        data = x;
        next = n;
    }

    public T getData(){
        return data;
    }

    public void setData(T d){
        data = d;
    }

    public Node2<T> next(){
        return next;
    }

    public void setNext(Node2<T> n){
        next = n;
    }

    public String toString(){
        return "Node value: " + data;
    }

}
