package oj;

import java.util.Scanner;

public class oj1683 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();//相当于数组
          int b=0,c=0;
        for (int i = 0; i <a.length() -1; i++) {
            if(a.charAt(i)==42||a.charAt(i)==43||a.charAt(i)==45||a.charAt(i)==47){//
                   b=i;c=a.length()-i-2;
                   break;
            }
        }
        int m=0,n=0;int k=0;
        for (int i = b-1; i >=0; i--) {
            m+=((int)a.charAt(i)-48)*(int)Math.pow(10,k);
                    k++;
        }
        k=0;
        for (int i = a.length()-2; i >=a.length()-c-1; i--) {
            n+=(a.charAt(i)-48)*Math.pow(10,k);
                    k++;
        }
        if(a.charAt(b)==43) System.out.println(m+n);
        else if(a.charAt(b)==45) System.out.println(m-n);
        else if(a.charAt(b)==42) System.out.println(m*n);
        else { if(m%n==0) {System.out.println(m/n);}
        else {System.out.printf("%.2f",(double)m/n);}


    }
}}
//+ - * /
//43 45 42 47