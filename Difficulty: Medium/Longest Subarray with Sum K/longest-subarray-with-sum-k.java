import java.util.*;

class Solution {
    public int longestSubarray(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int prefixSum = 0;
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];

            // Case 1: Subarray from index 0 to i
            if (prefixSum == k) {
                max = i + 1;
            }

            // Case 2: Subarray with sum k ending at i
            int rem = prefixSum - k;
            if (map.containsKey(rem)) {
                int subarrayLength = i - map.get(rem);
                max = Math.max(max, subarrayLength);
            }

            // Store the first occurrence of each prefix sum
            if (!map.containsKey(prefixSum)) {
                map.put(prefixSum, i);
            }
        }

        return max;
    }
}
