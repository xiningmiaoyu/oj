package oj;
import java.lang.*;
import java.util.Scanner;
public class oj1412 {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int a=num%10;
		int b=num%100/10;
		int c=num%1000/100;
		if (num==a*a*a+b*b*b+c*c*c){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
		
		
		
		
		
	}
}
