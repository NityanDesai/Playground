import java.util.*;
import java.io.*;
import java.lang.*;
public class Main
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        TreeSet<String> t = new TreeSet<String>();
        String m = br.readLine();
        String[] a = m.split(",");
        System.out.println("Duplicate Entry is: ");
        for (String s : a) {
            if (!t.add(s)) {
                System.out.println(s);
            }
        }
        System.out.println("TreeSet is : " + t);
    }
}
