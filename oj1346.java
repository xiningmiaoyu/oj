package oj;
import java.lang.*;
import java.util.Arrays;
import java.util.Scanner;
public class oj1346{
    public static void main(String[] args){
    	Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<=n-1;i++){
	    	a[i]=sc.nextInt();
	    }	   
		int sum=0;
		for(int i=0;i<=n-1;i++){
			if(a[i]<=(m+30)){
				sum+=1;
			}
		}
		System.out.print(sum);
		}
    }