package oj;
import java.lang.*;
import java.util.Arrays;
import java.util.Scanner;
public class oj1327{
    public static void main(String[] args){
    	Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		int e=sc.nextInt();
		int f=sc.nextInt();
		int y = (a*f-c*d)/(a*e-b*d);
		int x = (c-b*y)/a;
		System.out.println(x+" "+y);
		}
    }
