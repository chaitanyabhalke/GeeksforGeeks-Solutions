class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l=1;
        int r=-1;
        int res=-1;;

        for(int i=0; i<piles.length; i++){
            r=Math.max(r,piles[i]);
        }

        while(l<=r){
            int m=l+(r-l)/2;

            long hrNeed=0;

            for(int i=0; i<piles.length; i++){
                hrNeed=hrNeed+(long)Math.ceil((double)piles[i]/m);
            }

            if(hrNeed>h){
                l=m+1;
            }
            else{
                res=m;
                r=m-1;
            }
        }

        return res;
    }
}