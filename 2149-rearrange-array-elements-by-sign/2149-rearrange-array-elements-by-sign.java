class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> neg=new ArrayList<>();
                ArrayList<Integer> pos=new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                pos.add(nums[i]);
            }
            else{
                neg.add(nums[i]);
            }

        }
        int arr[]=new int[nums.length];
        int k=0;
        for(int i=0;i<pos.size();i++){
            arr[k++]=pos.get(i);
            arr[k++]=neg.get(i);


        }
        return arr;
        
    }
}