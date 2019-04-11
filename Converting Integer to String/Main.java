import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int count=0;
    if(n<0)
    {
      n=n*(-1);
      count++;
    }
    int t = n;
    int c = 0;
    while(n > 0)
    {
        c++;
        n = n/10;
    }
    char str[] = new char[c];
    c--;
    while(t > 0)
    {
      char ch = (char)((t % 10) + '0');
      str[c] = ch;
      t /= 10;
      --c;
    }
    if(count==0)
      System.out.print(str);
    else
    {
      System.out.print("-");
      System.out.print(str);
    }
  }
}
