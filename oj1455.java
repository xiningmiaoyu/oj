package oj;
import java.lang.*;
import java.util.Scanner;
public class oj1455 {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[][]a=new int[n][];
		for(int i=0;i<a.length;i++){
			a[i]=new int[i+1];
		}
		for(int i=0;i<a.length;i++){
			a[i][0]=1;
			a[i][i]=1;		
		}
		for(int i=2;i<a.length;i++){
			for(int j=1;j<i;j++){
				a[i][j]=a[i-1][j-1]+a[i-1][j];
			}
		}
		for(int i=0;i<a.length;i++){
			for(int j=0;j<=i;j++){
				System.out.print("");
			}
			for(int j=0;j<=i;j++){
				System.out.print(String.format("%-2d",a[i][j] ));
			}
			System.out.println();
		}
	}
}