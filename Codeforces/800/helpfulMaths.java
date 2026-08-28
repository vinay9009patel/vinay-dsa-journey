import java.util.*;
public class helpfulMaths {
    public static void main(){
        Scanner sc = new Scanner(System.in);
    String s = sc.nextLine().trim();
    List<Integer>li = new ArrayList<>();
    for(int i=0 ;i< s.length(); i++){
        char ch = s.charAt(i) ;
        if(Character.isDigit(ch)){
    li.add(  (int)ch);
      


     }
     
    }
    Arrays.sort(li);
}
}