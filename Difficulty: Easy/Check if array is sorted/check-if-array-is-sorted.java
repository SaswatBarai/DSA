class Solution {
    public boolean arraySortedOrNot(int[] arr) {
        // code here
        boolean checked =true;
        
        for(int i=0; i< arr.length-1; i++){
            if(arr[i] <= arr[i+1]){
                continue;
            }
            else{
                checked = false;
            }
        }
        
        return checked;
    }
}