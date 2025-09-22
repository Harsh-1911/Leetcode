class Solution {
    public static void reverse(String  word[],int size ){
        int n = word.length;

        int i =0;
        int j = size-1;
        while(i<j){
            String temp = word[i];
            word[i]=word[j];
            word[j]=temp;
            i++;
            j--;


        }

    }
    public String reverseWords(String s) {
        int n = s.length();
         String Currentword= "";
        String word[]= new String[n];
       
        int index =0;

        for(int i =0;i<n;i++){
            char ch = s.charAt(i);
            if(ch != ' ' ){
                Currentword = Currentword+ch;


            }
            else {
                if(!Currentword.equals("")) {
                    word[index]=Currentword;
                    Currentword="";
                    index++;


                }
            }
        }
         if(!Currentword.equals("")) {
                    word[index]=Currentword;
                 
                    index++;
         }
                    reverse(word,index);
                String ans = "";
                for(int i =0;i<index;i++){
                    ans +=word[i];
                    if(i != index -1){
                        ans += ' ';
                    }

                }
                return ans;
        
    }
}