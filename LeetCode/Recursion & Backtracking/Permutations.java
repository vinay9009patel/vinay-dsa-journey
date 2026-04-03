class Solution {
    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        boolean[] used = new boolean[nums.length];

        generate(list, nums, used);
        return res;
    }

    void generate(List<Integer> list, int[] nums, boolean[] used) {
        if (list.size() == nums.length) {
            res.add(new ArrayList<>(list));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (used[i])
                continue;
            list.add(nums[i]);
            used[i] = true;
            generate(list, nums, used);
            list.remove(list.size() - 1);
            used[i] = false;

        }

    }
}
