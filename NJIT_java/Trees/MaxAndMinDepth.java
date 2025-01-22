import java.util.LinkedList;
import java.util.Stack;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class MaxAndMinDepth {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(50);
        BinaryInsert.insertNode(root, 45);
        BinaryInsert.insertNode(root, 55);
        BinaryInsert.insertNode(root, 40);
        BinaryInsert.insertNode(root, 60);
        BinaryInsert.insertNode(root, 61);
        BinaryInsert.insertNode(root, 30);
        BinaryInsert.insertNode(root, 67);
        BinaryInsert.insertNode(root, 42);
        BinaryInsert.insertNode(root, 56);
        
        int maxDepthOfTree = maxDepth(root);
        System.out.println("maxDepthOfTree: "+maxDepthOfTree);

        int minDepthOfTree = minDepthBFS(root);
        System.out.println("minDepthOfTree: "+minDepthOfTree);

    }

    /*
    Here we want to find the longest path to a leaf node. 
    We can think of level order traversal where we find how many "levels" does this tree have
    At the last level we will grab our max depth
    */
    public static int maxDepth(TreeNode root) {
        int level = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()) {
            int size = queue.size();
            for(int i = 0; i < size; i++) {
                TreeNode node = queue.remove();
                if(node.leftChild != null) {
                    queue.add(node.leftChild);
                }
                if(node.rightChild != null) {
                    queue.add(node.rightChild);
                }
            }
            level++;
        }
        return level;
    }

    public static int minDepthBFS(TreeNode root) {
        int level = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()) {
            int size = queue.size();
            level++;
            for(int i = 0; i < size; i++) {
                TreeNode node = queue.remove();
                if(node.leftChild != null) {
                    queue.add(node.leftChild);
                }
                if(node.rightChild != null) {
                    queue.add(node.rightChild);
                }
                if(node.rightChild == null && node.leftChild == null) {
                    return level;
                }
            }
        }
        return 0;
    }
}
