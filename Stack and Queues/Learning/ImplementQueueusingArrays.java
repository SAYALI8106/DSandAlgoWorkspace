package Learning;

class ArrayQueue {
  int start;
  int end;
  int[] queue;
  int capacity;
  int size;

  ArrayQueue(int maxSize) {
    this.queue = new int[maxSize];
    this.capacity = maxSize;
    this.size = 0;
    this.start = -1;
    this.end = -1;
  }

  ArrayQueue() {
    this.queue = new int[100];
    this.capacity = 100;
    this.size = 0;
    this.start = -1;
    this.end = -1;
  }

  boolean isFull() {
    return size == capacity;
  }

  boolean isEmpty() {
    return size == 0;
  }

  void push(int data) {
    if (isFull()) {
      System.out.println("The queue is full...!");
      return;
    }

    // If the queue is empty, initialize start and end
    if (end == -1) {
      start = 0;
      end = 0;
    } else {
      // Circular increment of end
      end = (end + 1) % capacity;
    }

    queue[end] = data;
    size++;
  }

  int dequeue() {
    if (isEmpty()) {
      System.out.println("The queue is empty...!");
      return -1;
    }

    int popped = queue[start];

    if (size == 1) {
      start = -1;
      end = -1;
    } else {
      start = (start + 1) % capacity;
    }

    size--;
    return popped;
  }

  int peek() {
    if (isEmpty()) {
      System.out.println("The queue is empty...!");
      return -1;
    }

    return queue[start];
  }

}

public class ImplementQueueusingArrays {
  public static void main(String[] args) {
    ArrayQueue queue = new ArrayQueue();
    String[] commands = { "ArrayQueue", "push", "push",
        "peek", "pop", "isEmpty" };
    int[][] inputs = { {}, { 5 }, { 10 }, {}, {}, {} };

    for (int i = 0; i < commands.length; ++i) {
      switch (commands[i]) {
        case "push":
          queue.push(inputs[i][0]);
          System.out.print("null ");
          break;
        case "pop":
          System.out.print(queue.dequeue() + " ");
          break;
        case "peek":
          System.out.print(queue.peek() + " ");
          break;
        case "isEmpty":
          System.out.print(queue.isEmpty() ? "true " : "false ");
          break;
        case "ArrayQueue":
          System.out.print("null ");
          break;
      }
    }
  }
}
