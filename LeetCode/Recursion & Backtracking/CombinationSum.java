class Solution {
    
    List<List<Integer>> result = new ArrayList<>();
    
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        solve(nums, target, 0, new ArrayList<>());
        return result;
    }
    
    void solve(int[] nums, int target, int start, List<Integer> temp) {
        
      
        if (target == 0) {
            result.add(new ArrayList<>(temp));
            return;
        }
        
      
        if (target < 0) {
            return;
        }
        
       
        for (int i = start; i < nums.length; i++) {
            temp.add(nums[i]);                       
            solve(nums, target - nums[i], i, temp);
            temp.remove(temp.size() - 1);        
        }
    }
}
