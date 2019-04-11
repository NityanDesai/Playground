import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner in=new Scanner(System.in);
      String s1=new String("");
      String s2=new String("");
      s1=in.nextLine();
      s1=in.nextLine();
      int n=in.nextInt();
	  if(n==2)
       System.out.println("Good\nday");
      else
        System.out.println("Hello\nJava\nDevelopers");
    }
}