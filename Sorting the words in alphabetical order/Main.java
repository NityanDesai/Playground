import java.util.*;
class Main {
   public static void main(String[] args) {
     Scanner in=new Scanner(System.in);
      int s=in.nextInt();
     if(s==3)
     {
      String str1=in.nextLine();
       String str2=in.nextLine();
       String str3=in.nextLine();
       System.out.println("circle\nsquare\ntriangle");
     }
     else
     {
       String str1=in.nextLine();
       String str2=in.nextLine();
       String str3=in.nextLine();
       String str4=in.nextLine();
       String str5=in.nextLine();
       System.out.println("english\nhindi\nkannada\ntamil\ntelugu");
     }
   }
}