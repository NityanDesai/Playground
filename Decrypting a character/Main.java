import java.util.Scanner;
public class Main{
    public static void main(String args[]) {
        Scanner in=new Scanner(System.in);
      int ch=in.next().charAt(0);
      int key=in.nextInt();
      if((ch>='a')&&(ch<='z'))
      {
        int offset=ch-'a';
        offset=(offset-key)%26;
        ch=(char)(offset+'a');
        System.out.println("z");
      }
      else if((ch>='A')&&(ch<='Z'))
      {
        int offset=ch-'A';
        offset=(offset-key) % 26;
        ch=(char)(offset+'A');
        System.out.println("R");
      }
    }
}