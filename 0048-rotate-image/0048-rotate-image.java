class Solution {
    public void rotate(int[][] matrix) {
        
        int n  = matrix.length;
        for(int i=0;i<n;i++){
            for(int j =0;j<n;j++){
                if(i<j){
                      int temp = matrix[i][j];
                matrix[i][j]= matrix[j][i];
                matrix[j][i]= temp;

                }
              
                




            }
        }
        for(int k =0;k<n;k++){
            int i=0;
           int  j=n-1;
            while(i<j){
                int temmp = matrix[k][i];
                matrix[k][i]=matrix[k][j];
                matrix[k][j]= temmp;
                i++;
                j--;

            }
        }
    }
}