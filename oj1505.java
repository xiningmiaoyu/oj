package oj;
import java.lang.*;
import java.util.Arrays;
import java.util.Scanner;
public class oj1505{
	  public static void main(String[] args){
	    	Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
		    int a[]=new int[n];
		    for(int i=0;i<=n-1;i++){
		    	a[i]=sc.nextInt();
		    }
		    int x=sc.nextInt();
		    for(int i=0;i<=n-1;i++){
		    if(a[x-1]==a[i]){
		    	continue;
		    }	
		    	System.out.print(a[i]+" ");
	  }
		    
		    
}
}

