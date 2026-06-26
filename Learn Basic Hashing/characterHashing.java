import java.util.*;

public class characterHashing {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the string: ");
    String s = sc.next();
    // precompute for lowercase letters
    // int[] hashLowerArr = new int[26];
    // for (int i = 0; i < s.length(); i++) {
    //   hashLowerArr[s.charAt(i) - 'a'] += 1;
    // }

    // System.out.println("Enter character: ");
    // char ch = sc.next().charAt(0);
    // System.out.println(ch + " -> " + hashLowerArr[ch-'a']);

    //  // precompute for uppercase letters
    // int[] hashUpperArr = new int[26];
    // for (int i = 0; i < s.length(); i++) {
    //   hashUpperArr[s.charAt(i) - 'A'] += 1;
    // }

    // System.out.println("Enter character: ");
    // char ch2 = sc.next().charAt(0);
    // System.out.println(ch2 + " -> " + hashUpperArr[ch2-'A']);

     // precompute for uppercase and lowercase letters
    int[] hashArr = new int[256];
    for (int i = 0; i < s.length(); i++) {
      hashArr[s.charAt(i)] += 1;
    }

    System.out.println("Enter character: ");
    char ch3 = sc.next().charAt(0);
    System.out.println(ch3 + " -> " + hashArr[ch3]);
  }
}
