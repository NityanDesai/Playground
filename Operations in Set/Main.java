import java.util.*;
import java.io.*;
import java.lang.*;
public class Main
{
    public static void main(String arg[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        LinkedHashSet<String> l=new LinkedHashSet<String>();
        String month = br.readLine();
        String[] a = month.split(",");
        for(int i = 0;i<a.length;i++)
        {
            l.add(a[i]);
        }
        System.out.println(l);
        System.out.print("Enter the value to be deleted: ");
        String n = br.readLine();
        System.out.println(n);
        l.remove(n);
        System.out.println(l);
        System.out.print("Enter the value to be added: ");
        String m = br.readLine();
        System.out.println(m);
        l.add(m);
        System.out.println(l);
    }
}