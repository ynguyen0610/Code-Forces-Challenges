/*
Rating:
B
A

Position = 1 + num of students that rated highger
A
B

Equal: Same position

Input: 
- Num of students
- Array of ratings

Output:
- Array of positions 

5
3 5 3 4 5

Sorted:
3 3 4 5 5
1 1 3 4 4

Output: 4 1 4 3 1
student 1: 3
--> 1 + 3 = 4
student 2: 5
--> place: 1 + 0 = 1
student 3: 3
--> place: 1 + 3 = 4
student 4: 4
--> place: 1 + 2 = 3
student 5: 5
--> place: 1 + 0 = 1

Idea:
- For each student, search for the numbers that are lower than them
store that number in a variable count 
if a[i + 1] < a[i] || a[i - 1] < a[i]: count +1

*/

import java.util.*;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numStudents = sc.nextInt();
    int[] ratings = new int[numStudents];
    int[] positions = new int[numStudents];
    for (int i = 0; i < numStudents; i++) {
      ratings[i] = sc.nextInt();
    }
    for (int i = 0; i < numStudents; i++) {
      int temp = 1; 
      for (int j = 0; j < numStudents; j++) {
        if (ratings[i] < ratings[j]) {
          temp++;
        }
      }
      System.out.println(temp + " ");
    }
  }
}
