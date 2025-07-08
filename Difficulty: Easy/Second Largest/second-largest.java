class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int largest = Integer.MIN_VALUE;
        int Secondlargest = Integer.MIN_VALUE;
        
        for(int i=0; i<arr.length; i++){
            if(arr[i] > largest) {
                Secondlargest = largest;
                largest = arr[i];
            }
            if(arr[i] > Secondlargest && arr[i] != largest ){
                Secondlargest=arr[i];
            }
        }
        
        if(Secondlargest == Integer.MIN_VALUE){
            return -1;
        }
        
        return Secondlargest;
        
    }
}