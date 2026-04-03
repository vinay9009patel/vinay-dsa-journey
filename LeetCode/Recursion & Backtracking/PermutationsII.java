class Solution {
    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        boolean[] used = new boolean[nums.length];
        backtrack(new ArrayList<>(), nums, used);
        return res;
    }

    void backtrack(List<Integer> list, int[] nums, boolean[] used) {

        if (list.size() == nums.length) {
            res.add(new ArrayList<>(list));
            return;
        }

        for (int i = 0; i < nums.length; i++) {

            // already used → skip
            if (used[i]) continue;

            // duplicate skip
            if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) continue;

            // choose
            list.add(nums[i]);
            used[i] = true;

            // explore
            backtrack(list, nums, used);

            // undo
            list.remove(list.size() - 1);
            used[i] = false;
        }
    }
}
