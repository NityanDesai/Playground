import java.util.*;
import java.io.*;
import java.lang.*;
public class Main
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        TreeSet<String> t=new TreeSet<String>();
        String month = br.readLine();
        String[] a = month.split(",");
        for(int i = 0;i<a.length;i++)
        {
            t.add(a[i]);
        }
        System.out.println(t);
        Object a1[] = t.toArray();
        int n = a1.length-1;
        while(t.isEmpty()!=true)
        {
            Object m = a1[n];
            t.remove(m);
            System.out.println(t);
            --n;
        }
    }
}
