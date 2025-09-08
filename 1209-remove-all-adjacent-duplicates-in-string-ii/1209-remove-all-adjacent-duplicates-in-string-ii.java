class Solution {
    public String removeDuplicates(String s, int k) {
         Stack<ArrayList<Integer>> st = new Stack<>();
         for(int i =0;i<s.length();i++){
            if(st.isEmpty()){
                ArrayList<Integer>currentElement=new ArrayList<>();
                currentElement.add((int)(s.charAt(i)));
                currentElement.add(1);
                st.push(new ArrayList<Integer>(currentElement));
            }
            else {
                if(st.peek().get(0)==s.charAt(i)){
                    ArrayList<Integer>topElement= st.pop();
                    int fre = topElement.get(1);
                    topElement.set(1,(fre+1));
                    st.push(new ArrayList<>(topElement));



                }
                else{
                    ArrayList<Integer>currentElement=new ArrayList<>();
                currentElement.add((int)(s.charAt(i)));
                currentElement.add(1);
                st.push(new ArrayList<Integer>(currentElement));
                }

            }
            if(st.peek().get(1)==k){
                st.pop();
            }
         }
         StringBuilder str = new StringBuilder();
         while(!st.isEmpty()){
            ArrayList<Integer> topElement= st.pop();
            int ascii_val=topElement.get(0);

            int freq=(topElement.get(1));
            while(freq>0)
            {
                str.append((char)(ascii_val));
                freq--;
            }

            
         }
         str.reverse();
        return str.toString();
        
    }
} 