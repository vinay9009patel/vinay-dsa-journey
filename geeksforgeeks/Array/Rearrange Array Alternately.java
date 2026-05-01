import java.util.*;
class Solution {
    public void rearrange(int arr[]) {
        // code here
        
 
        int n = arr.length;
        int res[] = new int[n];
 Arrays.sort(arr);
        int start = 0;
        int end = n - 1;
        int idx = 0;

        while (start <= end) {
            if (idx < n) {
                res[idx++] = arr[end--]; 
            }
            if (idx < n) {
                res[idx++] = arr[start++];  
            }
        }

        for (int i = 0; i < n; i++) {
            arr[i] = res[i];
        }
    }
}
