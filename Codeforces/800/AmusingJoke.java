import java.util.*;
public class AmusingJoke {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
       String  g = sc .nextLine();  
       String  h = sc .nextLine();  
       String  p = sc .nextLine();  
      String combined = g+h ;

       char ch1[] =  combined.toCharArray();
       char ch2[] =  p.toCharArray();
Arrays.sort(ch1);
Arrays.sort(ch2);
       String s1 = new String(ch1);    
       String s2 = new String(ch2);
       if(s1.equals(s2))System.out.println("YES");    
       else System.out.println("NO");    
    }
}
