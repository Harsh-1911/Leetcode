class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        HashMap<Integer,Integer> m = new HashMap<>();
        for(int i =0;i<n;i++){
            int complement = target -nums[i];
            if(m.containsKey(complement)){
                return new int []{m.get(complement),i};

            
            }
            else {
                m.put(nums[i],i);

            }
        }
        return new int[]{-1,-1};

        
        
    }
}