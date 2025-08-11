class Solution {
    public boolean search(int[] nums, int target) {
        int pivot = findPivot(nums);
        if(pivot == -1){
            return BS(nums,target,0,nums.length-1);
        }

        if(nums[pivot] == target){
            return true;
        }

        if(nums[0] <= target){
            return BS(nums,target,0,pivot-1);
        }
        
        return BS(nums,target,pivot+1, nums.length-1);
    }


  public int findPivot(int[] arr){
    int start = 0;
    int end = arr.length - 1;

    while(start <= end){
        int mid = start + (end - start) / 2;

        // Case 1: mid element > next element
        if(mid < end && arr[mid] > arr[mid + 1]){
            return mid;
        }

        // Case 2: mid element < prev element
        if(mid > start && arr[mid] < arr[mid - 1]){
            return mid - 1;
        }

        // Case 3: duplicates - shrink boundaries
        if(arr[start] == arr[mid] && arr[mid] == arr[end]){
            if(start < end && arr[start] > arr[start + 1]) return start;
            start++;
            if(end > start && arr[end] < arr[end - 1]) return end - 1;
            end--;
        }
        // Left side sorted → pivot on right
        else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])){
            start = mid + 1;
        }
        else{
            end = mid - 1;
        }
    }
    return -1;
}



    public boolean BS(int [] arr, int target, int start , int end ){
        
        while(start <= end ){
            int mid = start + (end - start)/2;
            
            if(arr[mid] == target){
                return true;
            }
            if(arr[mid] > target){
                end = mid-1;
            }
            if(arr[mid] < target){
                start = mid+1;
            }
        }
        return false;
    }
}