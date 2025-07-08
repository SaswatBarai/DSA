class Solution {
    public void rotate(int[] arr, int k) {
        int n = arr.length;
        k=k%n;
       // Reverse last k elements
        reverse(arr, n - k, n - 1);
        // Reverse first n-k elements
        reverse(arr, 0, n - k - 1);
        // Reverse entire array
        reverse(arr, 0, n - 1);


    }

   void reverse(int arr[], int start, int end) {
    int n = end - start + 1;
    int mid = n / 2;
    for (int i = 0; i < mid; i++) {
        int temp = arr[start + i];
        arr[start + i] = arr[end - i];
        arr[end - i] = temp;
    }
}
}