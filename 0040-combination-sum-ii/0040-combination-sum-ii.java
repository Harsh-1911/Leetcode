class Solution {
    public void findCombination(int index ,int arr[],int target,List<List<Integer>> answer,List<Integer> ds){
        if(target == 0){
            answer.add(new ArrayList<>(ds));
            return;
        }
        for(int i =index ;i<arr.length;i++){
            if(i > index && arr[i]==arr[i-1]){
                continue;
            }
            if(arr[i]>target){
                break;
            }
            ds.add(arr[i]);
            findCombination(i+1,arr,target-arr[i],answer,ds);
            ds.remove(ds.size()-1);

        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> answer  = new ArrayList<>();
        Arrays.sort(candidates);
        findCombination(0,candidates,target,answer,new ArrayList<>());
        return answer;

        
    }
}