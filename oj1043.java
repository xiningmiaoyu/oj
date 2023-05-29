package oj;
import java.lang.*;
import java.util.Arrays;
import java.util.Scanner;
public class oj1043 {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int n=0,m=num;

        while(num/2!=0){
            num=num/2;
            n++;
        }
        int num_list[]=new int[n+1];

        for(int i=0;i<=n;i++){
            num_list[i]=m%2;
            m=m/2;
        }
        for(int j=n;j>=0;j--){
            System.out.print(num_list[j]);
        }

    }
}