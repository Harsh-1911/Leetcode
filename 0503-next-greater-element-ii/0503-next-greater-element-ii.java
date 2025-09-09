class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int result[]= new int [n];
        Stack<Integer> st= new Stack<>(); 
        Arrays.fill(result,-1);
        for(int i =0;i<2*n;i++){
            int currentindex = i%n;
            int currentnum = nums[currentindex];
            while(!st.isEmpty() && nums[st.peek()]<currentnum){
                int prev = st.pop();
                result[prev]=currentnum;
            }
            if(i<n){
                st.push(currentindex);
            }

        }
        return result;
        
    }
}