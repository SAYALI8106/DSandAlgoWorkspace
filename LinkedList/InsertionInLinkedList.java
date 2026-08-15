class Node {
  int data;
  Node next;

  Node(int data, Node next) {
    this.data = data;
    this.next = next;
  }

  Node(int data) {
    this.data = data;
  }
}

public class InsertionInLinkedList {
  public static void printLL(Node head) {
    Node temp = head;

    while (temp != null) {
      System.out.print(temp.data + " ");
      temp = temp.next;
    }
  }

  public static Node convertToLL(int arr[]) {
    if (arr.length == 0)
      return null;

    Node head = new Node(arr[0]);
    Node mover = head;

    for (int i = 1; i < arr.length; i++) {
      Node temp = new Node(arr[i]);
      mover.next = temp;
      mover = temp;
    }

    return head;

  }

  public static Node insertHead(Node head, int data) {

    Node temp = new Node(data, head);

    return temp;
  }

  public static Node insertTail(Node head, int data) {

    if (head == null) {
      return new Node(data);
    }

    Node temp = head;
    while (temp.next != null) {
      temp = temp.next;
    }

    temp.next = new Node(data);

    return head;

  }

  public static Node insertK(Node head, int data, int k) {
    if (head == null) {
      if (k == 1) {
        return new Node(data);
      } else {
        return head;
      }
    }

    if (k == 1) {
      return new Node(data, head);
    }

    int cnt = 1;
    Node temp = head;
    while (temp != null) {

      if (cnt == k - 1) {
        Node node = new Node(data, temp.next);
        temp.next = node;
        break;
      }

      cnt++;
      temp = temp.next;
    }

    return head;
  }

  public static Node insertBeforeValue(Node head, int data, int value) {
    if (head == null) {
      return null;
    }

    if (head.data == value) {
      return new Node(data, head);
    }

    Node temp = head;

    while (temp.next != null) {
      if (temp.next.data == value) {
        Node node = new Node(data, temp.next);
        temp.next = node;
        break;
      }
      temp = temp.next;
    }

    return head;
  }

  public static void main(String[] args) {
    int arr[] = { 2, 5, 8, 7 };
    // int arr[] = {};
    Node head = convertToLL(arr);
    // head = insertHead(head, 9);
    // printLL(head);
    // head = insertTail(head, 20);
    // printLL(head);
    // head = insertK(head, 9, 2);
    // printLL(head);
    head = insertBeforeValue(head, 0, 7);
    printLL(head);
  }
}
