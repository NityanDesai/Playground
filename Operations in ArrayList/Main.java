import java.util.*;
import java.io.*;
import java.lang.*;
public class Main
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> al = new ArrayList<String>();
        int n=1;
        while(n!=0)
        {
            System.out.println("Choose any one:");
            System.out.println("1.Insert");
            System.out.println("2.delete");
            System.out.println("3.Display");
            System.out.println("4.Exit");
            int c = Integer.parseInt(br.readLine());
            switch(c)
            {
                case 1: String m = br.readLine();
                        String[] a = m.split(",");
                        for(int i = 0;i<a.length;i++)
                        {
                            al.add(a[i]);
                        }
                        break;
                case 2: System.out.print("Enter the index value to be deleted:");
                        int c1 = Integer.parseInt(br.readLine());
                        System.out.println(c1);
                        al.remove(c1);
                        break;
                case 3: System.out.println(al);
                        break;
                case 4: n=0;break;
            }
        }
    }
}
