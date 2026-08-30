class Node {
  int data;
  Node next;

  Node(int data) {
    this.data = data;
    this.next = null;
  }

}

class LinkedListStack {
  Node top;
  int size;

  LinkedListStack() {
    this.top = null;
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

    if (top == null) {
      top = node;
    } else {
      node.next = top;
      top = node;
    }

    size++;

  }

  int pop() {

    if (isEmpty()) {
      System.out.println("Stack is empty cannot pop...!");
      return -1;
    }

    int popped = top.data;
    top = top.next;

    size--;

    return popped;

  }

  int top() {

    if (isEmpty()) {
      System.out.println("Stack is empty cannot get the top element...!");
      return -1;
    }

    return top.data;
  }
}

public class ImplementstackusingLinkedlist {
  public static void main(String[] args) {
    // Creating a stack
    LinkedListStack st = new LinkedListStack();

    // Array of commands
    String[] commands = { "LinkedListStack", "push", "push",
        "pop", "top", "isEmpty" };
    // Array of inputs
    int[][] inputs = { {}, { 3 }, { 7 }, {}, {}, {} };

    for (int i = 0; i < commands.length; ++i) {
      if (commands[i].equals("push")) {
        st.push(inputs[i][0]);
        System.out.print("null ");
      } else if (commands[i].equals("pop")) {
        System.out.print(st.pop() + " ");
      } else if (commands[i].equals("top")) {
        System.out.print(st.top() + " ");
      } else if (commands[i].equals("isEmpty")) {
        System.out.print((st.isEmpty() ? "true" : "false") + " ");
      } else if (commands[i].equals("LinkedListStack")) {
        System.out.print("null ");
      }

    }
  }
}
