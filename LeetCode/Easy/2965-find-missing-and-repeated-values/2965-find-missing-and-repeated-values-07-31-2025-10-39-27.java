class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        HashMap <Integer,Integer> map = new HashMap<>();
        int n = grid.length* grid.length;
        for(int []arr :grid){
            for(int val: arr){
                if(map.containsKey(val)){
                    map.put(val,map.get(val)+1);
                }
                else{
                    map.put(val,1);
                }
            }
        }
        int [] ans = new int[2];
        ans[0] =-1;
        ans[1] = -1;
        for (int i = 1; i <= n; i++) {
            if (map.containsKey(i)) {
                if (map.get(i) == 2) { 
                    ans[0] = i;
                }
            } else {
                ans[1] = i; 
            }
        }

        return ans;
    }
}