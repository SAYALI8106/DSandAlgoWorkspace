class Node {
  int data;
  Node next;
  Node back;

  Node(int data, Node next, Node back) {
    this.data = data;
    this.next = next;
    this.back = back;
  }

  Node(int data) {
    this.data = data;
    this.next = null;
    this.back = null;
  }
}

public class DoublyLinkedList {

  public static Node converArrToDLL(int[] arr) {
    if (arr.length == 0)
      return null;

    Node head = new Node(arr[0]);
    Node prev = head;

    for (int i = 1; i < arr.length; i++) {
      Node temp = new Node(arr[i], null, prev);
      prev.next = temp;
      prev = temp;
    }

    return head;

  }

  public static void printDLL(Node head) {
    while (head != null) {
      System.out.print(head.data + " ");
      head = head.next;
    }
  }

  public static Node deleteHead(Node head) {
    // if head is null or there is only one element simply delete that node and
    // return
    if (head == null || head.next == null)
      return null;
    Node prev = head;
    head = head.next;

    head.back = null;
    prev.next = null;

    return head;
  }

  public static Node deleteTail(Node head) {
    if (head == null || head.next == null)
      return null;

    Node tail = head;

    while (tail.next != null) {
      tail = tail.next;
    }

    Node newTail = tail.back;
    newTail.next = null;
    tail.back = null;

    return head;
  }

  public static Node deleteK(Node head, int k) {
    if (head == null) {
      return null;
    }
    int cnt = 0;
    Node temp = head;
    while (temp != null) {
      cnt++;
      if (cnt == k)
        break;
      temp = temp.next;
    }

    if (temp == null) {
      return head;
    }

    Node prev = temp.back;
    Node front = temp.next;

    if (prev == null && front == null) {
      return null;
    } else if (prev == null) {
      return deleteHead(head);
    } else if (front == null) {
      return deleteTail(head);
    }
    prev.next = front;
    front.back = prev;

    temp.next = null;
    temp.back = null;

    return head;
  }

  public static void deleteNode(Node temp) {

    Node prev = temp.back;
    Node front = temp.next;

    if (front == null) {
      prev.next = null;
      temp.back = null;
      return;
    }

    prev.next = front;
    front.back = prev;
    temp.next = null;
    temp.back = null;
    
  }

  public static void main(String[] args) {
    int arr[] = { 1, 23, 42, 12, 3 };
    // int arr[] = { };
    Node head = converArrToDLL(arr);
    // printDLL(head);
    // head = deleteHead(head);
    // printDLL(head);
    // head = deleteTail(head);
    // printDLL(head);
    // head = deleteK(head, 5);
    // printDLL(head);
    deleteNode(head.next);
    printDLL(head);
  }
}
