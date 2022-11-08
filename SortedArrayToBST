/*
Recursive Binary Search
*/
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        TreeNode root = createTree(nums,l,r);

        return root;
    }

    private TreeNode createTree(int[] nums,int l,int r){
        if(l > r){
            return null;
        }
        int mid = (l + r) / 2;
        TreeNode newNode = new TreeNode(nums[mid]);
        newNode.left = createTree(nums,l,mid-1);
        newNode.right = createTree(nums,mid+1,r);

        return newNode;
    }
}
