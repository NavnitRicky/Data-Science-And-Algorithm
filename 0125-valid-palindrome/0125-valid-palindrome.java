class Solution {
    public boolean isPalindrome(String s) {
s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
if(s.length()==0||s.length()==1) return true;
 int i=0;
 int j=s.length()-1;
 while(i<j){
    if(s.charAt(i)!=s.charAt(j)){
        return false;
    }
    else{
        i++;
        j--;
    }
 }
return true;
        
    }
}