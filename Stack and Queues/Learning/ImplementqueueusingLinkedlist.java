class Node {
  int data;
  Node next;

  Node(int data) {
    this.data = data;
    this.next = null;
  }

}

class LinkedListQueue {
  Node start;
  Node end;
  int size;

  LinkedListQueue() {
    this.start = this.end = null;
    this.size = 0;
  }

  boolean isEmpty() {
    return size == 0;
  }

  int size() {
    return size;
  }

  void push(int data) {

    Node node = new Node(data);

    if (start == null) {
      start = end = node;
    } else {
      end.next = node;
      end = node;
    }

    size++;

  }

  int pop() {

    if (isEmpty()) {
      System.out.println("Queue is empty");
      return -1;
    }

    int popped = start.data;
    start = start.next;
    size--;

    return popped;

  }

  int peek() {

    if (isEmpty()) {
      System.out.println("Queue is Empty");
      return -1;
    }

    return start.data;
  }
}

public class ImplementqueueusingLinkedlist {
  public static void main(String[] args) {
    // Creating a queue
    LinkedListQueue q = new LinkedListQueue();

    // Array of commands
    String[] commands = { "LinkedListQueue", "push", "push",
        "peek", "pop", "isEmpty" };
    // Array of inputs
    int[][] inputs = { {}, { 3 }, { 7 }, {}, {}, {} };

    for (int i = 0; i < commands.length; ++i) {
      if (commands[i].equals("push")) {
        q.push(inputs[i][0]);
        System.out.print("null ");
      } else if (commands[i].equals("pop")) {
        System.out.print(q.pop() + " ");
      } else if (commands[i].equals("peek")) {
        System.out.print(q.peek() + " ");
      } else if (commands[i].equals("isEmpty")) {
        System.out.print((q.isEmpty() ? "true" : "false") + " ");
      } else if (commands[i].equals("LinkedListQueue")) {
        System.out.print("null ");
      }
    }
  }
}
