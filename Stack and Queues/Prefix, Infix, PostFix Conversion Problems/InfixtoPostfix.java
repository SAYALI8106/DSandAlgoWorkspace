class Stack<T> {
  T[] stack;
  int top;
  int size;
  int capacity;

  @SuppressWarnings("unchecked")
  Stack(int capacity) {
    this.stack = (T[]) new Object[capacity];
    this.capacity = capacity;
    this.top = -1;
    this.size = 0;
  }

  boolean isFull() {
    return top == capacity - 1;
  }

  boolean isEmpty() {
    return size == 0;
  }

  void push(T element) {
    if (isFull()) {
      System.out.println("Stack Overflow");
      return;
    }

    stack[++top] = element;
    size++;
  }

  T pop() {
    if (isEmpty()) {
      System.out.println("Stack Underflow");
      return null;
    }

    size--;
    return stack[top--];
  }

  T peek() {
    if (isEmpty()) {
      System.out.println("Stack Underflow");
      return null;
    }

    return stack[top];
  }

  void display() {

    for (int i = top; i >= 0; i--) {
      System.out.print(stack[i] + " ");
    }

  }

}

public class InfixtoPostfix {

  public static int precedence(char ch) {
    if (ch == '^')
      return 3;
    else if (ch == '*' || ch == '/' || ch == '%')
      return 2;
    else if (ch == '+' || ch == '-')
      return 1;

    return -1;
  }

  public static String convertInfixToPostfix(String str) {
    Stack<Character> stack = new Stack<>(str.length());

    StringBuilder res = new StringBuilder();

    for (int i = 0; i < str.length(); i++) {

      char ch = str.charAt(i);
      if (ch == ' ') {
        continue;
      }

      if (Character.isLetterOrDigit(ch)) {
        res.append(ch);
      } else if (ch == '(') {
        stack.push(ch);
      } else if (ch == ')') {

        while (!stack.isEmpty() && stack.peek() != '(') {
          res.append(stack.pop());
        }

        stack.pop();

      } else {

        while (!stack.isEmpty() &&
            (precedence(ch) < precedence(stack.peek())
                || (precedence(ch) == precedence(stack.peek()) && ch != '^'))) {

          res.append(stack.pop());
        }

        stack.push(ch);
      }
    }

    return res.toString();
  }

  public static void main(String[] args) {

    String infix = "a + b * (c^d - e) ^ (f + g * h) - i";
    String postfix = convertInfixToPostfix(infix);

    System.out.println("The postfix expression is: " + postfix);
  }

}
