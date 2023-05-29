package oj;
import java.lang.*;
import java.util.Scanner;//java.util.*
public class oj1004 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int a=num%10;//bai
		int b=num%100/10;//shi
		int c=num%1000/100;//ge
		
		System.out.println(num+100*a+10*b+c);
	}

}
