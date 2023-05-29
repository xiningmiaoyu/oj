package oj;

import java.util.Scanner;

public class oj1108 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a =sc.nextLine();
        String b =sc.nextLine();
        int pos =a.indexOf(b);
        int x =0;
        while (pos!=-1){
            x++;
            a= a.substring(pos+1);
            pos=a.indexOf(b);
        }
        System.out.print(x);
    }
}
