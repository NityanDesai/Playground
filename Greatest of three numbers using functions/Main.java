import java.util.Scanner;
class Main{
  public static int largest(int n1,int n2,int n3)
  {
    return(((n1>n2)&&(n1>n3))?n1:((n2>n3)?n2:n3));
  }
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
      int n1=in.nextInt();
      int n2=in.nextInt();
      int n3=in.nextInt();
      System.out.print(largest(n1,n2,n3));
	}
}