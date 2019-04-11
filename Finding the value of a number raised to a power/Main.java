import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner in = new Scanner(System.in);
      int b=in.nextInt();
      int e=in.nextInt();
      int r=1,i=0;
      while(i<e)
      {
        r=r*b;
        i++;
      }
      System.out.println(r);
    }
}