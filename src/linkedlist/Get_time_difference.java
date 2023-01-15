package linkedlist;
import java.util.*;
public class Get_time_difference
{
    public static void main(String args[])
    {
        List<Integer> array_list = new ArrayList<>();
        List<Integer> linked_list = new LinkedList<>();
        System.out.println("Time taken for add operation in ArrayList is: "+diff(array_list));
        System.out.println("Time taken for add operation in LinkedList is: "+diff(linked_list));
    }

    static long diff(List<Integer> list)
    {
        long start = System.currentTimeMillis();
        for(int i=0;i<=100000;i++)
        {
            list.add(0,i);
        }
        long end = System.currentTimeMillis();
        return end-start;
    }
}