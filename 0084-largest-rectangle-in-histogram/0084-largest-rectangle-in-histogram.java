class Solution {
    public int [] nextsmallerLeft(int []heights){
        int N= heights.length;
        int answer[]= new int[heights.length];
        Arrays.fill(answer,-1);
        Stack<Integer> st = new Stack<>();

        for(int i = N-1;i>=0;i--){

            while(!st.isEmpty() && heights[st.peek()]>heights[i]){
                answer[st.peek()]  = i ;
                st.pop();
            }
            st.push(i);


        }
        return answer;

    }
    public int [] nextsmallerRight(int []heights){
        int answer[]= new int[heights.length];
                int N= heights.length;

        Arrays.fill(answer,N);
        Stack<Integer> st = new Stack<>();

        for(int i = 0;i<N;i++){

            while(!st.isEmpty() && heights[st.peek()]>heights[i]){
                answer[st.peek()]  = i ;
                st.pop();
            }
            st.push(i);


        }
        return answer;
        
    }
    public int largestRectangleArea(int[] heights) {
        int N = heights.length;
        int left[]= nextsmallerLeft(heights);
        int right[]=nextsmallerRight(heights);
        int answer =0;
        for(int i =0;i<N;i++){
            int width = right[i] - left[i] -1;
            int area = width * heights[i];
            answer = Math.max(answer,area);

        }
        return answer;
        
    }
}