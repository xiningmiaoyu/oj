package oj;

import java.util.Scanner;

public class oj1681 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String b=sc.nextLine();
        a =a.toLowerCase();
        b =b.toLowerCase();
        int pos=b.indexOf(a);
            System.out.println(pos);
        }
    }

