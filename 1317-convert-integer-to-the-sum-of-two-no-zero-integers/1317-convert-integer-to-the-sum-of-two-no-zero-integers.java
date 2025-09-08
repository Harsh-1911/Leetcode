class Solution {
    public static boolean zero(int num){
        while(num>0){
            int lastDigit=num%10;
            if(lastDigit==0){
                return false;
            }
            num=num/10;
        }
        return true;
    }
    public int[] getNoZeroIntegers(int n) {
        int result []=new int[2];

        int i =1;
        int j = n-1;
        while(i<=j){
            int target = i+j;
            if(target==n&& zero(i)&&zero(j)){
                result[0]=i;
                result[1]=j;
                break;

            }
            i++;
            j--;
        }
        return result;

        
    }
}