class Solution {
    public int maxVowels(String s, int k) {
        int co=0;
        for(int i=0;i<k;i++){
            char ch=s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                co++;
            }
        }
        int m=co;
        for(int i=k;i<s.length();i++){
            char cha=s.charAt(i-k);
             if(cha=='a'||cha=='e'||cha=='i'||cha=='o'||cha=='u'){
                co--;
             }
                int curr=s.charAt(i);
                 if(curr=='a'||curr=='e'||curr=='i'||curr=='o'||curr=='u'){
                co++;
            
            }
            m=Math.max(m,co);
        }
return m;
        
    }
}