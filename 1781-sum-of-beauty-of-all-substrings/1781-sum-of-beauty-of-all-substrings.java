class Solution {
    public static int Maxcount(int freq[]){
        int Maxcount =0;
;
        for(int i =0;i<26;i++){
            if(freq[i]!=0){
                 Maxcount=Math.max(Maxcount,freq[i]);
            }
           
        }
        return Maxcount;
    }
      public static int Mincount(int freq[]){
        int Mincount =Integer.MAX_VALUE;
        for(int i =0;i<26;i++){
             if(freq[i]!=0){
                 Mincount=Math.min(Mincount,freq[i]);

             }
            
           
        }
        return Mincount;
    }
    public int beautySum(String s) {
        int n = s.length();
        int sum =0;
        for(int i =0;i<n;i++){
            int freq[]= new int[26];
            for(int j =i;j<n;j++){
                freq[s.charAt(j)-'a']++;
                int beauty = Maxcount(freq)-Mincount(freq);
                sum += beauty;


            }
        }
        return sum ;

        
    }
}