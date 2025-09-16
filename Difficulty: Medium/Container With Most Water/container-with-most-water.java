class Solution {
    public int maxWater(int arr[]) {
        // Code Here
        int l =0;
        int r = arr.length -1;
        int maxArea = 0;
        while(l<r){
            int w = r-l;
            int h = Math.min(arr[l], arr[r]);
            maxArea = Math.max(maxArea, w*h);
            
            if(arr[l] < arr[r]){
                l++;
            } else {
                r--;
            }
        }
        
        return maxArea;
        
    }
}