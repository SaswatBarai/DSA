class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int c1 = 0, c2 = 0;
        Integer el1 = null, el2 = null;
        int n = nums.length;
        int threshold = n / 3;

        for (int val : nums) {
            if (el1 != null && el1 == val) {
                c1++;
            } else if (el2 != null && el2 == val) {
                c2++;
            } else if (c1 == 0) {
                el1 = val;
                c1 = 1;
            } else if (c2 == 0) {
                el2 = val;
                c2 = 1;
            } else {
                c1--;
                c2--;
            }
        }

        c1 = 0;
        c2 = 0;
        for (int val : nums) {
            if (el1 != null && val == el1) c1++;
            else if (el2 != null && val == el2) c2++;
        }

        List<Integer> ans = new ArrayList<>();
        if (c1 > threshold) ans.add(el1);
        if (c2 > threshold) ans.add(el2);

        return ans;
    }
}
