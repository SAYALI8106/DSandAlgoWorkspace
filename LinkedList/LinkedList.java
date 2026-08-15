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

  public static boolean checkIfPresent(Node head, int val) {
    Node temp = head;
    while (temp != null) {
      if (temp.data == val)
        return true;
      temp = temp.next;
    }
    return false;
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

    // int cnt = getLengthOfLL(head);
    // System.out.println("The length of the LinkedList is: " + cnt);

    if (checkIfPresent(head, 2)) {
      System.out.println("The element is present");
    } else {
      System.out.println("The element is not present");

    }
  }
}

// Traversal : time -> O(n) space -> O(1)
// Length : time -> O(n) space -> O(1)
// Searching : time -> O(n) for worst case O(n/2) for the avg case if the target
// is in between and O(1) for the best case if the head itself is the target.
