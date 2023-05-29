package oj;
import java.lang.*;
import java.util.Arrays;
import java.util.Scanner;//java.util.*
public class oj1032 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		double a=1,b=1,c=0;
		double sum=0;
		for(int i=1;i<=n;i++){
			
			sum+=a/b;
			c=a;
			a=b;
			b=a+c;
		}
		System.out.println(String.format("%.3f",sum));
	}
}
