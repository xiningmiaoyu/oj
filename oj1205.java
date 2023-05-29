package oj;

import java.util.Scanner;

public class oj1205 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int a[][] = new int[N][N];//
        for (int i = 0; i <= N - 1; i++) {
            for (int j = 0; j <= N - 1; j++) {
                a[i][j] = sc.nextInt();//
            }
        }
        if (M == 0) {       //幂为0
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (i == j)
                        System.out.print(1 + " ");
                    else
                        System.out.print(0 + " ");
                }
                System.out.println();
            }
        } else {                             //幂不为0
            int b[][] = a;
            for (int i = 1; i < M; i++) {
                b = c(a, b);
            }
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    System.out.print(b[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
    public static int[][]c(int [][]a,int [][]b){
        int m=a.length;
        int d[][]=new int[m][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                for (int k = 0; k < m; k++) {
                    d[i][j]+=a[i][k]*b[k][j];
                }
            }
        }
        return  d;
    }
}

