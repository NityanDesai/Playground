import java.util.Scanner;
class Main { 
	public static void main(String[] args){
  		Scanner in = new Scanner(System.in);
  		int n=in.nextInt();
      for(int i=1;i<=n;i++)
      {
        for(int j=1;j<=i;j++)
        {
          if(i==1 || i==4 || i==5)
          {
          if(j%2!=0)
             System.out.print("*");
          else
            System.out.print("#");
          }
          else
          {
            if(j%2!=0)
             System.out.print("#");
          else
            System.out.print("*");
          }
        }
        System.out.print("\n");
      }
    }
}