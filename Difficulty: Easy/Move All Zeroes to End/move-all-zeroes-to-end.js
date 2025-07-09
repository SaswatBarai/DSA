// User function Template for javascript

/**
 * @param {Number[]} arr
 */

class Solution {
    pushZerosToEnd(arr) {
        // code here
        let n = arr.length;
        let start = -1;
        
        for(let j=0; j<n; j++){
            if(arr[j] !=0){
                arr[++start] = arr[j];
            }
        }
        
        
        for(let i = start+1; i<n; i++){
            arr[i] =0;
        }
    }
}