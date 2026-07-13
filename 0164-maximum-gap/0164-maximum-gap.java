class Solution {
    public int maximumGap(int[] arr) {
        Arrays.sort(arr);
        int max=0;
        int c=0;
        for(int i=0;i<arr.length-1;i++){
             c=arr[i+1]-arr[i];
             if(c>max){
                max=c;
             }
        }
        return max;
        
    }
}