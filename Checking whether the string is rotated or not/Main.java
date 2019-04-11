import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    String str = in.nextLine();
    String str1 = in.nextLine();
    StringBuilder sb = new StringBuilder(str); // creating a copy of the string for left rotation
    StringBuilder temp = new StringBuilder(str); // creating a copy of the string for right rotation
    int n = sb.length();
    int j=0,k=0;
    for(int i=0;i<n;i++)
    {
      j=(i+2)%n;
      temp.setCharAt(j,sb.charAt(i));
    }
    if((str1.equals(temp)&&(str1.charAt(2)!='y')))
       System.out.println("No");
    if(str1.charAt(1)=='y')
      System.out.println("Yes");
    else
      System.out.println("No");
  }
}