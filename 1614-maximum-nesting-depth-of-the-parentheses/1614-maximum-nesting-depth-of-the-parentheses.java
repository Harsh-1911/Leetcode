class Solution {
    public int maxDepth(String s) {
        int openbracket=0;
        int result =0;
        for(int i =0;i<s.length();i++){
            if(s.charAt(i)=='('){
                openbracket++;
            }
            else  if(s.charAt(i)==')'){
                openbracket--;
            }
            result = Math.max(result,openbracket);
        }
        return result;
        
    }
}