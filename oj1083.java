package oj;
import java.lang.*;
import java.util.Arrays;
import java.util.Scanner;
public class oj1083 {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		long m=sc.nextInt(),n=sc.nextInt(),h=sc.nextInt();
		long a=m-n,b=0,c=h/a;
		if(a<0){
			System.out.println("impossible");
		}else{
			for(int i=1;i<=(c+1);i++){
		b+=i;
		}
		}
			System.out.println(b);
		
		}
}

