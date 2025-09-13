class Solution {
     List<List<Integer>> result = new ArrayList<>();
     public void findsubset(int[]nums,int index ,List<Integer>subList){
        if(index == nums.length){
            result.add(new ArrayList<>(subList));
            return  ;

        }
        subList.add(nums[index]);
        findsubset(nums ,index+1,subList);
        subList.remove(subList.size()-1);
         findsubset(nums ,index+1,subList);



     }

    public List<List<Integer>> subsets(int[] nums) {
        findsubset(nums,0,new ArrayList<>());
        return result;
        
    }
}