class Solution {
    public int missingNumber(int[] nums) {
      int n = nums.length;
      int Rsum = (n*(n+1))/2;
      int sum =0;
      for(int val: nums){
        sum += val;
      }  

      return Rsum - sum;
    }
}