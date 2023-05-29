package oj;
import java.lang.*;
import java.util.Arrays;
import java.util.Scanner;
public class oj1035 {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		double q=0;
		double sum=0;
		int a[]=new int[n];
		for(int i=0;i<=(n-1);i++){
			int m=sc.nextInt();
			a[i]=m;
		}
		Arrays.sort(a);
		for(int i=1;i<=(n-2);i++){
			q+=a[i];}
		q=q/(n-2);
		System.out.println(String.format("%.2f",q));
	
}
}