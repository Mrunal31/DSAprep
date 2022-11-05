/* HARD LEVEL QUESTION LEETCODE*/
/*
Hashset approach

HashSet<Integer> set = new HashSet<>();
        for(int i : nums){
            set.add(i);
        }
        int i=1;
        while(set.contains(i)){
            i++;
        }
        return i;
*/


class Solution {
    public int firstMissingPositive(int[] nums) {        
        //1. [3,4,-1,1]
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(nums[i] <= 0 || nums[i] > n){
                nums[i] = n+1;
            }
        }

        //2. [3,4,5,1]
        for(int i=0;i<n;i++){
            int id = Math.abs(nums[i]);

            if(id > n) continue;
            id--; // as array is 0 index space

            if(nums[id] > 0) nums[id] = -nums[id];
        }
        
        //3. [-3,4,-5,-1]
        for(int i=0;i<nums.length;i++){
            if(nums[i] > 0)
            return i+1;
        }
        return nums.length + 1;
    }
}
