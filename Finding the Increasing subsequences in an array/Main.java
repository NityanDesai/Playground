import java.util.Scanner;
class Main
{
   public static void main(String args[])
   {
       Scanner sc = new Scanner(System.in);
       int arr_size = sc.nextInt();
       int arr[] = new int[arr_size];
       for(int index = 0; index < arr_size; index++)
       {
           arr[index] = sc.nextInt();
       }
       sub_array(arr_size, arr);
   }
   public static void sub_array(int n, int a[])
   {
       for(int i1=0;i1<n;i1++)
      {
        for(int i2=i1+1;i2<n;i2++)
        {
          if(a[i1]<a[i2])
          System.out.println(a[i1]+","+a[i2]);
        }
       }
   }
}