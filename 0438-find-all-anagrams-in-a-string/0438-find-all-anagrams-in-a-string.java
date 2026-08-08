class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> l=new ArrayList<>();
     //brute force appraches which not satisifes all the conditions .
        // int t=0;
        // for(int i=0;i<p.length();i++){
        //     char ch =p.charAt(i);
        //     t+=(int)ch;
        // }
        // int c=0;
        // for(int i=0;i<p.length();i++){
        //     char cha=s.charAt(i);
        //     c+=(int)cha;
        // }
        // if(t==c){
        //     l.add(0);
        // }
        // int k=p.length();
        //  for(int i=k;i<s.length();i++){
        //     char charr=s.charAt(i);
        //     char chh=s.charAt(i-k);
        //     c+=(int)charr;
        //     c-=(int)chh;
        //     if(t==c){
        //         l.add(i-k+1);
        //     }
        // }
        // return l;
if(p.length()>s.length()){
    return l;
}
int pfreq[]=new int[26];
int windfreq[]=new int[26];
for(int i=0;i<p.length();i++){
    char ch=p.charAt(i);
    pfreq[ch-'a']++;
    windfreq[s.charAt(i)-'a']++;

}
if(Arrays.equals(pfreq,windfreq)){
    l.add(0);
}
int k=p.length();
for(int i=k;i<s.length();i++){
      windfreq[s.charAt(i)-'a']++;
            windfreq[s.charAt(i-k)-'a']--;
if(Arrays.equals(pfreq,windfreq)){
    l.add(i-k+1);
}

}
return l;
    }
}