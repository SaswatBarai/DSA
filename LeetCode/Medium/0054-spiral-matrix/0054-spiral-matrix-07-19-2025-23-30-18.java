class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length -1;//no of rows
        int n = matrix[0].length-1; // no of cols
        int left = 0;
        int right = n;
        int top = 0;
        int bottom = m;
        ArrayList<Integer> ans = new ArrayList<>();

        while(left <= right && top <= bottom){
            
            for(int i = left; i<=right; i++){
                ans.add(matrix[top][i]);
            }
            top++;

            for(int i=top; i<= bottom; i++){
                ans.add(matrix[i][right]);
            }
            right--;

            if(top <= bottom){
                for(int i = right; i>= left; i--){
                    ans.add(matrix[bottom][i]);
                }
            }
            bottom--;

            if(left <= right){
                for(int i =bottom; i>=top; i-- ){
                    ans.add(matrix[i][left]);
                }
                left++;
            }
        }

        return ans;
    }
}