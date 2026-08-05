class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> map=new HashMap<>();
        char[] s1=s.toCharArray();
        char[] t1=t.toCharArray();
        if(s1.length!=t1.length) return false;
        for(int i=0;i<s1.length;i++){
            map.put(s1[i],map.getOrDefault(s1[i],0)+1);
        }
        for(int j=0;j<t1.length;j++){
            char ch=t1[j];
            if (map.getOrDefault(ch, 0) == 0) {
                return false;
            }
            map.put(ch, map.get(ch) - 1);
        }
        return true;
    }
}
