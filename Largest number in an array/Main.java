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
      int max = a[0];
      for(int j=0;j<n;j++)
      {
        if(a[j]>max)
          max=a[j];
      }
      System.out.println(max);
    }
}