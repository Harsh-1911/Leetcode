class Solution {
    public void combine(int start,int k,int target ,ArrayList<Integer>combine,List<List<Integer>> answer ){
        if(combine.size()==k && target==0){
            answer.add(new ArrayList<>(combine));
            return ;
        }
        if(combine.size()>k && target<0){
            return;
        }
        for(int i =start;i<=9;i++){
            combine.add(i);
            combine(i+1,k,target-i,combine,answer);
            combine.remove(combine.size()-1);

        }
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> answer = new ArrayList<>();
        combine(1,k,n,new ArrayList<>(),answer);
        return answer;
        
    }
}