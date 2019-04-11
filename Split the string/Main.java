import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        Pattern p1 = Pattern.compile("(,| |and|or)");
        String[] parts = p1.split(str);
        for(String p:parts){
            System.out.println(p);
        }
    }
}