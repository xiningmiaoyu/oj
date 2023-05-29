package oj;
import java.lang.*;
import java.util.Arrays;
import java.util.Scanner;
public class oj1054{
    public static void main(String[] args){
    	Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int d[]=new int[n];
    	int b=0,c=0;
    	for(int i=1;i<=n;i++){
    		int a=sc.nextInt();
    		if(a%2==1){
    			b+=a;
    		}else{
    			c+=a;
    		}
    	}
    	System.out.println(b);
    	System.out.println(c);
    	}
   
    	
}