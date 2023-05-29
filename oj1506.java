package oj;
import java.lang.*;
import java.util.Arrays;
import java.util.Scanner;
public class oj1506{
    public static void main(String[] args){
    	Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
	    int a[]=new int[m+1];
	    for(int i=0;i<=m-1;i++){
	    	a[i]=sc.nextInt();
	    }	   
        a[m]=n;
	    	 Arrays.sort(a);	    	 
	    	 for(int i=0;i<=m;i++){	    	 
	    	 System.out.print(a[i]+" ");

}
    }
    }






