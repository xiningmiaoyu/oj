package oj;
import java.lang.*;
import java.util.Arrays;
import java.util.Scanner;//java.util.*
public class oj1030 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		double sum=0;
		for(int i=1;i <= n;i++){
				sum+=1.0/i;}
		System.out.println(String.format("%.3f",sum));
	}
}