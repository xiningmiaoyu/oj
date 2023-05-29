package oj;
import java.lang.*;
import java.util.Arrays;
import java.util.Scanner;
public class oj1647{
    public static void main(String[] args){
    	Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int a[][]=new int[n][m];//
		for(int i=0;i<=n-1;i++){
			for(int j=0;j<=m-1;j++){
				a[i][j]=sc.nextInt();//
			}
			
		}
		for(int i=0;i<=n-1;i++){
			for(int j=0;j<=m-1;j++){
				System.out.print(a[i][j]);
 	if(j!=m-1)
		    		
		    	
		    	System.out.print(" ");
			}
		System.out.println("");
    }
    }
}
