package oj;
import java.lang.*;
import java.util.Arrays;
import java.util.Scanner;
public class oj1534{
    public static void main(String[] args){
    	Scanner sc=new Scanner(System.in);
    	int n=sc.nextInt();
    	if(n==0||n==1){
    		System.out.print('N');
    	}else{
    		int i;
    		for(i=2;i<=n-1;i++){
    			if(n%i==0){
    				System.out.print('N');
    				break;
    			}
    		}
    		if(i>=n-1){
    			System.out.print('Y');
    		}
    	}
    }
}