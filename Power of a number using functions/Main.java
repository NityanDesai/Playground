import java.util.Scanner;
class Main
{
   public static int pow(int n,int e)
   {
     int p=1; 
     for(int i=1;i<=e;i++)
        p=p*n;
     return p;
   }
   public static void main(String args[])
   {
     Scanner in = new Scanner(System.in);
     int n = in.nextInt();
     int e = in.nextInt();
     int p=pow(n,e);
     System.out.print(p);
   }
}