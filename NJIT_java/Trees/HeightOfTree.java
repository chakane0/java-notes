public class HeightOfTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(50);
        BinaryInsert.insertNode(root, 45);
        BinaryInsert.insertNode(root, 55);
        BinaryInsert.insertNode(root, 40);
        BinaryInsert.insertNode(root, 46);
       
        int height = treeHeight(root);
    }

    public static int treeHeight(TreeNode root) {
        if(root == null) return 0;
        int left = treeHeight(root.leftChild);
        int right = treeHeight(root.rightChild);
        return 1+Math.max(left,right);
    }
    
}
