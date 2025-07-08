class Solution {
    search(arr, x) {
        let ans = -1;

        for(let i =0; i<arr.length; i++){
            if(arr[i] ===x){
                ans = i;
                break;
            }
        }

        return ans;
    }
}
