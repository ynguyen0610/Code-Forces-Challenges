// Codeforces
import java.util.Scanner;
import java.util.*;
import java.io.*;

public class Main {
    static class Vest {
        int soldier;
        int size;
        public Vest(int _soldier, int _size) {
            soldier = _soldier;
            size = _size;
        }
    }
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();
        ArrayList<Integer> soldierSizes = new ArrayList<>();
        ArrayList<Integer> vestSizes = new ArrayList<>();
        ArrayList<Vest> result = new ArrayList<>();  
        for (int i = 0; i < N; i++) {
            soldierSizes.add(sc.nextInt()); 
        }
        for (int i = 0; i < M; i++) {
            vestSizes.add(sc.nextInt()); 
        }

        int i = 0; // traverse soldiers sizes 
        int j = 0; // traverse vest sizes 

        while (i < N && j < M) {
            if (soldierSizes.get(i) - X <= vestSizes.get(j)
                && vestSizes.get(j) <= soldierSizes.get(i) + Y) {
                    result.add(new Vest(i + 1, j + 1));
                    i++;
                    j++;
            }
            else if (soldierSizes.get(i) + Y < vestSizes.get(j)) {
                i++;
            }
            else if (soldierSizes.get(i) - X > vestSizes.get(j)) {
                j++;
            }
        }
        System.out.println(result.size());

        for (Vest vest : result) {
            System.out.println(vest.soldier + " " + vest.size);
        }
 
        // find the difference in X 
        // find the difference in Y
        /*
        if X == 0 && Y == 0:
            Sort 
            Traverse through N and M:
            If Ai == Bi --> store the index of soldier and the index of size 
        if Ai - X > 0 && Ai + Y > 0:

        */
    }
}
/*
Python:

n, m, x, y = map(int, input().split())
a = list(map(int, input().split()))
b = list(map(int, input().split()))
v = []
i = j = 0

while i < n and j < m:
   if a[i] - x <= b[j] <= a[i] + y:
      v.append((i + 1, j + 1))
      i += 1
      j += 1
   elif a[i] + y < b[j]:
      i += 1
   elif a[i] - x > b[j]:
      j += 1

print(len(v))
for vest in v:
    print(vest[0], vest[1])
    
*/
