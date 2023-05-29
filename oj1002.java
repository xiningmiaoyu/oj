package oj;
import java.lang.*;
import java.util.Scanner;
public class oj1002{
    public static void main(String[] args){
        Scanner Sc=new Scanner(System.in);
        int a=Sc.nextInt();
        int b=Sc.nextInt();
        int c=(a+b)*(a-b);
        System.out.println(c);
    }
}