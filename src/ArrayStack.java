public class ArrayStack
{
    private String[] _stack;
    private  int _top = -1;

    public ArrayStack(int size)
    {
        _stack = new String[size];
    }

    public void Push(String data)
    {
        if (_top == _stack.length -1)
        {
            throw new ArrayStoreException();
        }
        _top += 1;
        _stack[_top] = data;
    }

    public String Pop()
    {
        if (_top == -1)
        {
            throw new IndexOutOfBoundsException();
        }

        String pop = _stack[_top];

        for (int i = _top; i > 0; i--)
        {
            _stack[i] = _stack[i-1];
        }

        _top -= 1;

        return pop;
    }

    public String Peek()
    {
        return _stack[_top];
    }

    public boolean IsEmpty()
    {
        return _top >= 0;
    }

    public int GetTopIndex()
    {
        return _top;
    }
}
