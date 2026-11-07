class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int m=matrix.length-1;
        int n=matrix[0].length-1;
        int l=matrix[0][0];
        int r=matrix[m][n];

        int res=-1;

        while(l<=r){
            int mid=l+(r-l)/2;

            int row=m;
            int col=0;

            int count=0;

            while(row>=0 && col<=n){
                if(matrix[row][col]<=mid){
                    count=count+row+1;
                    col++;
                }
                else{
                    row--;
                }
            }

            if(count>=k){
                res=mid;
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }

        return res;
    }
}