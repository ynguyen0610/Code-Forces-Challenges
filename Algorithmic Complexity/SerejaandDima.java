// Codeforces

import java.util.Scanner;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Integer> cards = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            cards.add(sc.nextInt());
        }
        // Take turns to take the rightmost or the leftmost card
        int i = 0;
        int j = N - 1;
        int turn = 0;
        int[] result = {0, 0};

        while (i <= j) {
            if (cards.get(i) > cards.get(j)) {
                result[turn] += cards.get(i);
                i++;
            }
            else {
                result[turn] += cards.get(j);
                j--;
            }
            turn = 1 - turn;
        }
        System.out.print(result[0] + " " + result[1]);
    }
}
