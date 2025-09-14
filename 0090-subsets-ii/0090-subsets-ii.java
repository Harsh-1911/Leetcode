class Solution {
    public void function(int index,int[]nums,List<Integer> ds ,List<List<Integer>> answer){
        answer.add(new ArrayList<>(ds));
        for(int i =index ;i<nums.length;i++){
            if(i!=index && nums[i]==nums[i-1]){
                continue;
            }
            ds.add(nums[i]);
            function(i+1,nums,ds,answer);
            ds.remove(ds.size()-1);
            
            

        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> answer = new ArrayList<>();
                    function(0,nums,new ArrayList<>(),answer);
                    return answer;



        
    }
}