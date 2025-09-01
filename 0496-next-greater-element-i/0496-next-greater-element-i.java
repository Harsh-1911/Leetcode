class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n =  nums1.length;
        int result[] = new int[n];
        for(int i =0;i<n;i++){
            int num = nums1[i];
            int newindex2 = -1;
            for(int j =0;j<nums2.length;j++){
                if(nums2[j]==num){
                     newindex2=j;
                    break;
                }
            }
            int nextgreater = -1;
            for(int k = newindex2+1;k<nums2.length;k++ ){
                if(nums2[k]>num){
                    nextgreater = nums2[k];
                    break;
                }
            }
            result [i]= nextgreater;

        }  
        return result;      
    }
}