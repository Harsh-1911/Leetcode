class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int maxcount =0;
        int Currentcount =0;
        for(int i =0;i<n;i++){
            if(nums[i]==1){
                Currentcount++;
                maxcount = Math.max(maxcount ,Currentcount );

            }
            else {
                Currentcount=0;
            }
        }
        return maxcount;
        
    }
}