package leetcode;

public class LinkedList {
    static Node head;

    static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        insert(2);
        insert(4);
        insert(4);
        insert(7);
        insert(9);
        insert(15);
        print(head);
        System.out.println();
        System.out.println("Insert the New node in Sorted LinkedList ===>");
        insertNodeInSortedList(6);
        print(head);
        System.out.println();
        ;
        System.out.println("Remove duplicate node from sorted list ==>");
        removeDuplicateNodeFromSortedList();
        print(head);
        System.out.println();
        System.out.println("Middle node of Head ==>" + middle().data);
        System.out.println("Insert at first index : ===>");
        insertAtStart(15);
        print(head);
        System.out.println();
        System.out.println("Insert at last index : ===>");
        insertAtLast(22);
        print(head);
        System.out.println();
        int insert_at_index = 2;
        System.out.println("Insert data at index : ===>" + insert_at_index);
        insertAtIndex(2, 85);
        print(head);
        System.out.println();
        int index = 2;
        System.out.println("Delete Node at  index : ===>" + index);
        deleteAtIndex(index);
        print(head);
        System.out.println();
        System.out.println("Length of head node ==>" + lengthOfNode());
        System.out.println("Search node in Head node ==>" + search(100));
        System.out.println("==============================================");

        System.out.println("Get the Last node from Head ===>");
        Node lastNode = findLastNode(head);
        System.out.println("After find last node and print complete last node ===>");
        print(lastNode);
        System.out.println();
        System.out.println("Last node element =====>"+lastNode.data);
        Node node = reverse();
        System.out.println("Reverse node element ==> ");
        print(node);
    }

    private static void insertNodeInSortedList(int data) {
        Node newNode = new Node(data);
        Node current = head;
        Node temp = null;
        while (current != null && current.data < newNode.data) {
            temp = current;
            current = current.next;
        }
        newNode.next = current;
        temp.next = newNode;
    }

    private static void removeDuplicateNodeFromSortedList() {
        Node current = head;
        while (current != null && current.next != null) {
            if (current.data == current.next.data) {
                current.next = current.next.next;
            }
            current = current.next;
        }

    }

    private static void insert(int data) {
        Node node = new Node(data);
        Node current = head;
        if (current == null) {
            head = node;
        } else {
            while (current.next != null) {
                current = current.next;
            }
            current.next = node;
        }
    }

    private static void print(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.print("null");
    }

    static void insertAtStart(int data) {
        Node node = new Node(data);
        node.next = head;
        head = node;
    }

    static void insertAtLast(int data) {
        Node node = new Node(data);
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = node;
    }

    static void insertAtIndex(int index, int data) {
        Node newNode = new Node(data);
        Node current = head;
        for (int i = 0; i < index - 1; i++) {
//            if(current.next!=null){
            current = current.next;
//            }
        }
        newNode.next = current.next;
        current.next = newNode;
    }

    static void deleteAtIndex(int index) {
        Node current = head;
        Node dummyNode = null;
        for (int i = 0; i < index - 1; i++) {
            if (current.next != null) {
                current = current.next;
            }
        }
        dummyNode = current.next;
        current.next = dummyNode.next;
    }

    static int lengthOfNode() {
        Node current = head;
        int count = 0;
        while (current != null) {
            current = current.next;
            count++;
        }
        return count;
    }

    static boolean search(int data) {
        boolean isNodeAvailable = false;
        Node current = head;
        while (current != null) {
            if (current.data == data) {
                isNodeAvailable = true;
            }
            current = current.next;
        }
        return isNodeAvailable;
    }

    static Node reverse() {
        Node current = head;
        Node previous = null;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }

    static Node middle() {
        Node fstNode = head;
        Node slwNode = head;
        while (fstNode != null && fstNode.next != null) {
            slwNode = slwNode.next;
            fstNode = fstNode.next.next;
        }
        return slwNode;
    }

    static Node findLastNode(Node node) {
        Node temp = null;
        while(node!=null){
            temp = node;
            node = node.next;
        }
        return temp;
    }

}
