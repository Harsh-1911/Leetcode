class Solution {
    public String removeKdigits(String num, int k) {
        int n = num.length();
        Stack<Character> st = new Stack<>(); 
        for(int i =0;i<n;i++){
            while(!st.isEmpty() && k>0 && st.peek()>num.charAt(i)){
                st.pop();
                k--;
            }
             st.push(num.charAt(i));
        }
             while(k>0&&!st.isEmpty()){
                st.pop();
                k--;

             }
             if(st.empty()){
                return"0";
             }
             StringBuilder result = new StringBuilder();
              while(!st.isEmpty()){
            result.append(st.pop());
        }

             result.reverse();
       String res = result.toString();
       int i =0;
       while (i < res.length() && res.charAt(i)=='0'){

        i++;
       }
        res = res.substring(i);

         if (res.length() == 0) {
            res = "0";
        }
        
        return res ;



        
       

        
    }
}