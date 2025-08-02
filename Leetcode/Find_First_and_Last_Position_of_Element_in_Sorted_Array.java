class Solution {
    public int[] searchRange(int[] nums, int target) {
        int ans []= {-1,-1};
        ans[0] =findOccurrence(nums,target,true);
        ans[1] =findOccurrence(nums,target,false);

        return ans;
    }

    public int findOccurrence(int arr[],int target, boolean firstOccurrenec){
        int start =  0;
        int end = arr.length-1;
        int ans = -1;

        while(start <= end ){
            int mid = start + (end - start)/2;

            if(arr[mid] == target){
                ans = mid;

                if(firstOccurrenec){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
            else if (arr[mid] > target){
                end = mid -1;
            }
            else{
                start = mid+1;
            }
        }

        return ans ;
    }
}