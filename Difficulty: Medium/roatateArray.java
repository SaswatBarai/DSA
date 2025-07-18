class Solution {
    // Right Rotation by k
    public void rotateRight(int[] arr, int k) {
        int n = arr.length;
        k = k % n; // in case k > n

        reverse(arr, 0, n - 1);     // Step 1: Reverse whole array
        reverse(arr, 0, k - 1);     // Step 2: Reverse first k elements
        reverse(arr, k, n - 1);     // Step 3: Reverse remaining elements
    }

    // Left Rotation by k
    public void rotateLeft(int[] arr, int k) {
        int n = arr.length;
        k = k % n; // in case k > n

        reverse(arr, 0, k - 1);     // Step 1: Reverse first k elements
        reverse(arr, k, n - 1);     // Step 2: Reverse remaining elements
        reverse(arr, 0, n - 1);     // Step 3: Reverse whole array
    }

    // Common reverse function
    private void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
