package leetcode;

public class BinaryTree {

    TreeNode node;
    static class TreeNode{
        TreeNode left;
        TreeNode right;
        int data;
        public TreeNode(int data){
            this.data=data;
        }
    }

    public static void main(String[] args) {
        TreeNode first = new TreeNode(1);
        TreeNode sec = new TreeNode(2);
        TreeNode third = new TreeNode(8);
        TreeNode four = new TreeNode(9);
        TreeNode fifth = new TreeNode(7);
        TreeNode sixth = new TreeNode(3);

        first.left=sec;
        first.right=third;
        sec.left=fifth;
        sec.right=four;
        four.right=sixth;
    }
}
