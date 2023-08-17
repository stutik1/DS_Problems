package TreeProblems;

import java.util.*;

public class BinaryTreeProblem {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        static int index = -1;

        public static Node buildTree(int[] nodes) {
            index++;
            if (nodes[index] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[index]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
    }

    public static void preOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public static void postOrder(Node root) {
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

    public static void levelOrder(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {
            Node currentNode = q.remove();
            if (currentNode == null) {
                System.out.println();
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                System.out.print(currentNode.data + " ");
                if (currentNode.left != null) {
                    q.add(currentNode.left);
                }
                if (currentNode.right != null) {
                    q.add(currentNode.right);
                }
            }
        }
    }

    public static int countOfNode(Node root) {
        if (root == null) {
            return 0;
        }
        int leftNode = countOfNode(root.left);
        int rightNode = countOfNode(root.right);

        return leftNode + rightNode + 1;
    }

    public static int sumOfNode(Node root) {
        if (root == null) {
            return 0;
        }

        int leftNode = sumOfNode(root.left);
        int rightNode = sumOfNode(root.right);

        return leftNode + rightNode + root.data;
    }

    public static int heightOfTree(Node root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = heightOfTree(root.left);
        int rightHeight = heightOfTree(root.right);

        return Math.max(leftHeight , rightHeight )+ 1 ;
    }

    public static int diameterOfTree(Node root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = diameterOfTree(root.left);
        int rightHeight = diameterOfTree(root.right);
        int diameter = heightOfTree(root.left) + heightOfTree(root.right) + 1;

        return diameter;
    }

    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();

        Node root = tree.buildTree(nodes);
        System.out.println("Root : " + root.data);

        preOrder(root);

        System.out.println();
        inOrder(root);

        System.out.println();
        postOrder(root);

        System.out.println();
        System.out.println("Level Order Tree :");
        levelOrder(root);

        System.out.print("");
        System.out.print("Count of nodes : " + countOfNode(root));

        System.out.println();
        System.out.println("Sum of nodes : " + sumOfNode(root));

        System.out.print("");
        System.out.println("Height of tree : " + heightOfTree(root));

        System.out.println();
        System.out.println("Diamter : " + diameterOfTree(root));

    }
}
