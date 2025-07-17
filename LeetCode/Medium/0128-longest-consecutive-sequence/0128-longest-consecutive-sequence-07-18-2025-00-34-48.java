class Solution {
    public int longestConsecutive(int[] arr) {

        int n = arr.length;

        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        HashSet<Integer> set = new HashSet<>();
        for (int val : arr) {
            set.add(val);
        }

        int max = 0;
        for (int val : arr) {
            if (!set.contains(val - 1)) {
                int x = val;
                int count = 1;
                while (true) {
                    if (!set.contains(x + 1)) {
                        break;
                    }
                    count++;
                    x++;
                }
            max = Math.max(max, count);
            }

        }

        return max;
    }
}