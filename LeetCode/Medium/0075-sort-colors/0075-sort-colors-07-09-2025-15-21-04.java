class Solution {
    public void sortColors(int[] arr) {
        int i = 0;
        int l = 0;
        int r = arr.length - 1;

        while (i <= r) {
            if (arr[i] == 0) {
                swap(arr, i, l);
                l++;
                i++;
            } else if (arr[i] == 1) {
                i++;
            } else { // arr[i] == 2
                swap(arr, i, r);
                r--;
                
            }
        }
    }

    void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
