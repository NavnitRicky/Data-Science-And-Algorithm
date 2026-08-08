class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> hs=new HashSet<>();
        int left=0;
        int m=0;
        for(int i=0;i<s.length();i++){
            while(hs.contains(s.charAt(i))){
            hs.remove(s.charAt(left));
            left++;
            }
            hs.add(s.charAt(i));
            m=Math.max(m,i-left+1);

        }
        return m;
    }
}