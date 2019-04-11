import java.util.Scanner;
class Main
{
   public static void main(String args[])
   {
       Scanner scan = new Scanner(System.in);
       String str = scan.nextLine();
       StringBuilder sb = new StringBuilder(str);
       StringBuilder result = new StringBuilder("");
       int sb_len = sb.length();
       for(int index = 0; index <= sb_len - 1; index++)
       {
        if((sb.charAt(index) == 'a')||(sb.charAt(index) == 'e')||(sb.charAt(index) == 'i')||(sb.charAt(index) == 'o')||(sb.charAt(index) == 'u'))
        {
               result.append(sb.charAt(index+1));
               index++;
         }
         else
           {
               result.append(sb.charAt(index));
           }
       }
       System.out.print(result);
   }
}