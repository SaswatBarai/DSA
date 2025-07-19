class Solution {
    public int subarraySum(int[] arr, int k) {
        HashMap <Integer,Integer> map = new HashMap<>();
        int sum = 0;
        int count = 0;
        for(int i = 0; i<arr.length; i++){
            sum = sum + arr[i];
            if(sum == k){
                count++;
            }

            int rem = sum-k;
            if(map.containsKey(rem)){
                count += map.get(rem);
            }

            map.put(sum,map.getOrDefault(sum,0)+1);
           
        }

        return count;
    }
}