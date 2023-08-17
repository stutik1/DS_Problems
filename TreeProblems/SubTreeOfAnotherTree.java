//package TreeProblems;
//
//public class SubTreeOfAnotherTree {
//    static class Node {
//        int data;
//        Node left;
//        Node right;
//
//        Node(int data, Node left, Node right) {
//            this.data = data;
//            this.left = left;
//            this.right = right;
//        }
//    }
//
//    public boolean isIdentical(Node root, Node subRoot) {
//        if(subRoot == null && root == null){
//            return true;
//        }
//        if(root == null || subRoot == null){
//            return false;
//        }
//        if(root.data == subRoot.data){
//            return isIdentical(root.left, subRoot.left) && isIdentical(root.right, subRoot.right);
//        }
//        return false;
//    }
//
////    public static boolean subtree(Node root, Node subRoot) {
////        if (subRoot == null) {
////            return true;
////        }
////        if (root == null) {
////            return false;
////        }
////
////        if (root.data == subRoot.data) {
////            if (isIdentical(subRoot, root)) {
////                return true;
////            }
////        }
////
////        return isIdentical(root.left, subRoot) || isIdentical(root.right, subRoot);
////    }
//
//    public static void main(String[] args) {
//        Node root = [3, 4, 5, 1, 2];
//        int[] subRoot = {4, 1, 2};
//      //  System.out.println(SubTreeOfAnotherTree.());
//
//
//    }
//}
