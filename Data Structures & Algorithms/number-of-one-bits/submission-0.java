class Solution {
    public int hammingWeight(int n) {
        String s=Integer.toBinaryString(n);
        int count=0;
        char[] ch=s.toCharArray();
        for(char c:ch){
            if(c=='1') count++;
        }
        return count;
    }
}
