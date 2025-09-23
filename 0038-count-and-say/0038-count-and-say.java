class Solution {
    public String countAndSay(int n) {
        if(n==1){
            return "1";

        }
        int count =1;
        String pre= countAndSay(n-1);
        char prevous = pre.charAt(0);
        StringBuilder result = new StringBuilder();
        for(int i =1;i<pre.length();i++){
            char ch = pre.charAt(i);
            if(ch == prevous){
                count ++;
            }
            else {
                result.append(count).append(prevous);
                count=1;
                prevous = ch;


            }


        }
        result.append(count).append(prevous);
        return result.toString();

        
    }
}