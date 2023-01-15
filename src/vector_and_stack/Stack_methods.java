package vector_and_stack;
import java.util.*;
public class Stack_methods
{
    public static void main(String[] args)
    {
        Stack<Integer> stck = new Stack<>();
        stck.push(2);
        stck.push(1);
        stck.push(5);
        stck.push(7);
        System.out.print(stck.pop()+"\n");
        System.out.print(stck.peek()+"\n");
        System.out.print(stck.empty()+"\n");
        System.out.print(stck.search(5));
    }
}
