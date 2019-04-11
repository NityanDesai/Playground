import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
      int n=in.nextInt();
      int first_dig=n/100;
      int second_dig=(n/10)%10;
      int last_dig=n%10;
      int f1=1,f2=1,f3=1;
      for(int i=1;i<=first_dig;i++)
        f1=f1*i;
      for(int i=1;i<=second_dig;i++)
        f2=f2*i;
      for(int i=1;i<=last_dig;i++)
        f3=f3*i;
      int ans=f1+f2+f3;
      if(ans==n)
        System.out.print("Yes");
      else
        System.out.print("No");
	}
}