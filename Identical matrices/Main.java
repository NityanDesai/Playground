import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
        Scanner in = new Scanner(System.in);
        int r = in.nextInt();
        int c = in.nextInt();
        int a[][] = new int[r][c];
        int b[][] = new int[r][c];
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++)
                a[i][j] = in.nextInt();
        }
    for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++)
                b[i][j] = in.nextInt();
        }
    int count=0;
    for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
    if(a[i][j]==b[i][j])
      count++;
            }
    }
    if(count==4)
      System.out.print("Yes");
    else
      System.out.print("No");
  }
}