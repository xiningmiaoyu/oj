package oj;
import java.lang.*;
import java.util.Arrays;
import java.util.Scanner;
public class oj1511{
    public static void main(String[] args){
    	Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int sum=1;
		int a[]=new int[N];
		for(int i=0;i<=N-1;i++){
	    	a[i]=sc.nextInt();
	    }	   
		int m=sc.nextInt();
		Arrays.sort(a);
		for(int i=0;i<=N-1;i++){
			if(m<a[i]){
				sum+=1;
			}
			
		}
		System.out.println(sum);
    }
}