// Problem: Peak Index in Mountain Array
// Platform: LeetCode
// Difficulty: Medium
// Link: https://leetcode.com/problems/peak-index-in-a-mountain-array/

// Approach:
// Binary search use kiya
// mid ko mid+1 se compare kiya

class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int s =  0;  int e =arr.length -1 ;
        while ( s<e){
           int mid = (e -s)/2 +s ;
           if (arr[mid] < arr[mid+1]  ){
            s=mid+1;
           }else{
        e= mid ;
           } 
        }
return s;
    }
}
