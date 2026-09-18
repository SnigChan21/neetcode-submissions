class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result=new int[nums.length];
        int post=1,pre=1;
        Arrays.fill(result,1);
        for(int i=0;i<nums.length;i++){
            result[i]=pre;
            pre=nums[i]*pre;
        }
        for(int j=nums.length-1;j>=0;j--){
            result[j]=post*result[j];
            post=nums[j]*post;
        }
        return result;
    }
}  
