package oj;

import java.util.Arrays;
import java.util.Scanner;

public class oj1685 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int a[][] = new int[m][n];//
        for (int i = 0; i <= m - 1; i++) {
            for (int j = 0; j <= n - 1; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < a.length; i++) {
            Arrays.sort(a[i]);
        }
            for (int[] row : a) {            // 遍历所有行
                for (int num : row) {        // 遍历行内的所有元素
                    System.out.print(num + " ");
                }
                System.out.println();
            }
        }
    }


