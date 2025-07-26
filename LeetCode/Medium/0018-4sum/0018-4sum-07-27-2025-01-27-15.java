class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < nums.length - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue; // Skip duplicates for the first number

            for (int j = i + 1; j < nums.length - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1])
                    continue; // Skip duplicates for the second number

                int l = j + 1;
                int m = nums.length - 1;

                while (l < m) {
                    long sum = (long) nums[i] + nums[j] + nums[l] + nums[m]; // Use long to avoid overflow
                    if (sum > target) {
                        m--;
                    } else if (sum < target) {
                        l++;
                    } else {
                        ans.add(Arrays.asList(nums[i], nums[j], nums[l], nums[m]));
                        l++;
                        m--;
                        while (l < m && nums[l] == nums[l - 1])
                            l++; // Skip duplicates for the third number
                        while (l < m && nums[m] == nums[m + 1])
                            m--; // Skip duplicates for the fourth number
                    }
                }
            }
        }
        return ans;
    }
}