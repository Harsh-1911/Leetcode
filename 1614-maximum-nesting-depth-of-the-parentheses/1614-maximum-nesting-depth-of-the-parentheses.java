class Solution {
    public int maxDepth(String s) {
        int result = 0;
        int n = s.length();
        int openbracket=0;
        for(int i= 0;i<n;i++){
            char ch =s.charAt(i);
            if(ch =='('){
                openbracket++;
            }
            else if(ch ==')'){
                openbracket--;


            }
            result=Math.max(result,openbracket);
        }
        return result;
        
    }
}