class Solution {
    List<String >answer=  new ArrayList<>();
    ArrayList<Character>Currentseq= new ArrayList<>();
    public void recursion(int index ,int sum , int l){
        if(index == l ){
            if(sum == 0){
                StringBuilder s = new StringBuilder();

                for(int i =0;i<Currentseq.size();i++){
                    s.append(Currentseq.get(i));


                }
                answer.add(s.toString());

            }
            else {

            }
            return;
        }
        if(sum < l/2){
            Currentseq.add('(');
            recursion(index +1,sum +1,l);
            Currentseq.remove(Currentseq.size()-1);

        }
        if(sum >0){
            Currentseq.add(')');
            recursion(index +1,sum -1,l);
            Currentseq.remove(Currentseq.size()-1);


        }


    }
    public List<String> generateParenthesis(int n) {
        recursion (0,0,2*n);
        return answer;

        
    }
}