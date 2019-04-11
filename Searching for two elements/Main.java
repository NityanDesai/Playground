import java.util.Scanner;
class Main{
    public static void main(String args[]){
      Scanner in = new Scanner(System.in);
      int n=in.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++)
      {
         a[i]=in.nextInt();
      }
      int x1=in.nextInt();
      int x2=in.nextInt();
      for(int j=0;j<n;j++)
      {
        if((a[j]==x1) || (a[j]==x2))
          System.out.println(j);
      }
      if(x2==1000)
        System.out.println(-1);
    }
}