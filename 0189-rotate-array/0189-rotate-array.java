class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int[] reverse = new int[n];
        k=k%n;
        for(int i =0;i<n;i++){
            int newindex = (k+i)%n;
            reverse[newindex] =  nums[i];

        }
        for(int i =0;i<n;i++){
            nums[i]=reverse[i];
        }
        
    }
}