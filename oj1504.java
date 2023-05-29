package oj;
import java.lang.*;
import java.util.Arrays;
import java.util.Scanner;
public class oj1504{
	  public static void main(String[] args){
	    	Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
		    int a[]=new int[n];
		    for(int i=0;i<=n-1;i++){
		    	a[i]=sc.nextInt();
		    }
		    int x=sc.nextInt();
		    int y=sc.nextInt();
		    for(int i=0;i<=n-1;i++){
		    if(i==x-1){
		    	System.out.print(y);
	    	    System.out.print(" ");
		    }	
		    	
		    	
		    	System.out.print(a[i]);
		    	if(i==n-1){
		    		
		    	}else{
		    	System.out.print(" ");
		    }
	  }
}
}