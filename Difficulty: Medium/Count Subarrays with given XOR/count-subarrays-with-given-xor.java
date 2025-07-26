class Solution {
    public long subarrayXor(int arr[], int k) {
        // code here
        int n = arr.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        int xr =0;
        // map.put(xr,1);
        int cn =0;
        
        for(int i = 0; i<n; i++){
             xr ^= arr[i];
             
             if(xr == k){
                 cn++;
             }
             
             int x = xr^k;
             
             if(map.containsKey(x)){
                 cn += map.get(x);
             }
             
             if(map.containsKey(xr)){
                 map.put(xr,map.get(xr)+1);
             }
             else{
                 map.put(xr,1);
             }
        }
        
        return cn;
    }
}