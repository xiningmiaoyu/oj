package oj;

import java.util.Scanner;

public class oj1305 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int i = sc.nextInt();
        int j = sc.nextInt();
        for (int a = 1; a <= N; a++) {
            if (a == N) {
                System.out.println("(" + i + "," + a + ")");
            } else {
                System.out.print("(" + i + "," + a + ")");
            }
        }

        for (int a = 1; a <= N; a++) {
            if (a == N) {
                System.out.println("(" + a + "," + j + ")");
            } else {
                System.out.print("(" + a + "," + j + ")");
            }
        }
        for (int a = 1; a <= N; a++) {
            for (int b = 1; b <= N; b++) {
                if (j - i == a - b) {
                    System.out.print("(" + b + "," + a + ")");
                }
            }
        }
        System.out.println();
        for (int a = 1; a <= N; a++) {
            for (int b = 1; b <= N; b++) {
                if (i+j == b+a ) {
                    System.out.print("(" + b + "," + a + ")");
                }
            }
        }
    }
}

