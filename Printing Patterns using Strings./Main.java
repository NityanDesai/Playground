import java.util.*;
class Main
{
  public static StringBuilder Left_rotate_str(int str_len,StringBuilder sb_l,int no_of_rotations)
  {
    int index;
    for ( int rotation = 1 ; rotation <= no_of_rotations ; rotation++ )
    {
      char temp = sb_l.charAt(0);       
      for( index = 1; index <= str_len-1; index++ )
      {
        sb_l.setCharAt(index - 1,sb_l.charAt(index)); 
      }
      sb_l.setCharAt(index-1, temp);     
    }
    return sb_l;
  }
    public static void main(String args[])
    {
      Scanner scan = new Scanner(System.in);
        String s1 = scan.nextLine();
        StringBuilder s = new StringBuilder(s1);
        int n = s.length();
        s=Left_rotate_str(n,s,n/2);
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n-i-1; j++)
            {
                System.out.print(" ");
            }
            for(int j=0; j<=i; j++)
            { 
               System.out.print(s.charAt(j));
            }
            System.out.println();
        }
    }
}