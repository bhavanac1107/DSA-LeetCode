class Solution {
    public int[] twoSum(int[] nums, int target) {
         int i,j,sum;
         for(i=0;i<nums.length;i++){
            for(j=i+1;j<nums.length;j++){
                sum=nums[i]+nums[j];
                if(sum==target){
                    return new int[]{i,j};
                }
            }
         }
         return new int[]{};
    }
}