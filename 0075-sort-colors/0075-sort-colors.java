class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int count1=0;
        int count2=0;
        int count3=0;
        int j =0;
        for(int i =0;i<n;i++){
            if(nums[i]==0){
                count1++;
            }
            if(nums[i]==1){
                count2++;
            }
            if(nums[i]==2){
                count3++;
            }
            
        }

        for(int i=0;i<count1;i++){
            nums[j]=0;
            j++;

        }
        for(int i=0;i<count2;i++){
            nums[j]=1;
            j++;

        }

for(int i=0;i<count3;i++){
            nums[j]=2;
            j++;

        }


        
    }
}