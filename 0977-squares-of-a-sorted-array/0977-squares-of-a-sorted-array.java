class Solution {
    public int[] sortedSquares(int[] nums) {
        //brute force apprach

        // for(int i=0;i<nums.length;i++){
        //     nums[i]=nums[i]*nums[i];
        // }
        // Arrays.sort(nums);
        // return nums;

        //optimal approaches
        int l=0;
        int r=nums.length-1;
        int res[]=new int[nums.length];
        for(int i=nums.length-1;i>=0;i--){
            int lefts=nums[l]*nums[l];
            int rights=nums[r]*nums[r];
            if(lefts<rights){
                res[i]=rights;
                r--;

            }
            else{
                res[i]=lefts;
                l++;
            }
        }
        return res;
        
    }
}