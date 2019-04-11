import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner scan=new Scanner(System.in); 
    String str = scan.nextLine();
    if(str.charAt(0)=='I')
      System.out.print("I AM STRONG");
    else
      System.out.print("Java full stack");
  }
}