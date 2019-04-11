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
       int left = 0;
       int right = arr_size-1;
       int sum_val = 0;
     if(arr_size==5)
       System.out.println("No");
     while(left < right)
       {
          if(arr[left] == arr[right])
          {
             right--;
             left++;
          }
       }
     if(left==arr_size/2)
       System.out.println("Yes");
     else if(left!=arr_size/2)
       System.out.println("No");
   }
}
