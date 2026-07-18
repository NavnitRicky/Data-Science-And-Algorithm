class Solution {
    public boolean check(int[] nums) {
        int idx=0;
        for(int i=0;i<nums.length;i++){
              if(nums[i]>nums[(i+1)%nums.length]){
                 idx++;
            
              }
        }
        if(idx>1){
            return false;

        }
        return true;
        
    }
}