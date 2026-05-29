class Solution {
    public int[] topKFrequent(int[] nums, int k) {
     HashMap <Integer ,Integer > map = new HashMap<>();
     for(int num :nums){
        if(map.containsKey(num)){
            map.put(num , map.get(num)+1);
        }else{
            map.put(num  , 1 );
        }
     }   

    PriorityQueue<Integer> sort =  new PriorityQueue<>((a,b)->map.get(a)- map.get(b));
int [] ans = new int [k];
for(int i:map.keySet()){
     sort.add(i);
 
     if(sort.size()>k){
        sort.poll();
     }

         
     }

for(int i =0 ;i < k ; i++){
    ans[i] = sort.poll();
}

return ans ;
    }
}
