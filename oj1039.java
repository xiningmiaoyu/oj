package oj;
import java.lang.*;
import java.util.Arrays;
import java.util.Scanner;
public class oj1039{
    public static void main(String[] args){
    	Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int b=0;
		
		for(int i=1;i<=N;i++){
		if(i%5==0&&(i%10==5||(i/10)%10==5||(i/100)%10==5||(i/1000)%10==5)){

			b++;
		}
		}
			System.out.println(b);
		
		}
}


