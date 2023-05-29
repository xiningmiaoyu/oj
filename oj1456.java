package oj;
import java.lang.*;
import java.util.Arrays;
import java.util.Scanner;
public class oj1456{
    public static void main(String[] args){
    	Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
	    int a[]=new int[n];
	    for(int i=0;i<=n-1;i++){
	    	a[i]=sc.nextInt();
	    }
	    int p=sc.nextInt();
	    int j=0;
	    for(;j<=n-1;j++){
	    	if(p==a[j]){
	    		System.out.println(j+1);
	    		break;
	    	}
	    }
	    if(j>=n){
    	System.out.println(-1);
    	}
   
    }
}