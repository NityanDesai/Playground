import java.util.*;
class Main{
  public static int factorial(int n)
  {
    if (n== 0 || n == 1)
    {
        return 1;
    }
    else
    {
         return(n * factorial(n - 1));
    }
  }
	public static void main (String[] args) {
	  Scanner in = new Scanner(System.in);
	  int n = in.nextInt();
      int f=factorial(n);
      System.out.println(f);
    }
}