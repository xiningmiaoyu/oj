package oj;
import java.lang.*;
import java.util.Scanner;
public class oj1033 {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long a,b=0;
		for(int i=1;i<=n;i++){
			a=1;
			for(int j=1;j<=i;j++){
				a*=j;
			}
			b+=a;
	}
		
		
		
		
		System.out.println(b);
	}
	}
	
