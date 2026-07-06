class Solution {
    String reverse(String s){
        char []arr=s.toCharArray();
        int i=0;
        int j=arr.length-1;
        while(i<j){
            char t=arr[i];
            arr[i]=arr[j];
            arr[j]=t;
            i++;
            j--;
        }
        return new String(arr);

    }
    public String reverseWords(String s) {
        String[]a=s.trim().split("\\s+");
        for(int i=0;i<a.length;i++){
            a[i]=reverse(a[i]);
        }
        return String.join(" ",a);
        
    }
}