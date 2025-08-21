class Solution {
    public void dfs(int [][]image,int i,int j ,int color,int srcc,int n ,int m )
    {
        if(i<0||j<0||i>=n||j>=m){
            return;
        }
        if (image[i][j]!=srcc){
            return;
        }
        image[i][j]=color;
        dfs(image,i-1,j,color,srcc,n,m);
             dfs(image,i+1,j,color,srcc,n,m);
                  dfs(image,i,j-1,color,srcc,n,m);
                       dfs(image,i,j+1,color,srcc,n,m);

    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int srcc = image[sr][sc];
        int n = image.length;
        int m = image[0].length;
        if(srcc
        !=color){
            dfs(image,sr,sc,color,srcc,n,m);
        }
        return image ;

        
    }
}