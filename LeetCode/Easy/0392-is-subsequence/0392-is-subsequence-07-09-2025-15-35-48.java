class Solution {
    public boolean isSubsequence(String str1, String str2) {
        int i = 0;
        int j = 0;
        int count=0;

        while(i<str1.length() && j<str2.length()){
            char val1 = str1.charAt(i);
            char val2 = str2.charAt(j);
            if(val1 == val2){
                count++;
                i++;
            }
            j++;

        }

        return (count == str1.length());
    }
}