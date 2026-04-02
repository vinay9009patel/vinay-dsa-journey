class Solution {
    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> list = new ArrayList<>();
        generate(list, nums, 0);
        return res;
    }

    void generate(List<Integer> list, int[] nums, int index) {
        if (index == nums.length) {
            res.add(new ArrayList<>(list));
            return;
        }
        list.add(nums[index]); //  include 
        generate(list, nums, index + 1); // move forward;

        list.remove(list.size() - 1); //backtracking
        generate(list, nums, index + 1); // move forward by skip;

    }
}
