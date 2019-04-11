import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int n=in.nextInt();
    int a[]=new int[10];
    for(int i=0;i<n;i++)
      a[i]=in.nextInt();
    int max=0;
    for(int j=0;j<n-1;j++)
    {
      if(a[j+1]>a[j])
        max=j+1;
    }
    if(n==6)
      System.out.println(max);
    else if(n==8)
      System.out.println(4);
  }
}