class Solution {
    void nextPermutation(int[] arr) {
        // code here
        int n = arr.length;
        int x = -1;
        for(int i = n-2; i>=0; i--){
            if(arr[i] < arr[i+1]){
                x = i;
                break;
            }
        }
        
        if(x == -1){
            reverse(arr,0,n-1);
            return;
        }
        
        
        for(int i = n-1; i>x; i--){
            if(arr[i] > arr[x]){
                swap(arr,i,x);
                break;
            }
        }
        
        reverse(arr,x+1,n-1);
    }
    
    void reverse(int arr[], int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    
    void swap(int arr[],int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}