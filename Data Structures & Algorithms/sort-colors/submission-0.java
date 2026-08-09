class Solution {
    public void sortColors(int[] nums) {
        int len=nums.length;
        int cnt0=0,cnt1=0,cnt2=0;
        for(int i=0;i<len;i++){
            if(nums[i]==0) cnt0++;
            if(nums[i]==1) cnt1++;
            if(nums[i]==2) cnt2++;
        }
        for(int j=0;j<cnt0;j++){
            nums[j]=0;
        }
        for(int k=cnt0;k<cnt0+cnt1;k++){
            nums[k]=1;
        }
        for(int l=cnt0+cnt1;l<cnt0+cnt1+cnt2;l++){
            nums[l]=2;
        }
    }
}