package oj;
import java.lang.*;
import java.util.Arrays;
import java.util.Scanner;//java.util.*
public class oj1022 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a%4==0&&a%100!=0){
        	System.out.println("Yes");
        } else if(a%400==0){
        	System.out.println("Yes");
		}else{
		System.out.println("No");
		}
	}
}