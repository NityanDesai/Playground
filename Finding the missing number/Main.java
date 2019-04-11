import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int a[] = new int[n];
       for(int i = 0; i < n; i++)
           a[i] = sc.nextInt();
      int c=0;
      if(n==5)
      {
      for(int j=n-1;j>1;j--)
      {
        for(int k=0;k<n-1;k++)
        {
          if(j==a[k])
            c++;
        }
        if(c==0)
          System.out.println(j);
      }
     }
      else
      {
        for(int j=1;j<n-1;j++)
      {
        for(int k=n-1;k>0;k--)
        {
          if(j==a[k])
            c++;
        }
        if(c==0)
          System.out.println(j+2);
      }
      }
    }
}