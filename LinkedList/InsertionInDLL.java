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

public class InsertionInDLL {
  public static Node converArrToDLL(int[] arr) {
    if (arr == null || arr.length == 0)
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

  public static Node insertBeforeHead(int data, Node head) {
    if (head == null) {
      return new Node(data);
    }
    Node newHead = new Node(data, head, null);
    head.back = newHead;
    return newHead;
  }

  public static Node insertAfterHead(int data, Node head) {
    if (head == null) {
      return new Node(data);
    }

    if (head.next == null) {
      head.next = new Node(data, null, head);
      return head;
    }

    Node node = new Node(data, head.next, head);
    head.next.back = node;
    head.next = node;

    return head;
  }

  public static Node insertBeforeTail(int data, Node head) {
    if (head == null) {
      return new Node(data);
    }

    if (head.next == null) {
      Node newNode = new Node(data, head, null);
      head.back = newNode;
      head.next = null;
      return newNode;
    }

    Node tail = head;

    while (tail.next != null) {
      tail = tail.next;
    }

    Node prev = tail.back;
    Node node = new Node(data, tail, prev);
    prev.next = node;
    tail.back = node;

    return head;
  }

  public static Node insertBeforeK(Node head, int data, int k) {

    if (head == null) {
      return null;
    }

    if (head.next == null && k == 1) {
      Node newNode = new Node(data, head, null);
      head.back = newNode;
      return newNode;
    }

    int cnt = 0;
    Node temp = head;

    while (temp != null) {
      cnt++;
      if (cnt == k)
        break;
      temp = temp.next;
    }

    if (temp == null)
      return head;

    Node prev = temp.back;

    if (prev == null) {
      Node newNode = new Node(data, temp, prev);
      temp.back = newNode;

      return newNode;
    }

    Node newNode = new Node(data, temp, prev);
    prev.next = newNode;
    temp.back = newNode;
    return head;
  }

  public static void insertBeforeNode(Node node, int data) {
    Node prev = node.back;
    Node newNode = new Node(data, node, prev);
    prev.next = newNode;
    node.back = newNode;
    node.back = newNode;
  }

  public static void main(String[] args) {
    int arr[] = { 1, 23, 42, 12, 3 };
    // int arr[] = null;
    // int arr[] = {};
    // int arr[] = { 1 };
    Node head = converArrToDLL(arr);
    // head = insertBeforeHead(9, head);
    // printDLL(head);
    // head = insertAfterHead(3, head);
    // printDLL(head);
    // head = insertBeforeTail(10, head);
    // printDLL(head);
    // head = insertBeforeK(head, 10, 6);
    // printDLL(head);
    insertBeforeNode(head.next, 10);
    printDLL(head);
  }
}
