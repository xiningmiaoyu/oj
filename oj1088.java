package oj;

import java.util.Scanner;

public class oj1088 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long a=sc.nextInt();
        if (a==0){
            System.out.println(1);
        }else {
            System.out.println(2 * a);
        }
    }
}
