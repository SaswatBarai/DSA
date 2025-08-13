class Solution {
    public int aggressiveCows(int[] stalls, int k) {
        // code here
        
        Arrays.sort(stalls);
        int n = stalls.length;
        int start = 0;
        int end =  stalls[n-1] - stalls[0];
        int ans = -1;
        
        while(start <= end ){
            int mid = start + (end-start)/2;
            
            int count = 1;
            int position = stalls[0];
            
            for(int i = 1; i<n; i++){
                
                
                if(position + mid <= stalls[i]){
                    count++;
                    position = stalls[i];
                }
            }
            
            
            if(count < k){
                end = mid -1;
            }
            else{
                // count >= k
                ans = mid;
                start = mid +1;
            }
            
        }
        
        return ans;
    }
}