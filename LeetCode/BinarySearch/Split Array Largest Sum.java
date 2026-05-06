class Solution {

    public int splitArray(int[] nums, int k) {

        int low = 0, high = 0;

        // search space
        for (int num : nums) {

            low = Math.max(low, num); // min answer =>max single element of array
            high += num; // max answer which is sum of all elements
        }

        // binary search
        while (low < high) {

            int mid = low + (high - low) / 2; // possible ans

            // valid split
            if (isSatisfyCondition(nums, mid, k)) { //if codition satisfy

                high = mid; // smaller ans

            } else {

                low = mid + 1; // bigger ans
            }
        }

        return low; // final ans
    }

    boolean isSatisfyCondition(int[] nums, int mid, int k) {

        int subarrayCount = 1;
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {

            // same subarray
            if (sum + nums[i] <= mid) {

                sum += nums[i];

            } else {

                subarrayCount++; // new subarray
                sum = nums[i]; // reset
            }
        }

        return subarrayCount <= k; // possible?
    }
}
