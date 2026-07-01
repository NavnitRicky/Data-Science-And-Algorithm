class Solution {
    public int gcd(int a ,int b){
        
        while(b!=0){
            int t=b;
             b=a%b;
             a=t;

        }
        return a;


    }
    public int findGCD(int[] nums) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int ele:nums){
            if(ele<min){
                min=ele;
            }
        }
          for(int ele:nums){
            if(ele>max){
                max=ele;
            }
        }
        return gcd(min,max);
        
    }
}