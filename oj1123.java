package oj;

import java.util.Scanner;

public class oj1123 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int c = 0;
        for (int i = 1; i < a - 1; i++) {
            if (a % i == 0) {
                c++;
            }
        }
        int b[] = new int[c - 1];
        int d = 0;
        for (int i = 1; i < a - 1; i++) {
            if (a % i == 0) {
                i = b[d+1];
                d++;
            }
        }
        for (int i = 0; i < d - 1; i++) {
            int e = b[i], f = 0;
            for (int j = 1; j < e; j++) {
                if (e % j == 0) f++;
            }
            if (f != 2) {
            } else {
                System.out.println(e);
            }
        }
    }
}
