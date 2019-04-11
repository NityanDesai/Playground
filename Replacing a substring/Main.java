import java.util.Scanner;
class Main{
	public static void main(String[] args) 
  	{ 
      Scanner in = new Scanner(System.in);
    String str = in.nextLine();
    String sub = in.nextLine();
    String rep = in.nextLine();
    System.out.print(str.replace(sub,rep));
    }
}