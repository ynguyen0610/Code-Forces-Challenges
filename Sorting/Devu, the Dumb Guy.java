import java.util.*;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numSubjects = sc.nextInt();
    int initialTime = sc.nextInt();
    long output = 0;
    int[] numChapters = new int[numSubjects];
    for (int i = 0; i < numSubjects; i++) {
      numChapters[i] = sc.nextInt();
    }
    Arrays.sort(numChapters);
    for (int i = 0; i < numSubjects; i++) {
      output += 1L * numChapters[i] * initialTime;
        if (initialTime > 1) initialTime--;
    }
    System.out.println(output);
  }
}
