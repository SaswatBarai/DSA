class Solution {
    public void nextPermutation(int[] arr) {
        int x = -1;

        for(int i =1; i<arr.length; i++){
            if(arr[i] < arr[i-1]){
                x=i;
                break;
            }
        }

        if(x==-1){
            reverse(arr,0,arr.length-1);
            return;
        }

        int y = x+1;
        for(int i = y; i<arr.length; i++){
            if(arr[i] > arr[x]){
                y = i;
            }
        }

        swap(arr,x , y);
        reverse(arr,x+1,arr.length-1);

        return;

    }

    static void swap(int [] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void reverse(int arr[],int start, int end ){
        while(start < end ){
            swap(arr,start,end);
            start++;
            end--;
        }
    }
}