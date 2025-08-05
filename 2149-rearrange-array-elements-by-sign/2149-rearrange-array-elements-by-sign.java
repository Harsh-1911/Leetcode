class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> pos= new ArrayList<>();
         ArrayList<Integer> neg= new ArrayList<>();
         int j =0;
         while (j<n)
         {
            if(nums[j]>0){
                pos.add(nums[j]);
                j++;
            }
            else {
                neg.add(nums[j]);
                j++;
            }
         }
         int p=0;
         int q=0;
         for(int k=0;k<n;k++){
            if(k%2==0){
                nums[k]=pos.get(p);
                p++;
            }
            else {
                nums[k]=neg.get(q);
                q++;
            }
         }
         return nums ;


         

        
    }
}