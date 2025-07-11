class Solution {
    maximumSumSubarray(arr, k) {
        
        if (arr.length < k) return 0;

        let sum = 0;
        for (let i = 0; i < k; i++) {
            sum += arr[i]; // only sum first k elements
        }

        let ans = sum;
        let i = 0;
        let j = k;

        while (j < arr.length) {
            sum -= arr[i];    // remove leftmost
            sum += arr[j];    // add new rightmost
            ans = Math.max(ans, sum);
            i++;
            j++;
        }

        return ans;
    }
}
