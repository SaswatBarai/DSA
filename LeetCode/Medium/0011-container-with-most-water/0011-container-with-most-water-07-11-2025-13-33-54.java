class Solution {
    public int maxArea(int[] arr) {
        int n = arr.length;
        int l=0;
        int r=n-1;

        int area =0;
        while(l<r){
            int h = Math.min(arr[l],arr[r]);
            int w = r-l;
            area = Math.max(area,h*w);
            if(arr[l]<arr[r]){
                l++;
            }
            else if(arr[l]> arr[r]){
                r--;
            }
            else{
                l++;
                r--;
            }
        }

        return area;
        
    }
}