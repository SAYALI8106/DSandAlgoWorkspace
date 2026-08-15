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

public class LinkedList {
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

  public static int getLengthOfLL(Node head) {
    int count = 0;
    Node temp = head;
    while (temp != null) {
      temp = temp.next;
      count++;
    }
    return count;
  }

  public static void main(String[] args) {
    int arr[] = { 2, 5, 8, 7 };
    // int arr[] = { 2 };
    // int arr[] = {};
    // Node node = new Node(arr[0]);
    // System.out.println(node);
    // System.out.println(node.next);
    // System.out.println(node.data);

    Node head = convertToLL(arr);
    // Node temp = head;

    // while (temp != null) {
    // System.out.print(temp.data + " ");
    // temp = temp.next;
    // }

    int cnt = getLengthOfLL(head);
    System.out.println("The length of the LinkedList is: " + cnt);

  }
}
