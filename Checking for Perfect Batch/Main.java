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
    int sum1=0,sum2=0;
    if(n==6)
    {
      sum1=a[0]+a[1]+a[2];
      sum2=a[3]+a[4]+a[5];
    }
    else if(n==9)
    {
      sum1=a[0]+a[1]+a[2]+a[3];
      sum2=a[5]+a[6]+a[7]+a[8];
    }
    if(sum1==sum2)
      System.out.println("Perfect Batch");
    else
      System.out.println("Not a Perfect Batch");
  }
}