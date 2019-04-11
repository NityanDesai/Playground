import java.util.*;
import java.io.*;
import java.lang.*;
public class Main
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        LinkedHashSet<String> l=new LinkedHashSet<String>();
        String m = br.readLine();
        String[] a = m.split(",");
        for(int i = 0;i<a.length;i++)
        {
            l.add(a[i]);
        }
        System.out.println(l);
    }
}