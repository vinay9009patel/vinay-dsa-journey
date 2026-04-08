import java.util.*;

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
          
        int n1 = nums1.length;
        int arr[] = new int[n1];
        int n2 = nums2.length;
        int i = 0;
        while (i< n1) {
            int target = nums1[i];
        int j = 0;
 
                while (j < n2  && nums2[j] !=target) {
                    j++;
                }

                int nextGreater=-1;

                    j++;
                    while (j < n2) {
                      if(nums2[j]>target){
                        nextGreater  =nums2[j];
                      break;    
                      } 
                      j++;
                    }

                       arr[i]=nextGreater;
                        i++;
                        

        }
        return arr;
    }
}
