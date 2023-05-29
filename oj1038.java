package oj;
import java.lang.*;
import java.util.Arrays;
import java.util.Scanner;
public class oj1038{
    public static void main(String[] args){
        int a,b,c,d,e,x,y;
        for(int i=10000;i<=99999;i++){
            a=i%100000/10000;
            b=i%10000/1000;
            c=i%1000/100;
            d=i%100/10;
            e=i%10;
            x=a*100000+b*10000+c*1000+d*100+e*10+7;
            y=700000+a*10000+b*1000+c*100+d*10+e;
            if(y==4*x){
                System.out.println(x);
            }
        }
    }
}