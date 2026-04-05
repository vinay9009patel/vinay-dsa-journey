class Solution {

   List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combinationSum3(int k, int n) {
          backtracking(k, n, res, new ArrayList<>() ,1) ;
          return res;
       
    }
      void backtracking(int k , int sum , List<List<Integer>> res , List<Integer> list , int start   ){

      if(k==0 && sum==0){
        res.add(new ArrayList<>(list));
        return ;
      }
          if(k<0 ||sum<0) return;

      for(int i= start ; i<=9  ; i++  ){
        list.add(i);
        backtracking(k-1,sum-i,res, list ,i+1);
        list.remove(list.size()-1);
      }

    
      }
}
