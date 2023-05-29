package oj;
import java.lang.*;
import java.util.Arrays;
import java.util.Scanner;
public class oj1034 {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<=(n-1);i++){
			int m=sc.nextInt();
			a[i]=m;
		}
		Arrays.sort(a);
		System.out.println(a[a.length-1]+" "+a[0]);
	}
}