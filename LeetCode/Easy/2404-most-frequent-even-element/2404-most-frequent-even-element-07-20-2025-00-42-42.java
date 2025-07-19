class Solution {
    public int mostFrequentEven(int[] nums) {
        LinkedHashMap<Integer,Integer> map = new LinkedHashMap<>();

        for (int val : nums) {

            if (val % 2 == 0) {
                if (map.containsKey(val)) {
                    map.put(val, map.get(val) + 1);
                }

                else {
                    map.put(val, 1);
                }
            }
        }

        if(map.isEmpty()){
            return -1;
        }

        int max = Integer.MIN_VALUE;
        int ans = -1;

        for(int key : map.keySet()){
            int frq = map.get(key);
            if(max < frq){
                max = frq;
                ans = key;
            }
            else if (frq == max && key < ans) {
                ans = key;
            }
        }

        return ans;

    }
}