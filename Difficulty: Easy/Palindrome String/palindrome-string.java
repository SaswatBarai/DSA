class Solution {
    boolean isPalindrome(String str) {
        // code here
        
        
        //!Two Pointer Approach 
        int n = str.length();
        int l = 0;
        int r = n-1;
        
        while(l<r){
            if(str.charAt(l) != str.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        
        return true;
    }
}