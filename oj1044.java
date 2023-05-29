package oj;
import java.lang.*;
import java.util.Arrays;
import java.util.Scanner;
public class oj1044 {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<=(n-1);i++){
			int m=sc.nextInt();
			a[i]=m;
		
		}
		Arrays.sort(a);
		for(int j=0;j<=(n-1);j++){
			
		
			System.out.print(a[j]+" ");
		}
		
		
	}
}