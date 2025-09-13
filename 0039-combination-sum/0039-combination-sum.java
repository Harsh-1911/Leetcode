class Solution {
    public void combinesum(int[] candidates, int index ,int target,List<List<Integer>>ans,ArrayList<Integer>combin)
    {
        if(index == candidates.length  || target<0){
            return ;
        }
        if(target==0){
            ans.add(new ArrayList<>(combin));
            return;
        }
        combin.add(candidates[index]);
        // combinesum(candidates,index+1,target-candidates[index],ans,combin);
                combinesum(candidates,index,target-candidates[index],ans,combin);
                combin.remove(combin.size()-1);
                        combinesum(candidates,index+1,target,ans,combin);



    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>>ans =new ArrayList<>();
        ArrayList<Integer>combin= new ArrayList<>();
        combinesum(candidates,0,target, ans,combin);
        return ans;

        
        
    }
}