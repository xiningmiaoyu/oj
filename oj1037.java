package oj;
import java.lang.*;
import java.util.Arrays;
import java.util.Scanner;
public class oj1037{
    public static void main(String[] args){
        int a,b,c,d;
        for(int i=1000;i<=9999;i++){
            a=i%10000/1000;
            b=i%1000/100;
            c=i%100/10;
            d=i%10;
            int sum=((10*a+b)+(10*c+d))*((10*a+b)+(10*c+d));
            if(sum==i){
                System.out.println(sum);
            }
        }
    }
}