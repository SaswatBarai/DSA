class Solution {
    // Function to sort the array using bubble sort algorithm.
    public static void bubbleSort(int arr[]) {
        // code here
        
        boolean swapped = false;
        
        for(int i = arr.length-1; i>0; i--){
            
            swapped = false;
            
            for(int j = 0; j<=i-1; j++){
                if(arr[j] > arr[j+1]){
                    
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                    
                }
            }
            
            if(!swapped){
                break;
            }
        }
        
    }
}