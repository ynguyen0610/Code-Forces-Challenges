// Codeforces
import java.util.*;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numBook = sc.nextInt();
    int time = sc.nextInt();
    int[] book = new int[numBook];
    int output = 0;
    int sum = 0;
    int notRead = 0;
    for (int i = 0; i < numBook; i++) {
      book[i] = sc.nextInt();
    }
    for (int i = 0; i < numBook; i++) {
      sum = sum + book[i];
      if (sum > time) {  
        sum = sum - book[notRead++];
      }
      output = Math.max(output, i - notRead + 1);
    }
    System.out.println(output);
  }
}
