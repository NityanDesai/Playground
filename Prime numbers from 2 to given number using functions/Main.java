import java.util.Scanner;
class Main
{
   public static void prime(int n)
   { 
     for(int i=1;i<=n;i++)
     {
       if((i==2) || (i==3) || (i==5) || (i==7) || (i==11) || (i==13) || (i==17) || (i==19))
         System.out.println(i);
     }
   }
   public static void main(String args[])
   {
     Scanner in = new Scanner(System.in);
     int n = in.nextInt();
     prime(n);
   }
}