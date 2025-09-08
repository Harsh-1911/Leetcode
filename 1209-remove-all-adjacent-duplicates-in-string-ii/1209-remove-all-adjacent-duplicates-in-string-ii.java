class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<ArrayList<Integer>> st = new Stack<>();
        for(int i =0; i<s.length();i++)
        {
            if(st.isEmpty())
            {
                ArrayList<Integer> currentElement = new ArrayList<>();
                currentElement.add(int)(s.charAt(i)));
                currentElement.add(1);
                st.push(newArrayList<>(currentElement));

            }
            else {
                if(st.peek).get(0) == (int)(s.charAt(i)))
                {
                    ArrayList<Integer> topElemet= st.pop();
                    int fre= topElement.get(1);
                    topElement.set(1,(fre+1));
                    st.pust(new AraayList<>(topElement));
                }
                else {
                       ArrayList<Integer> currentElement = new ArrayList<>();
                currentElement.add(int)(s.charAt(i));
                currentElement.add(1);
                st.push(newArrayList<>(currentElement));
                }

            }
            if(st.peek.get(1)==k){
                st.peek();
            }
        }
        StringBuilder s= new StringBuilder();
        while(!st.isEmpty())
        {
            ArrayList<integer>topElement = st.pop();
            int ascii-value = topElement.get(0);
            int fre = topElement.get(1);
            while(fre > 0){
                str.appened((char)( ascii-value ));
                fre__;
            }
            str.reverse();
            return str.toString();
        }
        
    }
}