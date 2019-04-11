import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   Scanner in = new Scanner(System.in);
      int n=in.nextInt();
      int first_dig=n/100;
      int second_dig=(n/10)%10;
      int last_dig=n%10;
      first_dig=first_dig*first_dig*first_dig;
      second_dig=second_dig*second_dig*second_dig;
      last_dig=last_dig*last_dig*last_dig;
      int ans=first_dig+second_dig+last_dig;
      if(n==ans)
        System.out.print("Armstrong Number");
      else
        System.out.print("Not a Armstrong Number");
	}
}