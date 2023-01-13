package com.customlinkedlist.example;

import java.util.List;

public class LinkedList {

  Node head;

  static class Node {
    int data;
    Node next;

    // Constructor to create a new node
    // Next is by default initialized
    // as null
    public Node(int data) {
      this.data = data;
    }
  }

  public static LinkedList insert(LinkedList list, int data) {
    Node newNode = new Node(data);
    newNode.next = null;
    Node currentNode = list.head;
    if (currentNode == null) {
      list.head = newNode;
    } else {
      while (currentNode.next != null) {
        currentNode = currentNode.next;
      }
      currentNode.next = newNode;
    }
    return list;
  }

  public static void printLinkedList(LinkedList list) {
    Node currentNode = list.head;
    while (currentNode != null) {
      System.out.println(currentNode.data);
      currentNode = currentNode.next;
    }
  }

  public static void printNode(Node node) {
    Node currentNode = node;
    while (currentNode != null) {
      System.out.println(currentNode.data);
      currentNode = currentNode.next;
    }
  }

  public static void sortLinkedList(LinkedList list) {
    Node current = list.head, index = null;
    int temp;
    if (current == null) {
      return;
    } else {
      while (current.next != null) {
        index = current.next;
        while (index != null) {
          if (current.data > index.data) {
            temp = current.data;
            current.data = index.data;
            index.data = temp;
          }
          index = index.next;
        }
        current = current.next;
      }

    }

  }

  public static void insertAtStart(LinkedList list, int data) {
    Node newNode = new Node(data);
    newNode.next = list.head;
    list.head = newNode;
  }

  public static void insertAtLast(LinkedList list, int data) {
    Node newNode = new Node(data);
    newNode.next = null;
    Node last = list.head;
    while (last.next != null) {
      last = last.next;
    }
    last.next = newNode;
  }

  public static void insertAtIndex(LinkedList list, int index, int data) {
    Node newNode = new Node(data);
    Node currentNode = list.head;
    for (int i = 0; i < index - 1; i++) {
      if (currentNode.next != null) {
        currentNode = currentNode.next;
      }
    }
    newNode.next = currentNode.next;
    currentNode.next = newNode;
  }

  public static void deleteAtIndex(LinkedList list, int index) {
    Node currentNode = list.head;
    Node dummyNode=null;
    for (int i = 0; i < index - 1; i++) {
      if (currentNode.next != null) {
        currentNode = currentNode.next;
      }
    }
    dummyNode=currentNode.next;
    currentNode.next=dummyNode.next;
  }

  private static void deleteAtIndex1(LinkedList linkedList, int index) {
    Node current = linkedList.head;
    Node dummy = null;
    for (int i = 0; i < index - 1; i++) {
      if (current.next!= null) {
        current = current.next;
      }
    }
    dummy = current.next;
    current.next = dummy.next;
  }

  public static Node reverse(LinkedList linkedList) {
    Node current = linkedList.head;
    Node previous = null;
    Node next = null;
    while (current!= null) {
      next = current.next;
      current.next = previous;
      previous = current;
      current = next;
    }
    return previous;
  }

  public static void main(String args[]) {
    LinkedList linkedList = new LinkedList();
    insert(linkedList, 9);
    insert(linkedList, 7);
    insertAtStart(linkedList, 5);
    insertAtStart(linkedList, 2);
    // sortLinkedList(linkedList);
    insertAtIndex(linkedList, 2, 4);
    deleteAtIndex(linkedList, 3);
    printLinkedList(linkedList);
    System.out.println("Reverse LinkedList ===========>");
//  reverse(linkedList, 4);
    printNode(reverse(linkedList));
    System.out.println("Before Delete Node ===>");
    printLinkedList(linkedList);
    deleteAtIndex1(linkedList, 1);
    printNode(linkedList.head);

  }



}
