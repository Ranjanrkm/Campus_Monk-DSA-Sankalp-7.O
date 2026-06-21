
// 1. We must define the TreeNode class so VS Code knows what a TreeNode is.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

// 2. Your actual solution class
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        // We start the process by looking at the entire array.
        // Left pointer is index 0, Right pointer is the last index.
        return constructBST(nums, 0, nums.length - 1);
    }
    
    // This is our helper method that handles the Divide and Conquer (Recursion)
    private TreeNode constructBST(int[] nums, int left, int right) {
        
        // BASE CASE (The emergency brake): 
        // If the left pointer crosses the right pointer, it means we have no numbers 
        // left to process in this chunk. We return null (no node created).
        if (left > right) {
            return null;
        }
        
        // Find the exact middle index of our current chunk
        int mid = left + (right - left) / 2; // (Math trick to prevent integer overflow)
        
        // Create a new node using the middle element
        TreeNode root = new TreeNode(nums[mid]);
        
        // RECURSION:
        // Build the left subtree using everything to the LEFT of 'mid'
        root.left = constructBST(nums, left, mid - 1);
        
        // Build the right subtree using everything to the RIGHT of 'mid'
        root.right = constructBST(nums, mid + 1, right);
        
        // Return the fully constructed tree node
        return root;
    }
}

// 3. The Main class to test it all
public class BSTConverter {
    
    // Helper method to print the tree in Pre-Order (Root -> Left -> Right)
    // This helps us verify our tree was built correctly in the console.
    public static void printPreOrder(TreeNode node) {
        if (node == null) {
            System.out.print("null ");
            return;
        }
        System.out.print(node.val + " ");
        printPreOrder(node.left);
        printPreOrder(node.right);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test Case 1
        int[] nums1 = {-10, -3, 0, 5, 9};
        System.out.println("Building tree for [-10, -3, 0, 5, 9]...");
        TreeNode root1 = solution.sortedArrayToBST(nums1);
        System.out.print("Pre-order traversal of result: ");
        printPreOrder(root1); 
        // Note: Pre-order will print: 0 -10 null -3 null null 5 null 9 null null
        System.out.println("\n-------------------------------------------------");

        // Test Case 2
        int[] nums2 = {1, 3};
        System.out.println("Building tree for [1, 3]...");
        TreeNode root2 = solution.sortedArrayToBST(nums2);
        System.out.print("Pre-order traversal of result: ");
        printPreOrder(root2);
        System.out.println();
    }
}