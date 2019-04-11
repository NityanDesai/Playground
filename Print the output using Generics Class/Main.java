import java.util.*;
public class Main<T>
{
     private T t;
     public void insert(T t) {
       this.t = t;
     }
     public T get() {
       return t;
     }
     public static void main(String[] args)
     {
         Scanner in = new Scanner(System.in);
         Main<Integer> i = new Main<Integer>();
         int num = in.nextInt();
         i.insert(num);
         Main<String> s = new Main<String>();
         String s1 = in.next();
         s.insert(s1);
         Main<Float>  f = new Main<Float>();
         float f1 = in.nextFloat();
         f.insert(f1);
         System.out.println("Integer Value: " + i.get());
         System.out.println("String Value: " + s.get());
         System.out.println("Float value: " + f.get());
    }
}
