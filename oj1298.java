package oj;
import java.lang.*;
import java.util.Arrays;
import java.util.Scanner;
public class oj1298{
    public static void main(String[] args){
    	Scanner sc=new Scanner(System.in);
    	int a[][]= new int[3][4];
    	for(int i=0;i<=2;i++){
    		for(int j=0;j<=3;j++){
    			a[i][j]=sc.nextInt();
    		}
    	}
    	//
    	int max=Math.abs(a[0][0]);
    	for(int i=0;i<=2;i++){
    		for(int j=0;j<=3;j++){
    			if(Math.abs(a[i][j])>max){
    				max=Math.abs(a[i][j]);
    				}
    		}
    	}
     label:for(int i=0;i<=2;i++){
    		for(int j=0;j<=3;j++){
    			if(Math.abs(a[i][j])==max){
    				System.out.print(a[i][j]);System.out.print(" ");
    				System.out.print(i+1);System.out.print(" ");
    				System.out.print(j+1);
    				break label;
    			}
    		}
    	}
    }
}
    		