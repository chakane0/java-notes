import java.util.LinkedList;
import java.util.Stack;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/*
Pre-Order: NLR
In-Order: LNR
Post-Order: LRN
*/


public class TreeTraversals {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(40);
        BinaryInsert.insertNode(root, 30);
        BinaryInsert.insertNode(root, 50);
        BinaryInsert.insertNode(root, 10);
        BinaryInsert.insertNode(root, 35);
        BinaryInsert.insertNode(root, 45);
        BinaryInsert.insertNode(root, 60);
        BinaryInsert.insertNode(root, 31);

        // Preorder output
        List<Integer> recursivePreorder = preOrderRecursive(root);
        System.out.print("recursive pre-order: ");
        System.out.println(recursivePreorder);

        List<Integer> iterativePreOrder = preOrderIterative(root);
        System.out.print("iterative pre-order: ");
        System.out.println(iterativePreOrder + "\n");


        // In order output
        List<Integer> recursiveInOrder = inOrderRecursive(root);
        System.out.print("recursive in-order: ");
        System.out.println(recursiveInOrder);

        List<Integer> iterativeInOrder =  inOrderIterative(root);
        System.out.print("iterative in-order: ");
        System.out.println(iterativeInOrder + "\n");


        // Post order output
        List<Integer> recursivePostOrder = postOrderRecursive(root);
        System.out.print("recursive post order: ");
        System.out.println(recursivePostOrder);

        List<Integer> iterativePostOrder = postOrderIterative(root);
        System.out.print("iterative post order: ");
        System.out.println(iterativePostOrder);


        // Level Order traversal
    }

    // Pre-Order recursive
    public static List<Integer> preOrderRecursive(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        preOrderHelper(root, result);
        return result;
    }

    public static void preOrderHelper(TreeNode root, List<Integer> result) {
        if(root == null) {
            return;
        }
        result.add(root.value);
        preOrderHelper(root.leftChild, result);
        preOrderHelper(root.rightChild, result);
    }

    // Pre-Order Iterative
    /*
    1. Start off with the root TreeNode in the stack before the loop
    2. As long as the stack isnt empty and the root isnt null
    3. Pop the stack and add it to our result list -> (N)LR
    4. Check if the right child is null, if not push that node to the stack -> N(L)R
    5. Check if the left child is null, if not push that node to the stack -> NL(R)
    */
    public static List<Integer> preOrderIterative(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        stack.push(root);
        while(!stack.isEmpty() && root != null) {
            TreeNode current = stack.pop();
            result.add(current.value);

            if(current.rightChild != null) {
                stack.push(current.rightChild);
            }

            if(current.leftChild != null) {
                stack.push(current.leftChild);
            }
        }
        return result;
    }


    // In-Order recursive
    public static List<Integer> inOrderRecursive(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inOrderHelper(root, result);
        return result;
    }

    public static void inOrderHelper(TreeNode root, List<Integer> result) {
        if(root == null) {
            return;
        }
        inOrderHelper(root.leftChild, result);
        result.add(root.value);
        inOrderHelper(root.rightChild, result);
    }

    // In-Order Iterative
    public static List<Integer> inOrderIterative(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;
        while(!stack.isEmpty() || current != null) {
            while(current != null) {
                stack.push(current);
                current = current.leftChild;
            }
            current = stack.pop();
            result.add(current.value);
            current = current.rightChild;
        }
        return result;
    }

    // Post-Order Recursive
    public static List<Integer> postOrderRecursive(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        postOrderHelper(root, result);
        return result;
    }

    public static void postOrderHelper(TreeNode root, List<Integer> result) {
        if(root == null) {
            return;
        }
        postOrderHelper(root.leftChild, result);
        postOrderHelper(root.rightChild, result);
        result.add(root.value);
    }

    // Post-Order Iterative
    public static List<Integer> postOrderIterative(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        TreeNode current = root;
        stack.push(current);
        while(!stack.isEmpty() && current != null) {
            current = stack.pop();
            result.add(0, current.value);
            if(current.leftChild != null) {
                stack.push(current.leftChild);
            }
            if(current.rightChild != null) {
                stack.push(current.rightChild);
            }
        }
        return result;
    }

    // Level order traversal
    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode current = root;
        queue.add(current);
        while(!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> currentLevel = new ArrayList<>();
            for(int i = 0; i < size; i++) {
                TreeNode node = queue.remove();
                currentLevel.add(node.value);
                if(node.leftChild != null) {
                    queue.add(node.leftChild);
                }
                if(node.rightChild != null) {
                    queue.add(node.rightChild);
                }
            }
            result.add(currentLevel);
        }
        return result;
    }

}
