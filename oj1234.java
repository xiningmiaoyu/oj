package oj;

import java.util.Arrays;
import java.util.Scanner;

public class oj1234 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int [][] d=new int[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                d[i][j]=sc.nextInt();}
        }
        for (int i = 0; i < d.length; i++) {
            Arrays.sort(d[i]);
        }
        for (int[] row:d){
            for (int num:row){
                System.out.print(num+" ");
            }
            System.out.println();

        }
    }
}

