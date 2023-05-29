package oj;
import java.lang.*;
import java.util.Arrays;
import java.util.Scanner;
public class oj1269{
    public static void main(String[] args){
    	Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
	    int a[]=new int[n];
	    for(int i=0;i<=n-1;i++){
	    	a[i]=sc.nextInt();
	    }	   
	    Arrays.sort(a);
	    for(int i=(n-1);i>=(n-10);i--){
            System.out.print(a[i]+" ");
    }
}
}