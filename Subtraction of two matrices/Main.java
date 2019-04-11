import java.util.Scanner;
class Main{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int row_size = sc.nextInt();
    int column_size = sc.nextInt();
    int matrix1[][] = new int[row_size][column_size];
    int matrix2[][] = new int[row_size][column_size];
    int sub[][] = new int[row_size][column_size];
    for(int i = 0; i <= row_size - 1; i++){
      for(int j = 0; j <= column_size - 1; j++)
      {
        matrix1[i][j] = sc.nextInt();
      }
    }
    for(int i = 0; i <= row_size - 1; i++){
      for(int j = 0; j <= column_size - 1; j++)
      {
        matrix2[i][j] = sc.nextInt();
      }
    }
    for(int i = 0; i <= row_size - 1; i++){
      for(int j = 0; j <= column_size - 1; j++)
      {
        sub[i][j] = matrix1[i][j]-matrix2[i][j];
      }
    }
    for(int i = 0; i <= row_size - 1; i++){
      for(int j = 0; j <= column_size - 1; j++)
      {
        System.out.print(sub[i][j]+" ");
      }
      System.out.print("\n");
    }
  }
}