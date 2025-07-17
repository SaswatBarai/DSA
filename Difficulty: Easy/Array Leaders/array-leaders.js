class Solution {
    // Function to find the leaders in the array.
    leaders(a) {
        let ans = [];
        let n = a.length;

        ans.push(a[n - 1]); // Use push() in JavaScript
        let max = a[n - 1];

        for (let i = n - 2; i >= 0; i--) {
            if (a[i] >= max) {
                max = a[i];
                ans.unshift(a[i]); // unshift() adds to the beginning
            }
        }

        return ans;
    }
}
