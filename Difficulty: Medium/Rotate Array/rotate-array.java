class Solution {
    static void rotateArr(int arr[], int d) {
        int n = arr.length;
        d = d % n; 
        int[] temp = new int[n];

        for (int i = 0; i < n; i++) {
            int newIndex = (i + (n - d)) % n;
            temp[newIndex] = arr[i];
        }

       
        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
    }
}
