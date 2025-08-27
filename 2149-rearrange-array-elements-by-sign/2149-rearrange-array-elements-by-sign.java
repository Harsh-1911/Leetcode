class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=  nums.length;
        ArrayList<Integer>pos= new ArrayList<>();
                ArrayList<Integer>neg= new ArrayList<>();
                int j =0;
                while(j<n){
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
                for(int i =0;i<n;i++){
                    if(i%2==0){
                        nums[i]=pos.get(p);
                        p++;

                    }
                    else {
                        nums[i]= neg.get(q);
                        q++;
                    }
                }
                return nums;

        
    }
}