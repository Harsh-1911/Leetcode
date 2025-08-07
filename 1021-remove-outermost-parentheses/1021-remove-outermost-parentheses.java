class Solution {
    public String removeOuterParentheses(String s) {
        int n = s.length();
        int count =0;
        StringBuilder result = new StringBuilder();
        for(int i =0;i<n;i++){
            char ch=s.charAt(i);
            if(ch=='('){
                if(count  > 0){
                    result.append('(');


                }
                count++;

            }
            else {
                count--;
                if(count>0){
                    result.append(')');

                }
                
            }
           
        }
         return result.toString();

        
    }
}