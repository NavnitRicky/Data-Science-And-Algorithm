class Solution {
    public double findMaxAverage(int[] arr, int k) {
        int sum =0;

        for(int i=0;i<k;i++){
            sum+=arr[i];

        }
        int l=0;
        int r=k;
        int max=sum;
        while(r<=arr.length-1){
            sum-=arr[l];
            l++;
            sum+=arr[r];
            r++;
         max=Math.max(max,sum);

        }
        return (double)max/k;
        
    }
}