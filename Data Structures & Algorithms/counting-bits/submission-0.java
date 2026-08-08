class Solution {
    public int[] countBits(int n) {
        int[] j=new int[n+1];
        for(int i=0;i<=n;i++){
            int cnt=0;
            int num=i;
            while(num>0){
                if((num&1)==1) cnt++;
                num>>=1;
            }
            j[i]=cnt;
        }
        return j;
    }
}
