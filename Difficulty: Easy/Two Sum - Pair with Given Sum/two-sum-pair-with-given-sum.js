class Solution {
    twoSum(arr, target) {
        const seen = new Set();

        for (let num of arr) {
            const complement = target - num;
            if (seen.has(complement)) {
                return true;
            }
            seen.add(num);
        }

        return false;
    }
}
