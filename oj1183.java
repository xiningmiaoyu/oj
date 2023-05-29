package oj;

import java.util.Scanner;

public class oj1183 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        int sum = 0;
        for (long i = 1; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                sum += 2;
            }
        }
            if (Math.sqrt(a) % 1 != 0) {
                System.out.println(sum);
            } else if (Math.sqrt(a) % 1 == 0) {
                System.out.println(sum-1);
            }
        }
    }






