class Solution {
    public void moveZeroes(int[] arr) {
        int n = arr.length;
        int i =0;
        int j =0;

        while(i<n){
            
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] =  temp;
                j++;
            }

            i++;

        }
    }
}