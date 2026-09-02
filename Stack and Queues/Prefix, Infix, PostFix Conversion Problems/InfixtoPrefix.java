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

public class InfixtoPrefix {

  public static int precedence(char ch) {

    if (ch == '^')
      return 3;

    else if (ch == '*' || ch == '/' || ch == '%')
      return 2;

    else if (ch == '+' || ch == '-')
      return 1;

    return -1;
  }

  public static String convertInfixToPrefix(String str) {

    // 1. Reverse the infix expression
    StringBuilder sb = new StringBuilder(str);
    sb.reverse();

    // 2. Swap '(' and ')'
    for (int i = 0; i < sb.length(); i++) {

      if (sb.charAt(i) == '(')
        sb.setCharAt(i, ')');

      else if (sb.charAt(i) == ')')
        sb.setCharAt(i, '(');
    }

    // 3. Convert reversed expression to postfix
    Stack<Character> stack = new Stack<>(sb.length());
    StringBuilder res = new StringBuilder();

    for (int i = 0; i < sb.length(); i++) {

      char ch = sb.charAt(i);

      // Ignore spaces
      if (ch == ' ') {
        continue;
      }

      // Operand
      if (Character.isLetterOrDigit(ch)) {
        res.append(ch);
      }

      // Opening bracket
      else if (ch == '(') {
        stack.push(ch);
      }

      // Closing bracket
      else if (ch == ')') {

        while (!stack.isEmpty() && stack.peek() != '(') {
          res.append(stack.pop());
        }

        if (!stack.isEmpty()) {
          stack.pop(); // Remove '('
        }
      }

      // Operator
      else {

        while (!stack.isEmpty() &&
            (precedence(ch) < precedence(stack.peek())
                || (precedence(ch) == precedence(stack.peek()) && ch == '^'))) {

          res.append(stack.pop());
        }

        stack.push(ch);
      }
    }

    // 4. Pop remaining operators
    while (!stack.isEmpty()) {
      res.append(stack.pop());
    }

    // 5. Reverse postfix to get prefix
    return res.reverse().toString();
  }

  public static void main(String[] args) {

    // String infix = "x + y * z / w + u";
    String infix = "a^b^c";

    String prefix = convertInfixToPrefix(infix);

    System.out.println("Infix expression: " + infix);
    System.out.println("Prefix expression: " + prefix);
  }
}
