/*
Summary:
- P and V doing n chores
- P do a chores: h(a) > x
- V do b chores: h(b) < x
- n = a + b
--> Find ways to choose x

Sample:
5 2 3
6 2 3 100 1

Sorting:
i        j
1 2 3 6 100
- j moves to 3: already has a = 2, b = 3
--> found 1 value of x

array(j) - array(i) = difference

x = 3
--> a = 6 100
--> b = 1 2 3

x = 4
--> a = 6 100
--> b = 1 2 3

x = 5 
--> a = 6 100
--> b = 1 2 3

7 3 4
i           j
1 1 1 1 1 1 9

Idea:
- Sort h1, h2, h3, hi 
- The number should be between [0] and [n]
- 2 pointers 
- Go to the middle to compare values
- When the first pointer reaches position = a --> stop
- When the second pointer reaches position = b --> stop
*/

import java.util.*;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();
    int[] complex = new int[n];

    for (int i = 0; i < n; i++) {
      complex[i] = sc.nextInt();
    }

    Arrays.sort(complex);
    
    System.out.println(complex[b] - complex[b - 1]);
  }
}
