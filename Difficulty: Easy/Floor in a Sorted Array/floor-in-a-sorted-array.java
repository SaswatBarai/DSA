

class Solution {
    public int findFloor(int[] arr, int target) {
        int start = 0, end = arr.length - 1;
        
        if(arr[0] > target){
            return -1;
        }
        
        while(start <= end){
            
            int mid = start + (end-start)/2;
            
            if(arr[mid] == target){
                
                start = mid+1;
            }
            else if(arr[mid]  > target){
                end = mid -1;
            }
            else{
                start = mid+1;
            }
            
        }
        
        return end;
    }
}
