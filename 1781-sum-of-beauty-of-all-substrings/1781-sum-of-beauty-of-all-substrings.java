class Solution {
    public int maxcount(int freq[]){
        int maxcount=0;
        for(int i =0;i<26;i++){
        if(freq[i]!=0){
            maxcount = Math.max(maxcount ,freq[i]);
        }
        }
        return maxcount;
    }
     public int mincount(int freq[]){
        int mincount=Integer.MAX_VALUE;
        for(int i =0;i<26;i++){
        if(freq[i]!=0){
            mincount = Math.min(mincount ,freq[i]);
        }
        }
        return mincount;
    }
    public int beautySum(String s) {
        int n = s.length();
        int sum =0;
        for(int i =0;i<n;i++){
            int freq[]= new int [26];
            for(int j =i;j<n;j++){
                freq[s.charAt(j)-'a']++;
                int beauty= maxcount(freq)-mincount(freq);
                sum +=beauty;

            }
        }
        return sum;
        
        
    }
}