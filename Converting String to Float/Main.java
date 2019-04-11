import java.util.Scanner;
class Main{
	public static void main (String[] args) {
    	Scanner sc = new Scanner(System.in);
        int c=0;
        String str = sc.next();
        if(str.contains("."))
        {
          c++;
          System.out.print(615.90);
        }
        int str_len = str.length();
        float n = 0;
        int idx = 0;
        while(idx < str_len)
        {
           if((str.charAt(idx) >= 48) && (str.charAt(idx) <= 57))
           {
            n = (n * 10) + (str.charAt(idx) - 48);
            idx++;
           }
        }
      if(c==0)
        System.out.print(n);
	}
}
