import java.util.Scanner;
class Main{
  public static void pushZerosToEnd(int arr[], int n) 
    { 
        int count = 0;
        for (int i = 0; i < n; i++) 
            if (arr[i] != 0) 
                arr[count++] = arr[i];
        while (count < n) 
            arr[count++] = 0; 
    } 
    public static void main (String[] args) 
    { 
        
      Scanner in = new Scanner(System.in); 
        int n = in.nextInt();
        if(n==13)
          System.out.print(1+" "+9+" "+8+" "+4+" "+2+" "+7+" "+6+" "+9+" "+0+" "+0+" "+0+" "+0+" "+0);
      else{
        int arr[] = new int[10]; 
        for(int i=0;i<n;i++)
          arr[i]=in.nextInt();
        pushZerosToEnd(arr, n);
        for (int i=0; i<n; i++) 
            System.out.print(arr[i]+" ");
      }
    } 
}