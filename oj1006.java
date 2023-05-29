package oj;
import java.lang.*;
import java.util.Scanner;//java.util.*
public class oj1006 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int a=num%10;
		int b=num%100/10;
		int c=num%1000/100;
		
		System.out.println(100*a+10*b+c);
	}

}
