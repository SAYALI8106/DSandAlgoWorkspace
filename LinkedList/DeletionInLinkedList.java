class Node {
  int data;
  Node next;

  Node(int data, Node next) {
    this.data = data;
    this.next = next;
  }

  Node(int data) {
    this.data = data;
    this.next = null;
  }
}

public class DeletionInLinkedList {
  public static void printLL(Node head) {
    Node temp = head;

    while (temp != null) {
      System.out.print(temp.data + " ");
      temp = temp.next;
    }
  }

  public static Node removeHead(Node head) {
    if (head == null)
      return null;
    head = head.next;
    return head;
  }

  public static Node removeTail(Node head) {
    if (head == null || head.next == null)
      return null;

    Node temp = head;

    while (temp.next.next != null) {
      temp = temp.next;
    }

    temp.next = null;

    return head;
  }

  public static Node deleteK(Node head, int k) {
    if (head == null) {
      return null;
    }
    if (k == 1) {
      head = head.next;
      return head;
    }

    Node temp = head;
    int cnt = 1;

    while (temp != null) {
      if (cnt == k - 1)
        break;
      cnt++;
      temp = temp.next;
    }
    // k is greater than the length
    if (temp == null || temp.next == null)
      return head;

    // delete the Kth node
    temp.next = temp.next.next;

    return head;

  }

  public static Node deleteEl(Node head, int el) {

    if (head == null) {
      return null;
    }

    if (head.data == el) {
      head = head.next;
      return head;
    }

    Node prev = null;
    Node curr = head;

    while (curr != null) {
      if (curr.data == el) {
        prev.next = prev.next.next;
        break;
      }
      prev = curr;
      curr = curr.next;
    }

    return head;

  }

  public static void main(String[] args) {
    int arr[] = { 2, 5, 8, 7 };
    Node head = new Node(arr[0]);
    Node temp = head;

    for (int i = 1; i < arr.length; i++) {
      Node node = new Node(arr[i]);
      temp.next = node;
      temp = node;
    }

    // System.out.println(head.data);
    // head = removeHead(head);
    // System.out.println(head.data);

    // head = removeTail(head);
    // printLL(head);

    // head = deleteK(head, 4);
    // printLL(head);
    head = deleteEl(head, 89);
    printLL(head);

  }
}
