package oj;
import java.lang.*;
import java.util.Arrays;
import java.util.Scanner;
public class oj1217{
	  public static void main(String[] args){
	    	Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			int a=0,b=0,c=0,d=0,e=0,f=0;
			int x=0;
			for(int i=10000;i<=999999;i++){
				if(i>=10000&&i<=99999){
					a=i%10;
					b=i%100/10;
					c=i%1000/100;
					d=i%10000/1000;
					e=i%100000/10000;
					if(a==e&&b==d&&a+b+c+d+e==n){
						System.out.println(i);
						x++;
						x++;
					}
				}
				if(i>=100000&&i<=999999){
					a=i%10;
					b=i%100/10;
					c=i%1000/100;
					d=i%10000/1000;
					e=i%100000/10000;
					f=i%1000000/100000;
					if(a==f&&b==e&&c==d&&a+b+c+d+e+f==n){
						System.out.println(i);
						x++;
					}
				}
			}
			if(x==0){
				System.out.print(-1);
			}

	  }
}