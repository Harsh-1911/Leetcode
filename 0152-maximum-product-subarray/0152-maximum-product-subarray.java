class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int result = nums[0];
        int prod =1;
        for(int i =0;i<n;i++){
            prod  = prod * nums[i];
            result = Math.max(result,prod);
             if (prod == 0) prod = 1;
        }
        prod =1;
        for(int i =n-1;i>=0;i--){
            prod  = prod * nums[i];
            result = Math.max(result,prod);
             if (prod == 0) prod = 1;
        }
        return result;
        
    }
}
 