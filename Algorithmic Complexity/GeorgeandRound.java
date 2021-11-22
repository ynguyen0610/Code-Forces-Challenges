/*
Summary:
- >= one problem with complexity exactly A1
- >= one with complexity exactly A2
- >= AN
- Come up with new ones to make a good round
- Note that George can come up with a new problem of any complexity

Idea:
- If B[M] = A[N]: Good round +1
- If B[M] < A[N]: Need to come up new
- for loops: 
1 to traverse A[N], 1 to traverse B[M] 
- Output = total num of problems - count of good questions
- After comparing A1 with B1 --> Doesn't compare again: need a pointer
Input:
- N - min num of problems in a good round & M - num of problems George prepared
- A1, A2, A3, ... AN 
- B1, B2, B3, ... BM

Output:
- Num of problems George needs to come up with 

*/

import java.util.*;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int[] problems = new int[N];
    int[] prepared = new int[M];
    int count = 0;
    int pointer = 0;
    int output = 0;
    for (int i = 0; i < N; i++) {
      problems[i] = sc.nextInt();
    }
    for (int i = 0; i < M; i++) {
      prepared[i] = sc.nextInt();
    }
    for (int i = 0; i < N; i++) {
      while (pointer < M && i < N) { 
        if (prepared[pointer] >= problems[i]) {
          count++;
          i++;
        } 
        pointer++;
      } 
      output = N - count;
    }
    System.out.println(output);
  }
}
/*
Python:
n, m = map(int, input().split())
a = list(map(int, input().split()))
b = list(map(int, input().split()))
 
count = i = 0
 
for j in range(m):
    if i >= n:
        break
 
    if b[j] >= a[i]:
        count += 1
        i += 1
 
print(n - count)
*/
