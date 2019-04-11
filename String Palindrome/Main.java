import java.util.*;
 
class Main
{
   public static void main(String args[])
   {
      Scanner in = new Scanner(System.in);
      String str = in.nextLine();
      int len = str.length();
      String rev="";
      for (int i = len - 1; i >= 0; i--)
         rev = rev + str.charAt(i);
      if (str.equals(rev))
         System.out.println("Yes");
      else
         System.out.println("No");
         
   }
}