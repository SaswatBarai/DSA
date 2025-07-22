class Solution {
    public List<List<Integer>> generate(int n) {
       List<List<Integer>> ans = new ArrayList<>();
       for(int i = 1; i<=n; i++){
        ArrayList<Integer> temp = getAllElement(i);
        ans.add(temp);
       } 
       return ans;
    }

    public static ArrayList<Integer> getAllElement(int n){
        int res = 1;
        ArrayList<Integer>arr = new ArrayList<>();
        arr.add(res);
        for(int i = 1; i<n; i++){
            res = res *(n-i);
            res =  res /i;
            arr.add(res);
        }

        return arr;
    }
}