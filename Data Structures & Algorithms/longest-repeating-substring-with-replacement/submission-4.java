class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq=new int[26];
        int maxFreq=0;int left=0;
        int ans=0;
        for(int right=0;right<s.length();right++){
            freq[s.charAt(right)-'A']++;
            maxFreq=Math.max(maxFreq,freq[s.charAt(right)-'A']);
            int window=right-left+1;
            int replacements=window-maxFreq;
            if(replacements>k){
                freq[s.charAt(left)-'A']--;
                left++;
            }
            ans=Math.max(ans,right-left+1);
        }
        return ans;
    }
}
