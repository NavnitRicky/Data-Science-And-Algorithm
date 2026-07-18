class Solution {
    public int removeDuplicates(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(!set.contains(nums[i])){
                set.add(nums[i]);
                nums[c]=nums[i];
                c++;
            }
        }
        return c;
    }
}