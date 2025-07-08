class Solution {
    public int removeDuplicates(int[] nums) {
        int temp[] = new int[nums.length];
        int j = 0;
        temp[0] = nums[0];
        for(int i =0; i<nums.length; i++)
        {
            if(temp[j] != nums[i])
            {
                j++;
                temp[j] = nums[i];
            }
        }
        for(int i = 0; i<nums.length; i++)
        {
            nums[i] = temp[i];
        }
        return j+1;
    }
}