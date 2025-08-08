class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int result[]= new int[nums.length];
        Arrays.fill(result,-1);
        Stack<Integer> st = new Stack<>();
        for (int i =0;i<2*n;i++){
            int currentindex = i%n;
            int currentnums=nums[currentindex];
            while(!st.isEmpty()&&nums[st.peek()]<currentnums){
                int prev=st.pop();
                result[prev]=currentnums;

            }
            if(i<n){
            st.push(currentindex);

        }
        

        }
        return result;

        
    }
}