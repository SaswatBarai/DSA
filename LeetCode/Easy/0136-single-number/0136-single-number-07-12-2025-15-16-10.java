class Solution {
    public int singleNumber(int[] nums) {
        HashMap <Integer,Integer> map = new HashMap<>();

        for(int val : nums){
            if(map.containsKey(val)){
                map.put(val,map.get(val)+1);
            }
            else{
                map.put(val,1);
            }
        }

        for(int key : map.keySet()){
            if(map.get(key) == 1){
                return key;
            }
        }

        return -1;

    }
}