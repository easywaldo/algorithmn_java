public class ArrayStackTest
{
    public static void main(String args[])
    {
        ArrayStack myStack = new ArrayStack(10);

        myStack.Push("hello");
        myStack.Push("world");

        System.out.println(myStack.IsEmpty());

        System.out.println(myStack.Pop());

        myStack.Push("foo");
        myStack.Push("bar");

        System.out.println(myStack.Peek());

        System.out.println(myStack.GetTopIndex());

    }
}
