package Learning;
import java.util.*;

class ArrayStack {
  int[] stack;
  int size;
  int top = -1;

  ArrayStack(int size) {
    this.stack = new int[size];
    this.size = size;
  }

  ArrayStack() {
    this(1000);
  }

  boolean isFull() {
    return top >= size - 1;
  }

  boolean isEmpty() {
    return top <= -1;
  }

  int size() {
    return top + 1;
  }

  void push(int data) {

    if (isFull()) {
      System.out.println("The stack is full cannot push...!");
    }

    stack[++top] = data;
  }

  int pop() {

    if (isEmpty()) {
      System.out.println("Stack is empty cannot pop...!");
      return -1;
    }

    return stack[top--];
  }

  int top() {

    if (isEmpty()) {
      System.out.println("Stack is empty cannot get the top element...!");
      return -1;
    }

    return stack[top];
  }
}

public class ImplementStackusingArrays {
  public static void main(String[] args) {
    ArrayStack stack = new ArrayStack();
    List<String> commands = Arrays.asList("ArrayStack", "push", "push", "top", "pop", "isEmpty");
    List<List<Integer>> inputs = Arrays.asList(Arrays.asList(), Arrays.asList(5), Arrays.asList(10), Arrays.asList(),
        Arrays.asList(), Arrays.asList());

    for (int i = 0; i < commands.size(); ++i) {
      switch (commands.get(i)) {
        case "push":
          stack.push(inputs.get(i).get(0));
          System.out.print("null ");
          break;
        case "pop":
          System.out.print(stack.pop() + " ");
          break;
        case "top":
          System.out.print(stack.top() + " ");
          break;
        case "isEmpty":
          System.out.print((stack.isEmpty() ? "true" : "false") + " ");
          break;
        case "ArrayStack":
          System.out.print("null ");
          break;
      }
    }
  }
}

// Time Complexity: O(1) for all operations (push, pop, top, isEmpty).

// Space Complexity: O(N), where N is the maximum capacity of the stack, as we are using an array to store the elements.
