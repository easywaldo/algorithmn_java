public class StackTest
{
    public static void main(String[] args)
    {
        Stack<Integer> myStack = new Stack<Integer>();
        myStack.Push(100);
        myStack.Push(1900);
        Integer popData = myStack.Pop();
        myStack.Push(4000);
        Integer peekData = myStack.Peek();

        System.out.println(popData);
        System.out.println(peekData);

        System.out.println(myStack.IsEmpty());
    }
}