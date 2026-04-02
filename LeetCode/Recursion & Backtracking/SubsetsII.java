class Solution {
    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> subsetsWithDup(int[] nums) {

        Arrays.sort(nums);  

        List<Integer> list = new ArrayList<>();
        generate(list, nums, 0);
        return res;
    }

    public void generate(List<Integer> list, int[] nums, int index) {

        if (index == nums.length) {
            res.add(new ArrayList<>(list));
            return;
        }

        // include
        list.add(nums[index]);
        generate(list, nums, index + 1);

        // backtrack
        list.remove(list.size() - 1);

        // skip duplicates
        int idx = index + 1;
        while (idx < nums.length && nums[index] == nums[idx]) {
            idx++;
        }

        // skip
        generate(list, nums, idx);
    }
}
