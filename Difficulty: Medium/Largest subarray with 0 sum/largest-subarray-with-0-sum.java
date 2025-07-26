class Solution {
    int maxLength(int arr[]) {
        int n = arr.length;
        int k = 0;

        HashMap<Long, Integer> map = new HashMap<>();

        long sum = 0L;
        int max = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];

            if (sum == k) {
                max = Math.max(max, i + 1);
            }

            long rem = sum - k;

            if (map.containsKey(rem)) {
                int length = i - map.get(rem);
                max = Math.max(max, length);
            }

            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }

        return max;
    }
}