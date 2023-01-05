package binary.tree;

//https://www.youtube.com/watch?v=-DzowlcaUmE

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//What is the BFS of tree (ans: Level Order Treversal)
public class BinaryTreesYT {
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
        static int idx = -1;
        public static Node buildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
    }

    public static void preOrder(Node root) {
        if (root == null) { //base condition
            return;
        }
        System.out.print(root.data+ " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void inOrder(Node root) {
        if (root == null) { //base condition
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+ " ");
        inOrder(root.right);
    }

    public static void postOrder(Node root) {
        if (root == null) { //base condition
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+ " ");

    }

//        1
//        2 3
//        4 5 6
    public static void levelOrder(Node root) {
        if(root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        List<List<Integer>> lst_lst = new ArrayList<>();
        List<Integer> lst = null;
        while(!q.isEmpty()) {
            Node curr = q.remove();
            if(curr == null) {
                System.out.println();
                //queue empty
                if(q.isEmpty()) {
                    lst_lst.add(lst);
                    break;
                } else {
                    q.add(null);
                    lst_lst.add(lst);
                    lst=null;
                }
            } else {
                if(lst==null){
                    lst = new ArrayList<>();
                }
                lst.add(curr.data);
                System.out.print(curr.data+" ");
                if(curr.left != null) {
                    q.add(curr.left);
                }
                if(curr.right != null) {
                    q.add(curr.right);
                }
            }
        }
        System.out.println("level order ==>"+lst_lst);
    }

    public static int countOfNodes(Node root){
        if(root==null) return 0;

        int leftCount = countOfNodes(root.left);
        int rightCount = countOfNodes(root.right);
        return leftCount+rightCount+1;

    }

    public static int sumOfNodes(Node root){
        if(root==null) return 0;
        int leftSum = sumOfNodes(root.left);
        int rightSum = sumOfNodes(root.right);
        return leftSum+rightSum+root.data;
    }

    public static int heightOfNodes(Node root){
        if(root==null) return 0;
        int leftHeight = heightOfNodes(root.left);
        int rightHeight = heightOfNodes(root.right);
        return Math.max(leftHeight,rightHeight)+1;
    }

    public static int diameter(Node root) { // O(n2)
        if(root == null) {
            return 0;
        }

        int diam1 = heightOfNodes(root.left) + heightOfNodes(root.right) + 1;
        int diam2 = diameter(root.left);
        int diam3 = diameter(root.right);

        return Math.max(diam1, Math.max(diam2, diam3));
    }

    public static class TreeInfo{
        int height;
        int diam;

        TreeInfo(int height, int diam){
            this.height= height;
            this.diam = diam;
        }
    }

    public static TreeInfo diameter2(Node root) { /// O(n)
        if(root == null) {
            return new TreeInfo(0, 0);
        }

        TreeInfo leftTI = diameter2(root.left);
        TreeInfo rightTI = diameter2(root.right);

        int myHeight = Math.max(leftTI.height, rightTI.height) + 1;

        int diam1 = leftTI.height + rightTI.height + 1;
        int diam2 = leftTI.diam;
        int diam3 = rightTI.diam;

        int myDiam = Math.max(diam1, Math.max(diam2, diam3));

        return new TreeInfo(myHeight, myDiam);
    }


    public static boolean isIdentical(Node root,Node subRoot){
        if(subRoot == null && root == null){
            return true;
        }
        if(root == null || subRoot == null){
            return false;
        }
        if(root.data == subRoot.data){
            return isIdentical(root.left, subRoot.left) && isIdentical(root.right, subRoot.right);
        }
        return false;
    }

    public static boolean isSubtree(Node root, Node subRoot) {
        if(subRoot == null){
            return true;
        }
        if(root == null){
            return false;
        }
        if(isIdentical(root, subRoot)){
            return true;
        }
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }



    public static boolean pathSum(Node root, int targetSum){
        if(root==null){
            return false;
        }else if(root.left==null & root.right==null && targetSum-root.data==0){
            return true;
        }else{
            return (pathSum(root.left,targetSum-root.data) || pathSum(root.right,targetSum-root.data));
        }
    }

    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println(root.left.data);//2
        System.out.println(root.right.data);//3

        System.out.println("======== preOder =======");
        preOrder(root);
        System.out.println();
        System.out.println("======== inOder =======");
        inOrder(root);

        System.out.println();
        System.out.println("======== postOder =======");
        postOrder(root);

        System.out.println();
        System.out.println("======== levelOrder =======");
        levelOrder(root);
//        1
//        2 3
//        4 5 6

        System.out.println();
        System.out.println("======== Count of Nodes =======> "+countOfNodes(root));

        System.out.println();
        System.out.println("======== Sum of Nodes =======> "+sumOfNodes(root));

        System.out.println();
        System.out.println("======== Hieght of Nodes =======> "+heightOfNodes(root));

        System.out.println();
        System.out.println("======== Diameter =======> "+diameter(root));

        System.out.println();
        System.out.println("======== Approach 2 Diameter =======> "+diameter2(root).diam);



    }

}
