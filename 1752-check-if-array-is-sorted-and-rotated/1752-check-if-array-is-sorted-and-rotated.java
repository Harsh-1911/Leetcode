class Solution {
    public boolean check(int[] nums) {
        int n   = nums.length;
                for(int i =0;i<n-1;i++){
            if(nums[i]>nums[i+1]){
                int x = i+1;
                int j=0;
                while (j<n-1){
                    if(nums[x]>nums[(x+1)%n]){
                        return false;

                    }
                    x=(x+1)%n;
                    j++;

                }
            }
        }
        return true ;
        
    }
}