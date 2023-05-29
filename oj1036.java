package oj;
import java.lang.*;
import java.util.Arrays;
import java.util.Scanner;
public class oj1036 {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int b=0;
		if(n>0&&n<=2000){
		for(int i=1;i<=n;i++){
		if(i%3==2&&i%5==3&&i%7==2){
			b++;
		}
		}
			System.out.println(b);
		
		}
}
}
