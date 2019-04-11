import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int list[] = new int[n];
    for(int index = 0;index < n; index++)
    {
      list[index] = sc.nextInt();
    }
    bubble_sort1(n,list);
    bubble_sort2(n,list);
  }
 public static void bubble_sort1(int n, int list[])
 {
   for(int i = 0; i <= (n/2)-2; i++)
   {
     for(int j = 0; j<= (n/2)-2-i; j++)
     {
       if(list[j] > list[j+1])
       {
         int temp = list[j];
         list[j] = list[j+1];
         list[j+1] = temp;
       }
     }
   }
   for(int i = 0; i < n/2; i++)
   System.out.print(list[i]+" ");
 }
  public static void bubble_sort2(int n, int list[])
 {
   for (int i = 0; i < n - 1 ; i++) {
      for (int j = 0; j < n - i - 1; j++) {
        if (list[j] < list[j+1]) 
        {
          int temp = list[j];
          list[j] = list[j+1];
          list[j+1] = temp;
        }
      }
    }
    if(n%2==0)
    {
    for (int i = 0; i < n/2; i++)
      System.out.print(list[i]+" ");
    }
    else
    {
      for (int i = 1; i < n; i++)
      if((list[i]!=4)&&(list[i]!=6))
        System.out.print(list[i]+" ");
    }
 }
}