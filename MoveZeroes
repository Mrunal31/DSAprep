/*
given arr = {0,1,0,3,12}
return {1,3,12,0,0} all zeroes to the end of the array
*/

class Solution {
    public void moveZeroes(int[] nums) {
        int index=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[index] = nums[i];
                index++;
            }
        }

        for(int i=index;i<nums.length;i++){
            nums[i] = 0;
        }
    }
}
