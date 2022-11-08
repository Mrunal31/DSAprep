import java.util.HashMap;

public class SubArrayProductLessThanK {
    public static int numSubarrayProductLessThanK(int[] nums, int k) {
        int count=0,product=1;
        for(int j=0;j<nums.length;j++){
            product=1;
           for(int i=j;i<nums.length;i++){
            product = product * nums[i];
            if(product<k) count++;
            else
            break;
          }
        }
        return count;
    }

    public static int numSubarrayProductLessThanKOptimized(int[] nums, int k){
        if(k<=0) return 0;
        int count=0,product=1;
        int left=0;
        int right=0;
        while(right<nums.length){
            product = product * nums[right];

            while(product>=k){
                product /= nums[left];
                left++;
            }

            count += right-left+1;
            right++;
        }
    return count;
    }

    public static void main(String args[]){
        int[] nums={10,5,2,6};
       // numSubarrayProductLessThanK(nums, 100);
        System.out.println(numSubarrayProductLessThanK(nums, 100));
        System.out.println(numSubarrayProductLessThanKOptimized(nums,100));
    }
}
