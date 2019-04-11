import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
	    int choice = in.nextInt();
        switch(choice)
        {
          case 1:
            int l=in.nextInt();
            int ans=l*l;
            System.out.println(ans);
            break;
          case 2:
            int le=in.nextInt();
            int b=in.nextInt();
            ans=le*b;
            System.out.println(ans);
            break;
          case 3:
            int base=in.nextInt();
            int height=in.nextInt();
            ans=(base*height)/2;
            System.out.println(ans);
            break;
          case 4:
            int r=in.nextInt();
            double a=3.14*r*r;
            System.out.println(a);
            break;
        }
    }
}