package vector_and_stack;
import java.util.Stack;
import java.util.Scanner;
public class Bracket_balancing 
{
    public static void main(String[] args)
    {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string of brackets: ");
        String str = sc.nextLine();
        System.out.print(check_balance(str));
    }

    static boolean check_balance(String str)
    {
        Stack<Character> stck = new Stack<>();
        int i = 0;

        while(i<str.length())
        {
            char ch = str.charAt(i);
            if(ch=='{' || ch=='[' || ch=='(')
            {
                stck.push(ch);
            }
            else if(stck.empty())
            {
                return false;
            }
            else if(ch=='}')
            {
                if(stck.peek()=='{')
                {
                    stck.pop();
                }
                else{
                    return false;
                }
            }
            else if(ch==']')
            {
                if(stck.peek()=='[')
                {
                    stck.pop();
                }
                else{
                    return false;
                }
            }
            else if(ch==')')
            {
                if(stck.peek()=='(')
                {
                    stck.pop();
                }
                else{
                    return false;
                }
            }
            i++;
        }
        if(stck.empty())
            return true;
        else
            return false;
    }
}
