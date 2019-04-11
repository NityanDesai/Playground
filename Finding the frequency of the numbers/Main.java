import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int a[] = new int[n];
    int b[] = new int[k];
    for(int i = 0; i < n; i++)
      a[i] = sc.nextInt();
    int count=0;
    for(int j = 1; j <= k; j++)
    {
      count=0;
      for(int  m= 0;  m< n ; m++)
      {
        if(j==a[m])
          count++;
      }
      System.out.println(j+" "+count);
    }
    }
}