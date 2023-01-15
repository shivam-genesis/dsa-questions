package string;
import java.util.Scanner;
public class Circular_Printer
{
    public static void main(String[] args)
    {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any string: ");
        String s = sc.nextLine();
        s = s.toLowerCase();
        System.out.println("Minimum time taken: "+cal_time(s));

    }

    static int cal_time(String s)
    {
        int time = 0;
        int current_pointer = 97;
        for(int i=0;i<s.length();i++)
        {
            int t1 = clockwise_time(current_pointer,s.charAt(i));
            int t2 = anticlockwise_time(current_pointer,s.charAt(i));
            current_pointer = (int)s.charAt(i);
            time += Math.min(t1,t2);
        }
        return time;
    }

    static int clockwise_time(int current_pointer, char c)
    {
        int count = -1;
        while(current_pointer++ != (int)c)
        {
            count++;
            if(current_pointer == 123)
                current_pointer = 97;
        }
        return count+1;
    }

    static int anticlockwise_time(int current_pointer, char c)
    {
        int count = -1;
        while(current_pointer-- != (int)c)
        {
            count++;
            if(current_pointer == 96)
                current_pointer = 122;
        }
        return count+1;
    }
}