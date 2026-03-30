class Solution {
    List<List<Integer>> result = new ArrayList<>();
    
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        solve(candidates, target, 0, new ArrayList<>());
        return result;
    }
    
    void solve(int[] arr, int target, int start, List<Integer> temp) {
        if (target == 0) {
            result.add(new ArrayList<>(temp));
            return;
        }
        
        if (target < 0) return;
        
        for (int i = start; i < arr.length; i++) {
            if (i > start && arr[i] == arr[i - 1]) continue;
            if(arr[i]>target) break;
            temp.add(arr[i]);
            solve(arr, target - arr[i], i + 1, temp);
            temp.remove(temp.size() - 1);
        }
    }
}
