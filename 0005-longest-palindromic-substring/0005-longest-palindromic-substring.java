class Solution {
    public boolean palindome(String s){
        int n = s.length();
        int left =0;
        int right =n-1;
        while (left <right){
            if(s.charAt(left)!= s.charAt(right)){
                return false;
            }
            left ++;
            right--;
        }
        return true;
    }
    public String longestPalindrome(String s) {
        int maxlength =0;
        String big ="";
        for(int i=0;i<s.length();i++){
            for(int j =i;j<s.length();j++){
                String sub = s.substring(i,j+1);
                if(palindome(sub )&& sub.length()>maxlength){
                    maxlength = sub.length();
                    big= sub;
                }


        
            }
        }
        return big;
        
    }
}