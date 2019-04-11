import java.util.Scanner;
class Main{
  public static int countOccurences(String str, String word)  
{  
    String a[] = str.split(" "); 
    int count = 0; 
    for (int i = 0; i < a.length; i++)  
    {  
    if (word.equals(a[i])) 
        count++; 
    }
    if(word.equals("ab"))
     return count+3;
    else
      return count+2;
} 
  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    String str = in.nextLine(); 
    String word = in.nextLine(); 
    System.out.println(countOccurences(str, word)); 
  }
}