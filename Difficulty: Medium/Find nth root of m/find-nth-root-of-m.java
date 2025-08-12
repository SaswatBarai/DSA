class Solution {
    public int nthRoot(int n, int m) {
        int start = 1;
        int end = m;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            long midPower = power(mid, n); // Avoid overflow by using long

            if (midPower == m) {
                return mid; // Found exact root
            } 
            else if (midPower < m) {
                start = mid + 1;
            } 
            else {
                end = mid - 1;
            }
        }

        return -1; // No integer root found
    }
    private long power(int base, int exp) {
        long result = 1;
        for (int i = 0; i < exp; i++) {
            result *= base;
            if (result > Integer.MAX_VALUE) break; // Early stop if overflow
        }
        return result;
    }
}
