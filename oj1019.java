package oj; 
import java.lang.*;
import java.util.Scanner;
public class oj1019 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a>b&b>c&a-b==1&b-c==1){
			System.out.println("TRUE");
		} else if(a>c&c>b&a-c==1&c-b==1){
			 System.out.println("TRUE");
	    } else if(b>a&a>c&b-a==1&a-c==1){
	         System.out.println("TRUE");
        } else if(b>c&c>a&b-c==1&c-a==1){
	         System.out.println("TRUE");
        } else if(c>b&b>a&c-b==1&b-a==1){
		     System.out.println("TRUE");
	    } else{
		    System.out.println("FALSE");
		// TODO Auto-generated method stub
	    }
	}
}
