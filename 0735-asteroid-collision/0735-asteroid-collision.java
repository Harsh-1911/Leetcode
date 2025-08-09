class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        int n =asteroids.length;
        for(int i=0;i<n;i++){
            int asteroid = asteroids[i];
            boolean destroyed=false;
            while (!st.isEmpty()&&st.peek()>0&&asteroid<0){
                if(st.peek()<-asteroid){
                    st.pop();
                    continue;
                }
                else if(st.peek()==-asteroid)
                {
                    st.pop();
                }
                destroyed=true;
                break;
                
            }
            if(!destroyed){
                st.push(asteroid);
            }
        }
         int[] result = new int[st.size()];
        for (int i = st.size() - 1; i >= 0; i--) {
            result[i] = st.pop();
        }
        return result;
        
    }
}