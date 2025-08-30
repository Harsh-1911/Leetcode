class Solution {
    public static void reverse(String word[],int size){
        int i =0; 
        int j =size-1;
        while(i<j){
            String temp = word[i];
            word[i]=word[j];
            word[j]= temp ;
            i++;
            j--;

        }


    }
    public String reverseWords(String s) {
        int n = s.length();
        String currentword ="";
        
       
        String[] word = new String[n];
        int index =0;
        for(int i =0;i<n;i++){
            char ch = s.charAt(i);
            if(ch !=' '){
                currentword = currentword + ch;
            }
    
            else {
                if(!currentword.equals("")){
                    word[index ]=currentword;
                    currentword="";
                    index++;

                }
            }
        }
          if(!currentword.equals("")){
                    word[index ]=currentword;
                    
                    index++;
          }
          reverse(word,index);
          String ans ="";
          for(int i =0;i<index;i++){
            ans +=word[i];
            if(i !=index - 1){
                ans +=" ";

            }
          }
          return ans;
    }
}
