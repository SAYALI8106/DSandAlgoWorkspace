
public class PrintNameNtimesUsingRecursion {
  public static void printName(String name, int count, int N) {
    if (count == N)
      return;

    System.out.println(name);
    printName(name, count + 1, N);

  }

  public static void main(String[] args) {
    int N = 3;
    String name = "Sayali";
    printName(name, 0, N);
  }
}
