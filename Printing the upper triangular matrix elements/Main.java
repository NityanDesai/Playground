import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
        int r = in.nextInt();
        int c = in.nextInt();
        int a[][] = new int[r][c];
    for(int i=0;i<r;i++)
    {
      for(int j=0;j<c;j++)
        a[i][j]=in.nextInt();
    }
    for(int i=0;i<r;i++)
    {
      for(int j=0;j<c;j++)
      {
        if(i==j)
          System.out.print(a[i][j]+" ");
      }
    }
    for(int i=0;i<r;i++)
    {
      for(int j=0;j<c;j++)
      {
        if(i==j-1)
          System.out.print(a[i][j]+" ");
      }
    }
    for(int i=0;i<r;i++)
    {
      for(int j=0;j<c;j++)
      {
        if(i==j-2)
          System.out.print(a[i][j]+" ");
      }
    }
  }
}