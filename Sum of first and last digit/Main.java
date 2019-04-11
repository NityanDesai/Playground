import java.util.Scanner;
class Main {
	public static void main (String[] args){
    Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int count=0;
      int m=n;
      int f=0;
      int l=0;
      int sum=0;
      while(n!=0)
      {
        n=n/10;
        count++;
      }
      if(count==4)
        f=m/1000;
      else if(count==5)
        f=m/10000;
      l=m%10;
      sum=f+l;
      System.out.println(sum);
	}
}