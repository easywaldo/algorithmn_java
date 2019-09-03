import java.util.EmptyStackException;

public class Stack<T> {

    private  Node<T> _top;

    public class Node<T>
    {
        private T _data;
        private Node<T> next;

        public Node(T data)
        {
            this._data = data;
        }

    }

    public T Pop()
    {
        if (_top == null)
        {
            throw new EmptyStackException();
        }

        T item = _top._data;
        _top = _top.next;
        return item ;
    }

    public void Push(T item)
    {
        Node<T> t = new Node<T>(item);
        t.next = _top;
        _top = t;
    }


    public T Peek()
    {
        if (_top == null)
        {
            throw new EmptyStackException();
        }
        return _top._data;
    }


    public boolean IsEmpty()
    {
        return (_top != null);
    }
}