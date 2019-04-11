import java.util.*;
public class Main
{
    public static void main(String args[])
    {
    	Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       int a[] = new int[n];
       int count=0;
       for(int i = 0; i < n; i++)
       {
           a[i] = sc.nextInt();
       }
      for(int j = n-1; j > 0; j--)
      {
       if(a[j]!=a[j-1])
         count=0;
       else
         count++;
      }
      System.out.println(count+1);
    }
}