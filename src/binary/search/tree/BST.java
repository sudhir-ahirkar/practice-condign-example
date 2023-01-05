package binary.search.tree;

import java.util.ArrayList;

public class BST {
   static int min = Integer.MAX_VALUE;
    static Node temp;
    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node insert(Node root, int value) {
        if (root == null) {
            root = new Node(value);
            return root;
        }
        if (root.data > value) {
            root.left = insert(root.left, value);
        } else {
            root.right = insert(root.right, value);
        }
        return root;
    }

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static boolean search(Node root, int key) { //O(H) which is equal to height
        if (root == null) {
            return false;
        }
        if (root.data > key) {
            return search(root.left, key);
        } else if (root.data == key) {
            return true;
        } else {
            return search(root.right, key);
        }
    }

    public static Node delete(Node root, int val) {
        if (root.data > val) {
            root.left = delete(root.left, val);
        } else if (root.data < val) {
            root.right = delete(root.right, val);
        } else { //root.data == val
            //case 1
            if (root.left == null && root.right == null) {
                return null;
            }

            //case 2
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            //case 3
            Node IS = inorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);

        }

        return root;

    }

    public static Node inorderSuccessor(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    public static void printInRange(Node root, int x, int y) {
        if (root == null) return;
        if (root.data >= x && root.data <= y) {
            printInRange(root.left, x, y);
            System.out.print(root.data + " ");
            printInRange(root.right, x, y);
        } else if (root.data >= y) {
            printInRange(root.left, x, y);
        } else {
            printInRange(root.right, x, y);
        }
    }

    public static void printPathRoot2Leaf(Node root, ArrayList<Integer> path) {
        if (root == null)
            return;
        path.add(root.data);
        if (root.left == null && root.right == null) { // leaf
            printPath(path);
        } else {  //non leaf
            printPathRoot2Leaf(root.left, path);
            printPathRoot2Leaf(root.right, path);
        }

        path.remove(path.size() - 1);
    }

    private static void printPath(ArrayList<Integer> path) {
        path.stream().forEach(data -> {
            System.out.print(data + " ->");
        });
        System.out.println();
    }


    public static void findMinDiffNode(Node root){
        if(root == null) return;
        findMinDiffNode(root.left);
        if(temp != null) min = Math.min(min, root.data-temp.data);
        temp = root;
        findMinDiffNode(root.right);
    }

    public static void main(String[] args) {
//        int[] values = {5, 1, 3, 4, 2, 7};
//        int[] values = {8, 5, 3, 1, 4, 6, 10, 11, 14};
        int[] values = {8, 17, 80, 26, 50, 118, 35}; //for print path

        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }
        inorder(root);
        /*System.out.println();
        if (search(root, 4)) {
            System.out.println("Found data in tree");
        } else {
            System.out.println("Not found data in tree");
        }

        System.out.println("===============================");

        delete(root, 5);
        inorder(root);

        System.out.println();
        printInRange(root, 6, 10);*/
        System.out.println();
        printPathRoot2Leaf(root, new ArrayList<>());
        System.out.println();
        findMinDiffNode(root);
        System.out.println("Find minimun Difference of Node ===>"+min);

    }
}
