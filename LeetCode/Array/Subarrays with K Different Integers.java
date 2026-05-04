class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return atMost(nums, k) - atMost(nums, k - 1);
    }

    int atMost(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int left = 0, countSubArray = 0;

        for (int right = 0; right < nums.length; right++) { //expand

            if (map.containsKey(nums[right])) {  //add element and increase freq
                map.put(nums[right], map.get(nums[right]) + 1);
            } else {
                map.put(nums[right], 1);
            }

            if (map.get(nums[right]) == 1) k--;      //decrease k;

            while (k < 0) {    //shrink
                map.put(nums[left], map.get(nums[left]) - 1); //increase k;

                if (map.get(nums[left]) == 0) k++;

                left++;
            }

            countSubArray += (right - left + 1);//subarray count 
        }

        return countSubArray;
    }
}
