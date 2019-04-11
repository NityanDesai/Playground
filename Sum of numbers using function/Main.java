import java.util.Scanner;
class Main{
  public static int sum(int n)
   {
      int s=0;
      for(int i=1;i<=n;i++)
        s=s+i;
      return s;
    }
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
    int n=in.nextInt();
      int s=sum(n);
      System.out.println(s);
	}
}