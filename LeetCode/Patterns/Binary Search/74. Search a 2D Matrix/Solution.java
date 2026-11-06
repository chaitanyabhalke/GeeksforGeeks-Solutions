class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int p=matrix.length;
        int n=matrix[0].length;

        int l=0;
        int r=p-1;

        int row=0;

        while(l<=r){
            int m=l+(r-l)/2;

            if(target>=matrix[m][0]){
                row=m;
                l=m+1;
            }
            else{
                r=m-1;
            }
        }

        l=0;
        r=n-1;

        while(l<=r){
            int m=l+(r-l)/2;

            if(matrix[row][m]==target){
                return true;
            }
            else if(matrix[row][m]<target){
                l=m+1;
            }
            else{
                r=m-1;
            }
        }

        return false;
    }
}