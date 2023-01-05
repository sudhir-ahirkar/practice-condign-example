package leetcode;

//21. Merge Two Sorted Lists

/*You are given the heads of two sorted linked lists list1 and list2.

        Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.

        Return the head of the merged linked list.

        Example 1:


        Input: list1 = [1,2,4], list2 = [1,3,4]
        Output: [1,1,2,3,4,4]
        Example 2:

        Input: list1 = [], list2 = []
        Output: []
        Example 3:

        Input: list1 = [], list2 = [0]
        Output: [0]
        */
public class Merge_Two_Sorted_Lists {
    public static void main(String[] args) {

    }

//    Definition for singly-linked list.
    static public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }


    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummyNode = new ListNode(0);
        ListNode currentNode = dummyNode;
        while (l1!=null && l2!=null){
            if(l1.val<l2.val){
                currentNode.next = l1;
                l1 = l1.next;
            }else{
                currentNode.next = l2;
                l2 = l2.next;
            }
            currentNode = currentNode.next;
        }
        currentNode.next = l1!=null?l1:l2;
        return dummyNode.next;
    }
}
