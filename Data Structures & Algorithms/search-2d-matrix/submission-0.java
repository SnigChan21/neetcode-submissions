class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows=matrix.length, columns=matrix[0].length;
        int l=0,r=rows*columns-1;
        while(l<=r){
            int m=l+(r-l)/2;
            int row=m/columns,col=m%columns;
            if(target>matrix[row][col]){
                l=m+1;
            }
            else if(target<matrix[row][col]){
                r=m-1;
            }
            else{
                return true;
            }
        }
        return false;
    }
}
