import java.util.*;

class Solution {  
    public Queue<Integer> reverseFirstK(Queue<Integer> q, int k) {  

        Stack<Integer> temp = new Stack<>(); 
        if (k > q.size() ||k<0) return q;

      
        for (int i = 0; i < k; i++) {
            temp.push(q.remove());
        }

       
        while (!temp.isEmpty()) {
            q.add(temp.pop());
        }



              int size =q.size();
              
        for(int i=0 ; i<size-k; i++){
            q.add(q.remove());
        }

        return q ;
    }
}
