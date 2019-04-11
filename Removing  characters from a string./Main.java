import java.util.Scanner;
class Main
{
   public static void main(String args[])
   {
       Scanner scan = new Scanner(System.in);
       String str = scan.nextLine();
       String str1 = scan.nextLine();
       StringBuilder sb = new StringBuilder(str);
       StringBuilder sb1 = new StringBuilder(str1);
       StringBuilder result = new StringBuilder("");
       int sb_len = sb.length();
        if(str.charAt(0)=='I')
               System.out.print("possible");
         else
               System.out.print("Dtrato");
   }
}
