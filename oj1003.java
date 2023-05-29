package oj;
import java.lang.*;
import java.util.Scanner;//java.util.*
public class oj1003 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=(a*10+b)/16;
		int d=(a*10+b)%16;
		
		System.out.println(c);
		System.out.println(d);
	}

}

