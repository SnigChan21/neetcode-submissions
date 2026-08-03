class Solution {
    public int maxArea(int[] heights) {
        int left=0;
        int right=heights.length-1;
        int maxarea=0;
        int area=0;
        while(left<right){
            if(heights[left]<heights[right]){
                area=heights[left]*(right-left);
                maxarea=Math.max(area,maxarea);
                left++;
            }
            else{
                area=heights[right]*(right-left);
                maxarea=Math.max(area,maxarea);
                right--;
            }
        }
        return maxarea;
    }
}
