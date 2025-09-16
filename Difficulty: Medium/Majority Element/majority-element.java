class Solution {
    int majorityElement(int arr[]) {
        // code here
        int el = 0;
        int cn = 0;
        int n = arr.length;
        int threshold =n/2;
        
        for(int i =0; i<arr.length; i++){
            
            if(cn == 0){
                cn++;
                el = arr[i];
            }
            
            else if(el == arr[i]){
                cn ++;
            }
            else{
                cn --;
            }
        }
        cn =0;
        
        for(int i =0; i<n; i++){
            if(arr[i] == el){
                cn ++;
            }
        }
        
        if(cn >threshold){
            return el;
        }
        
        return -1;
    }
}