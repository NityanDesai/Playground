import java.util.*;
import java.io.*;
import java.lang.*;
public class Main
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        LinkedList<String> ll = new LinkedList<String>();
        String m = br.readLine();
        String[] a = m.split(",");
        for(int i = 0;i<a.length;i++)
        {
            ll.add(a[i]);
        }
        System.out.println(ll);
        System.out.println("Size of the linked list: "+ll.size());
        System.out.println("Is LinkedList empty? "+ll.isEmpty());
                String m1 = br.readLine();
        System.out.println("Does LinkedList contains "+m1+"?");
        System.out.println(ll.contains(m1));
    }
}
