package oj;
import java.lang.*;
import java.util.Scanner;
public class oj1016{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
        if(a<b&&b<c){
            System.out.println(1);
        }else if(b<a&&a<c){
            System.out.println(2);
        }else{
            System.out.println(3);
        }
    }
}


